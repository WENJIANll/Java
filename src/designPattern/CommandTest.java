package designPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {
    public static void main(String[] args) {
        SaveAndQuitBtn saveAndQuitBtn = new SaveAndQuitBtn("保存退出按钮");
        saveAndQuitBtn.setCommand(new SaveCommand());
        saveAndQuitBtn.setCommand(new QuitCommand());
        saveAndQuitBtn.doWork();
    }
}

class SaveAndQuitBtn{
    private List<Command> listCommand = new ArrayList<>();
    private String btnName;

    public SaveAndQuitBtn(String btnName){
        this.btnName = btnName;
    }

    public void setCommand(Command command){
        this.listCommand.add(command);
    }

    public void doWork(){
        for (Command command : listCommand) {
            command.execute();
        }
    }
}

interface Command{
    void execute();
}

class SaveCommand implements Command{

    @Override
    public void execute() {
        System.out.println("保存");
    }
}

class QuitCommand implements Command{

    @Override
    public void execute() {
        System.out.println("退出");
    }
}