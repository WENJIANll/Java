package designPattern;

public class FacadeTest {
    public static void main(String[] args) {
        new Facade().prove();
    }
}

class subSystem1 {
    boolean isOK() {
        return true;
    }
}

class subSystem2 {
    boolean isGoodMan() {
        return true;
    }
}

class subSystem3 {
    boolean isTrue() {
        return true;
    }
}

class Facade{
    private subSystem1 subSystem1 = new subSystem1();
    private subSystem2 subSystem2 = new subSystem2();
    private subSystem3 subSystem3 = new subSystem3();

    boolean prove(){
        return subSystem1.isOK() && subSystem2.isGoodMan() && subSystem3.isTrue();
    }
}