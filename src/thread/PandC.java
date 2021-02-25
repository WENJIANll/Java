package thread;

public class PandC {
}

//生产者
class Product{

}


//消费者


//产品
class Somthing{
    int id;

}


//缓存区
class SyncContainer{

    Somthing[] somthings = new Somthing[10];

    int index = 0;

    //生产者放入产品
    public synchronized void push(Somthing somthing){
        //相等说明缓存区满了，先不需要生产了
        if (index == somthings.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            somthings[index] = somthing;
            index++;
            this.notifyAll();
        }

    }

    //消费者消费产品
    public synchronized void pop(){
        if(index == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        index--;
        notifyAll();
    }

}