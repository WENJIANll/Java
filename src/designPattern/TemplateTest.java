package designPattern;

public class TemplateTest {
    public static void main(String[] args) {
        CookingKFC cookingKFC = new CookingKFC();
        cookingKFC.cook();
    }
}

abstract class Cooking{
    abstract void step1();
    abstract void step2();

    public void cook(){
        System.out.println("开始做饭");
        step1();
        step2();
        System.out.println("饭好了");
    }
}

class CookingKFC extends Cooking{

    @Override
    void step1() {
        System.out.println("放俩面包片");
    }

    @Override
    void step2() {
        System.out.println("在面包片之间放上鸡块");
    }
}