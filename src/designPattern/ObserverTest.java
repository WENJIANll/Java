package designPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObserverTest {
    public static void main(String[] args) {
        Person superman = new Person("埼玉老师");
        Person kingman = new Person("最强召唤师King");
        superman.observerName = "埼玉老师";
        kingman.observerName = "最强召唤师King";
        Store store = new Store();
        store.addObserver(superman);
        store.addObserver(kingman);
        store.addNewProduct("白菜",5);
        store.changeProductPrice("白菜",2);
    }
}

class Store {
    private List<ProductObserver> observers = new ArrayList<>();
    private Map<String, Integer> products = new HashMap<>();

    // 注册观察者:
    public void addObserver(ProductObserver observer) {
        this.observers.add(observer);
    }

    public void addNewProduct(String name, Integer price) {
        products.put(name, price);
        // 通知观察者:
        observers.forEach(o -> o.onPublished(o.observerName,name));
    }

    public void changeProductPrice(String name, Integer price) {

        products.put(name,price);
        // 通知观察者:
        observers.forEach(o -> o.onPriceChanged(o.observerName,name));
    }


}

abstract class ProductObserver{
    public String observerName;
    void onPublished(String observerName,String name){
        System.out.println(observerName + name + "上架了");
    };

    void onPriceChanged(String observerName ,String name){
        System.out.println(observerName + name + "改价了");
    };

    void setObserverName(String observerName){
        this.observerName = observerName;
    }
}

class Person extends ProductObserver{
    public String personName;

    public Person(String personName) {
        this.personName = personName;
    }
}
