package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.hello();
        Person person = new Person("我是name",12);
        Person person2 = new Person("wode",13);
        System.out.println(person.getName());
        person.setAge(18);
        person.printless("1","2");
        System.out.println(person2.getAge());
        System.out.println(person.getAge());
        List<Person> list = new ArrayList<>();
        list.add(new Person("wenjian",25)); // size=1
        list.add(new Person("xiaoming",22)); // size=2
        list.add(new Person("xiaohong",23)); // 允许重复添加元素，size=3
        // 如果是Person[] arr = list.toArray(new Person[5]);
        // 那么List.of(arr)会报空指针，因为list中只有三个元素，然而把他转为了包含5个元素的数组，他会用null来填充多出来的两个位置
        Person[] arr = list.toArray(new Person[3]);
        System.out.println(list.contains(new Person("wenjian",25)));
        System.out.printf("slist:" + List.of(arr)  +"%s\n","wode");
        System.out.println("list:" + list);
//        foreach(list);
//        for (String s : list){
//            System.out.println(s);
//        }
    }
    static void foreach(List<String> list){
        for (Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return calutenage();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o){
        if (o instanceof Person){
            Person p = (Person) o;
            return Objects.equals(this.name,p.name) && this.age == p.age;
        }
        return false;
    }

    private int calutenage(){
        return age + 10;
    }

    public void printless(String... line){
        System.out.println(line);
    }
}