package designPattern;

//比如这是生产手机的工厂模式
public class FactoryMethod {
    //如何调用
    public static void main(String[] args) {
        PhoneFactory factory = PhoneFactory.getFactory();
        Phone phone = factory.createPhone();
    }
}

//产品接口
interface Phone {
}

//工厂接口
interface PhoneFactory {
    Phone createPhone();

    static HuaWeiFactory getFactory(){
        return new HuaWeiFactory();
    }

}

//实际产品
class HuaWeiPhone implements Phone{
}

//实际工厂
class HuaWeiFactory implements PhoneFactory{

    @Override
    public Phone createPhone() {
        //返回实际的产品
        return new HuaWeiPhone();
    }
}