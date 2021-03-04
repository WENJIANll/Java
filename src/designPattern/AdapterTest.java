package designPattern;

import java.util.concurrent.Callable;

public class AdapterTest {
}

class CallTask implements Callable<String> {
    private String name;
    public CallTask(String  name) {
        this.name = name;
    }

    public String call() throws Exception {
        return "我是call";
    }
}

class RunnableAdapter implements Runnable {
    // 引用待转换接口:
    private Callable<?> callTask;

    public RunnableAdapter(Callable<?> callTask) {
        this.callTask = callTask;
    }

    // 实现指定接口:
    public void run() {
        // 将指定接口调用委托给转换接口调用:
        try {
            callTask.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
