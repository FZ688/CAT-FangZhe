package Week1;

import java.util.Scanner;

public class Food extends Item{

    //假设每一种食物价格都是50.0,能提升血量的正餐都不便宜
    //假设每吃一个非特殊食物血量都加10
    //假设每吃一个特殊食物体力加60(恢复体力)
    public Food() {
        super();
        price = 50.0;
    }

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void eat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("要喂萝莉斯吃什么？");
        name = sc.next();
        System.out.println("--------------------------------------------------------");
        System.out.println("萝莉斯开心地吃下了"+name+"，价格为"+price+"元");
        if ("西冷牛排".equals(name)|| "沙拉".equals(name)){
            System.out.println("体力+ 60点↑↑↑");
        }else {
            System.out.println("血量恢复"+10+"点↑↑↑");
        }
    }

}
