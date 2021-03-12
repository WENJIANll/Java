package designPattern;

import java.util.Stack;

public class MementoTest {
    public static void main(String[] args) {
        Doc doc = new Doc(new Memento());
        doc.appendString("我是第一版本");
        doc.save();
        doc.appendString("增加新文字");
        doc.save();
        doc.resume();
        doc.resume();
    }
}

class Doc{
    private StringBuilder buffer = new StringBuilder();
    private Memento memento;

    public Doc(Memento memento) {
        this.memento = memento;
    }

    public void save(){
        memento.save(this.buffer.toString());
    }

    public void resume(){
        memento.resume();
    }

    public void appendString(String content){
        buffer.append(content);
    }
}

class Memento{
    private Stack<String> stack = new Stack<>();

    public void save(String content){
        stack.push(content);
    }

    public void resume(){
        System.out.println(stack.pop());
    }
}