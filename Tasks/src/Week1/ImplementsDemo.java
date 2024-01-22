package Week1;

import java.util.Scanner;

public class ImplementsDemo {
    public static void main(String[] args) {
        Pet Lolis = new Pet();
        EatImpl Eat = new EatImpl();
        PlayImpl Play = new PlayImpl();
        Scanner sc = new Scanner(System.in);
        while(true){
            Lolis.show();
            System.out.println("1.喂食萝莉斯");
            System.out.println("2.给萝莉斯玩具");
            System.out.println("请选择(按 1 或 2)：");
            String option = sc.nextLine();
            switch (option){
                case "1":
                    Eat.eat();
                    Lolis.recoverByEat(Eat.name);
                    break;
                case "2":
                    Play.play();
                    Lolis.levelUpByPlay();
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
            System.out.println("是否继续(y/n)");
            String choice = sc.nextLine();
            if ("n".equals(choice)|| "N".equals(choice)){
                System.out.println("游戏结束");
                break;
            }
        }
    }
}
