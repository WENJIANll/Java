package set;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queueue {
    public static void main(String[] args) {
        // 为什么要这样定义q的类型，怎么不用下面的
        Queue<String> q = new LinkedList<>();
        // 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        // 从队列取出元素:
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // null,因为队列是空的
        // 怎么不用这个
        LinkedList<String> lq = new LinkedList<>();
        lq.offer("apple");
        lq.offer("pear");
        lq.offer("banana");
        System.out.println(lq.poll());

        // LinkedList即实现了List接口，又实现了Queue接口，但是，在使用的时候，如果我们把它当作List，就获取List的引用，如果我们把它当作Queue，就获取Queue的引用：

        // 这是一个List:
        List<String> list = new LinkedList<>();
        // 这是一个Queue:
        Queue<String> queue = new LinkedList<>();
        // 始终按照面向抽象编程的原则编写代码，可以大大提高代码的质量。
    }
}
