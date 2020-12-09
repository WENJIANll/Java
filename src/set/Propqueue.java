package set;

import java.util.*;

public class Propqueue {
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>(new Comparator<User>() {
            public int compare(User u1, User u2) {
                if (u1.number.charAt(0) == u2.number.charAt(0)) {
                    // 如果两人的号都是A开头或者都是V开头,比较号的大小:
                    return u1.number.compareTo(u2.number);
                }
                if (u1.number.charAt(0) == 'V') {
                    // u1的号码是V开头,优先级高:
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空

        // Deque<String> deque = new Deque<>();
        // 所以
        Deque<String> deque = new LinkedList<>();
        // 我们发现LinkedList真是一个全能选手，它即是List，又是Queue，还是Deque。但是我们在使用的时候，总是用特定的接口来引用它，这是因为持有接口说明代码的抽象层次更高，而且接口本身定义的方法代表了特定的用途。
        // 可见面向抽象编程的一个原则就是：尽量持有接口，而不是具体的实现类。
    }
}


class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Queue<User> q = new PriorityQueue<>(new UserComparator());
//        // 添加3个元素到队列:
//        q.offer(new User("Bob", "A1"));
//        q.offer(new User("Alice", "A2"));
//        q.offer(new User("Boss", "V1"));
//        System.out.println(q.poll()); // Boss/V1
//        System.out.println(q.poll()); // Bob/A1
//        System.out.println(q.poll()); // Alice/A2
//        System.out.println(q.poll()); // null,因为队列为空
//    }
//}
//
//class UserComparator implements Comparator<User> {
//    public int compare(User u1, User u2) {
//        if (u1.number.charAt(0) == u2.number.charAt(0)) {
//            // 如果两人的号都是A开头或者都是V开头,比较号的大小:
//            return u1.number.compareTo(u2.number);
//        }
//        if (u1.number.charAt(0) == 'V') {
//            // u1的号码是V开头,优先级高:
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//}
//
//class User {
//    public final String name;
//    public final String number;
//
//    public User(String name, String number) {
//        this.name = name;
//        this.number = number;
//    }
//
//    public String toString() {
//        return name + "/" + number;
//    }
//}