package reflection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class InvokeTest {

    public static void main(String[] args) {
            List.of("AA", "bbb", "C", "NNN")
                    .stream()
                    .filter(n -> n.length() < 2) // 去空格
                    .forEach(System.out::println); // 打印输出
//        Stream<String> naturals = Stream.of("A", "B", "C", "D"); // 不计算
//        Stream<String> s1 = naturals.limit(1); // 不计算
//        s1.forEach(System.out::println); // 计算
        //这两个效果一样
//        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
//        BiPredicate<String, String> bp1 = String::equals;
//
//        boolean bool = bp.test(new String("haaloo"),"haaloo");
//        boolean bool1 = bp1.test(new String("haaloo"),"haaloo");
//        System.out.println(bool);
//        System.out.println(bool1);
//        //使用正常的lambda
//        Consumer<String> con = x -> System.out.println(x);
//        con.accept("haaloo");
//        //Consumer中的方法体参数与返回值与System.out.println方法中的参数和返回值类型相同
//        //Consumer： void accept(T t);在这里T为String
//        //PrintStream（也就是System.out）:  public void println(String x)
//        //两者传入的参数都为String,返回值都为void，可以使用方法引用
//        Consumer<String> con1 = System.out::println;
//        con1.accept("haaloo");
    }

    public void test2(){
        //这两个效果一样
        Comparator<Integer> com = (x, y) ->Integer.compare(x, y);
        Comparator<Integer> com1 = Integer::compare;
        System.out.println(com.compare(1,2));//-1
        System.out.println(com1.compare(1,2));//-1
    }

    public static List<String> filterStr(List<String> list, Predicate<String> pre){
        ArrayList<String> arrayList = new ArrayList<>();
        for(String str:list){
            //如果符合条件
            //字符串长度大于2，就添加到输出的arrayList中
            if(pre.test(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

//    public static void main(String[] args) {
//        String newStr = strHandler("abc",(str)->str.toUpperCase());
//        System.out.println(newStr);
//        newStr = strHandler("abc",(str)->str.trim());
//        System.out.println(newStr);
//    }
//
//    public static String strHandler(String str, Function<String,String> fun){
//        return fun.apply(str);
//    }

//    public static void main(String[] args) {
//        Supplier<Integer> sup = ()->(int)(Math.random()*100);
//        ArrayList<Integer> res = getList(10,sup);
//        System.out.println(res);
//    }
//    //getList方法的第二个参数是 Supplier类型的参数，也就是接受一个函数
//    public static ArrayList<Integer> getList(int num, Supplier<Integer> sup){
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < num; i++) {
//            Integer e = sup.get();
//            list.add(e);
//        }
//        return list;
//    }

//    public static void main(String[] args) throws Exception {
////        Method animalMethod = Animal.class.getDeclaredMethod("print");
////        Method catMethod = Cat.class.getDeclaredMethod("print");
////
////        Animal animal = new Animal();
////        Cat cat = new Cat();
////        animalMethod.invoke(cat);
////        animalMethod.invoke(animal);
////
////        catMethod.invoke(cat);
////        catMethod.invoke(animal);
//        InvokeTest.test();
//
//    }
    public static void test() {
        //e是lambda表达式的参数，
        //new一个函数，使用Consumer类型变量来接收
        Consumer<String> consumer = e->System.out.println("Lambda 表达式方式，"+e);
        consumer.accept("我是参数");
        //输出
        //Lambda 表达式方式，我是参数
    }
}

class Animal {
    public void print() {
        System.out.println("Animal.print()");
    }
}

class Cat extends Animal {
    @Override
    public void print() {
        System.out.println("Cat.print()");
    }
}