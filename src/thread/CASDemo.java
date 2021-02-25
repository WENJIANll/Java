package thread;

import java.util.concurrent.atomic.AtomicInteger;

//AtomicInteger
public class CASDemo{
    public static void main(String[] args){
        //实例化一个值为2021的AtomicInteger
        AtomicInteger atomicInteger = new AtomicInteger(2021);
        //compareAndSet第一个参数是期望值，第二个参数是新值
        //比较atomicInteger的当前值和期望值是否相等，相等则更新为新值2022
        atomicInteger.compareAndSet(2021,2022);
        //输出这时atomicInteger的值
        System.out.println(atomicInteger.get());
    }
}