package designPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        new BikeDecorator(new CommonBike()).gogogo();
    }
}

interface Bike {
    void gogogo();
}

class CommonBike implements Bike {
    private String bicycleFrame;
    private String bicycleWheel;
    private String handleBars;

    CommonBike() {
        this.bicycleFrame = "车架";
        this.bicycleWheel = "车轱辘";
        this.handleBars = "车把";
    }

    @Override
    public void gogogo() {
        System.out.println("我正在骑行");
    }
}

class BikeDecorator implements Bike {
    private Bike bike;

    BikeDecorator(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void gogogo() {
        lightgogogo();
    }

    public void lightgogogo() {
        bike.gogogo();
        System.out.println("并且是开着灯的哦");
    }
}