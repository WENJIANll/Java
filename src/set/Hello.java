package set;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public void hello(){
        System.out.println("hello");
    }
    public void hello(String name){
        System.out.println("hello" + name);
    }
    public void  hello(String name,int age){
        System.out.println(age + "岁的" + name + "hello");
    }

    public static void main(String[] args) {
        List l = new ArrayList();
        int[] s = new int[1];
        l.add(1);
        System.out.println(l.get(0));
    }
}
