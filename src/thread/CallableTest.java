package thread;

import java.util.concurrent.*;

public class CallableTest {
    //(1)创建ThreadLocal变量
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();


        public static void main(String[] args) {
            //在main线程中添加main线程的本地变量
            threadLocal.set("mainVal");
            //新创建一个子线程
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("子线程中的本地变量值:"+threadLocal.get());
                }
            });
            thread.start();
            //输出main线程中的本地变量值
            System.out.println("mainx线程中的本地变量值:"+threadLocal.get());
        }

//        ExecutorService executor = Executors.newFixedThreadPool(4);
//        // 定义任务:
//        Callable<String> task = new MyCallable();
//        // 提交任务并获得Future:
//        Future<String> future = executor.submit(task);
//        // 从Future获取异步执行返回的结果:
//        try {
//            String result = future.get(); // 可能阻塞
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }finally {
//            //记得最后要关闭线程池
//            executor.shutdown();
//        }
//        MyCallable myCallable = new MyCallable();
//        FutureTask futureTask = new FutureTask(myCallable);
//        new Thread(futureTask).start();
//        try {
//            String outString = ( String) futureTask.get();
//            System.out.println(outString);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }


}

class MyCallable implements Callable<String> {
    //返回值类型是String
    public String call() throws Exception {
        return "ok";
    }
}
