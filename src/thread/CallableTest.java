package thread;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        // 定义任务:
        Callable<String> task = new MyCallable();
        // 提交任务并获得Future:
        Future<String> future = executor.submit(task);
        // 从Future获取异步执行返回的结果:
        try {
            String result = future.get(); // 可能阻塞
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            //记得最后要关闭线程池
            executor.shutdown();
        }
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

}

class MyCallable implements Callable<String> {
    //返回值类型是String
    public String call() throws Exception {
        return "ok";
    }
}
