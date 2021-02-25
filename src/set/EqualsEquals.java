package set;

public class EqualsEquals {
    //==是判断两个变量或者实例是不是指向同一个内存空间
    //equals是判断两个变量或者实例指向同一个内存空间的值是不是相同
    public static void main(String[] args) {
        Integer a=new Integer(1);
        Integer b=new Integer(1);
        //Integer是int的封装类，对应的变量中存储地址
        System.out.println(a==b);//false，a,b是指向不同的对象，存储的地址肯定不一样
        System.out.println(a.equals(b));//true，虽然a,b是指向不同的内存地址，但是内存中存储的值1是相等的

        int aa=10;
        int bb=10;
        //基本类型没有equals方法，存储的不是地址，是值
        System.out.println(aa==bb);//true，10和10值相等

        String str1=new String("wenjian");
        String str2;
        //封装类型的变量存储的是地址，str2=str1就是把str1存储的地址给了str2
        //str2，str1都指向同一个地址
        str2=str1;
        System.out.println(str1==str2);//true，存储的地址相等
        System.out.println(str1.equals(str2));//true，指向地址中的值相等
    }
}
