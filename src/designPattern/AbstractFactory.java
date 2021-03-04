package designPattern;

//
////比如这是生产手机的工厂模式
//public class AbstractFactory {
//    //如何调用
//    public static void main(String[] args) {
//        //引用抽象工厂接收实际工厂
//        //获取华为手机
//        PhoneFactory factory = new HuaWeiFactory();
//        //引用抽象产品接收实际产品
//        Phone phone = factory.createPhone();
//
//        //获取苹果手机
//        PhoneFactory factory2 = new AppleFactory();
//        //引用抽象产品接收实际产品
//        Phone phone2 = factory2.createPhone();
//    }
//}
//
////产品接口
//interface Phone {
//}
//
////工厂接口
//interface PhoneFactory {
//    Phone createPhone();
//}
//
////实际产品
//class HuaWeiPhone implements Phone {
//}
//
////实际工厂
//class HuaWeiFactory implements PhoneFactory {
//
//    @Override
//    public Phone createPhone() {
//        //返回实际的产品
//        return new HuaWeiPhone();
//    }
//}
//
////实际产品
//class ApplePhone implements Phone {
//}
//
////实际工厂
//class AppleFactory implements PhoneFactory {
//
//    @Override
//    public Phone createPhone() {
//        //返回实际的产品
//        return new ApplePhone();
//    }
//}