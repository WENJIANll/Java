package designPattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {
    public static void main(String[] args) {
        Container china = new Container();
        Container shandong = new Container();
        Node jinan = new Node(300000);
        Node qingdao = new Node(500000);
        shandong.add(jinan);
        shandong.add(qingdao);
        china.add(shandong);
        System.out.println(china.count());
    }
}

interface Counter{
    int count();
}

class Node implements Counter{
    private int number;

    Node(int number){
        this.number = number;
    }

    @Override
    public int count() {
        return this.number;
    }
}

class Container implements Counter{
    //需要一个数据结构存储组合Container的各个节点
    private List<Counter> list = new ArrayList<>();

    //添加节点
    void add(Counter counter){
        list.add(counter);
    }

    @Override
    public int count() {
        int sum = 0;
        for (Counter counter : list) {
            sum += counter.count();
        }
        return sum;
    }
}