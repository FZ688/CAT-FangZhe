package Week1;

import java.util.Scanner;

/**
 * @author fz
 */
public class Toys extends Item{
    public Toys(){
        super();
        price = 100.0;
    }

    @Override
    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("要给萝莉斯玩什么？");
        name = sc.next();
        System.out.println("----------------------------------------------------------");
        System.out.println("萝莉斯开心地玩了"+name+"，价格为"+price+"元,"+"消耗了30.5点体力");
    }
}
