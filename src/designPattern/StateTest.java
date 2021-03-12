package designPattern;

public class StateTest {
    public static void main(String[] args) {
        ContextPerson liuNengPerson = new ContextPerson();
        liuNengPerson.setState(new Happy());
        liuNengPerson.doWork();
        liuNengPerson.setState(new Sad());
        liuNengPerson.doWork();
    }
}

interface State{
    void doWork();
}

class Happy implements State{

    @Override
    public void doWork() {
        System.out.println("我感觉我好快乐，工作真不错");
    }
}

class Sad implements State{

    @Override
    public void doWork() {
        System.out.println("生而为人我很抱歉，工作好没劲");
    }
}

class ContextPerson{
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doWork(){
        state.doWork();
    }
}