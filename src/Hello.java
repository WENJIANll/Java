public class Hello {
    int s = 1;
    public void hello(){
        System.out.println("hello");
    }
    public void hello(String name){
        System.out.println("hello" + name);
    }
    public void  hello(String name,int age){
        System.out.println(age + "岁的" + name + "hello");
    }
}

