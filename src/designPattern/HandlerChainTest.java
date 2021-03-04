package designPattern;

public class HandlerChainTest {
    public static void main(String[] args) {
        Handler financeLevel1 = new FinanceLevel1();
        Handler financeLevel2 = new FinanceLevel2();
        financeLevel1.setNextLevel(financeLevel2);
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.setHeadLevel(financeLevel1);
        System.out.println(handlerChain.process(new Request(20000)));
    }
}

class Request{
    private int money;

    Request(int money){
        this.money = money;
    }

    int getMoney(){
        return this.money;
    }
}

abstract class Handler{
    private Handler nextLevel;

    public void setNextLevel(Handler nextLevel){
        this.nextLevel = nextLevel;
    }

    public Handler getNextLevel() {
        return nextLevel;
    }

    public abstract boolean process(Request request);
}

class FinanceLevel1 extends Handler{

    @Override
    public boolean process(Request request) {
        if (request.getMoney() > 1000){
            return this.getNextLevel().process(request);
        }
        return true;
    }
}

class FinanceLevel2 extends Handler{

    @Override
    public boolean process(Request request) {
        if (request.getMoney() > 10000){
            return  false;
        }
        return true;
    }
}

class HandlerChain extends Handler{
    private Handler headLevel;

    public Handler getHeadLevel() {
        return headLevel;
    }

    public void setHeadLevel(Handler headLevel) {
        this.headLevel = headLevel;
    }

    @Override
    public boolean process(Request request) {
        return headLevel.process(request);
    }
}