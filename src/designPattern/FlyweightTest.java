package designPattern;

public class FlyweightTest {
    public static void main(String[] args)  {
        Integer n1 = Integer.valueOf(100);
        Integer n2 = Integer.valueOf(100);
        System.out.println(n1 == n2); // true
    }
}

abstract class BikeFlyWeight {
    //是否骑行中，true为骑行中，false是未骑行中
    private boolean state;

    public boolean getState() {
        return state;
    }

    public void backBike() {
        state = false;
    }
}

class BikeA extends BikeFlyWeight {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}