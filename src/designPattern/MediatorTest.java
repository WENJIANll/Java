package designPattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorTest {
    public static void main(String[] args) {
        Aircraft aircraft3 = new Aircraft(3);
        Aircraft aircraft5 = new Aircraft(5);
        //3号飞机先发出降落请求，在控制中心注册，然后是5号飞机
        Mediator mediator = new Mediator();
        mediator.regist(aircraft3);
        mediator.regist(aircraft5);
        mediator.canDwon();
    }
}

class Aircraft{
    private int airId;

    Aircraft(int airId){
        this.airId = airId;
    }

    public int getAirId() {
        return airId;
    }
}

class Mediator{
    private List<Aircraft> list = new ArrayList<>();

    //飞机要降落的时候先在控制中心注册
    void regist(Aircraft aircraft){
        list.add(aircraft);
    }

    //发出哪架飞机可以降落的广播
    void canDwon(){
        System.out.println("降落顺序是：");
        for (Aircraft aircraft : list) {
            System.out.println(aircraft.getAirId() + "号飞机降落");
        }
    }
}