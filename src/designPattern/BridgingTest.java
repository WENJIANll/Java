package designPattern;

public class BridgingTest {
    public static void main(String[] args) {
        new HuaweiPhonee(new NetSale()).sale();
        new ApplePhonee(new NetSale()).sale();
        new ApplePhonee(new LocalSale()).sale();
    }
}

abstract class Phonee{
    protected SaleChannel saleChannel;
    protected String name;

    Phonee(SaleChannel saleChannel,String name){
        this.saleChannel = saleChannel;
        this.name = name;
    }

    void sale(){
        System.out.println(name);
        saleChannel.startSale();
    };
}

class HuaweiPhonee extends Phonee{

    HuaweiPhonee(SaleChannel saleChannel){
        super(saleChannel,"华为手机");
    }
//
//    @Override
//    void sale() {
//        System.out.println(name);
//        saleChannel.startSale();
//    }
}

class ApplePhonee extends Phonee{

    ApplePhonee(SaleChannel saleChannel){
        super(saleChannel,"苹果手机");
    }
//
//    @Override
//    void sale() {
//        System.out.println(name);
//        saleChannel.startSale();
//    }
}

class SanxingPhonee extends Phonee{

    SanxingPhonee(SaleChannel saleChannel){
        super(saleChannel,"三星手机");
    }

//    @Override
//    void sale() {
//        System.out.println(name);
//        saleChannel.startSale();
//    }
}


abstract class SaleChannel{
    abstract void startSale();
}

class LocalSale extends SaleChannel{
    @Override
    void startSale() {
        System.out.println("本地销售");
    }
}

class NetSale extends SaleChannel{
    @Override
    void startSale() {
        System.out.println("网络销售");
    }
}

class InnerSale extends SaleChannel{
    @Override
    void startSale() {
        System.out.println("内部销售");
    }
}