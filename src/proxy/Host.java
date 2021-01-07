package proxy;

public class Host implements Rent{
    public void rent(){
        System.out.println("房东要租房");
    }
    public void rent2(){
        System.out.println("房东要租房2222");
    }

    public static void main(String[] args) {
        Rent host = new Host();
        MyProxy myProxy = new MyProxy();
        myProxy.setTarget(host);
        Rent proxyy = (Rent) myProxy.getProxy();
        proxyy.rent();
        proxyy.rent2();
    }
}
