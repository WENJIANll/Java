package thread;

import java.util.ArrayList;
import java.util.List;

public class Test {
    //共享变量number
    private static int number = 0;
    public static void main(String[] args) throws InterruptedException {
        //Lambda表达式写法
        Runnable increment = () -> {
            for (int i = 0;i<1000;i++){
                number++;
            }
        };

        //线程列表
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            //创建5个对number操作的线程
            Thread t = new Thread(increment);
            t.start();
            list.add(t);
        }

        for (Thread t : list) {
            //等待线程执行完成
            t.join();
        }
        //看起来应该会返回number = 5000
        //但是这段代码我们没有做任何的锁操作
        System.out.println("number = " + number);
    }
}
