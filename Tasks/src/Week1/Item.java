package Week1;

import java.util.Scanner;

/**
 * @author fz
 */
public class Item {
    public String name;  //物品名称
    public double price;    //物品价格

    public Item() {
    }
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void eat(){

    }
    public void play(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
