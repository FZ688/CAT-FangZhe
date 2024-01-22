package Week1;

import java.util.Scanner;

/**
 * @author fz
 */
public class EatImpl implements Eatable{
    public String name;
    @Override
    public void eat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("要喂萝莉斯吃什么？");
        name = sc.next();
        System.out.println("--------------------------------------------------------");
        System.out.println("萝莉斯开心地吃下了"+name+"，价格为50元");
        if ("西冷牛排".equals(name)|| "沙拉".equals(name)){
            System.out.println("体力+ 60点↑↑↑");
        }else {
            System.out.println("血量恢复" + 10 + "点↑↑↑");
        }
    }
}
