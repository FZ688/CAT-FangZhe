package Week1;

import java.math.BigDecimal;

/**
 * @author fz
 */
public class Pet {
    //桌宠类
    private String name ="Lolis";  //姓名
    private double money=1000; //金币，因为暂时没有打工功能，所以就先给萝莉斯点钱吧
    private int hp=100;    //血量
    private final int maxHp = 100; //最大血量
    private int level=0;   //等级
    private double stamina = 100;  //体力
    private final double maxStamina = 100; //体力上限
    private final double minStamina = 10; //体力下限1



    public Pet() {
    }

    public void show(){
        System.out.println("------------------------------------");
        System.out.println("姓名："+name);
        System.out.println("金币："+money);
        System.out.println("血量："+hp);
        System.out.println("等级："+level);
        System.out.println("体力："+stamina);
        System.out.println("------------------------------------");
    }


    //桌宠可以消耗体力(玩玩具)来提升等级，现假设消耗30.5体力提升1级,体力下限是10
    public void levelUpByPlay(){
        if (money<100) {
            System.out.println("金币不足，无法购买玩具");
            return;
        }
        this.money = this.money-100;
        this.stamina = this.stamina-30.5;
        if(this.stamina<this.minStamina){
            this.stamina = this.minStamina;
            System.out.println("体力不足，无法升级");
            return;
        }
        this.level++;
        System.out.println("恭喜升级，萝莉斯现在的等级是："+this.level);;
        System.out.println("现在的体力是："+this.stamina);
        System.out.println("-------------------------------------------------");
    }

    //桌宠可以吃东西提升血量,有些特殊食品可以恢复体力
    public void recoverByEat(String name){
        if (money<50) {
            System.out.println("金币不足，无法购买食品");
            return;
        }
        this.money = this.money-50;
        if("西冷牛排".equals(name)|| "沙拉".equals(name)){
            this.stamina = this.stamina+60;
            if (this.stamina>maxStamina) {
                this.stamina = maxStamina;
            }
            System.out.println("萝莉斯当前的体力是："+this.stamina);
            System.out.println("-------------------------------------------------");
        }else {
            this.hp = this.hp + 10;
            if (this.hp>maxHp) {
                this.hp = maxHp;
            }
            System.out.println("萝莉斯当前的血量是："+this.hp);
            System.out.println("-------------------------------------------------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getMaxStamina() {
        return maxStamina;
    }

    public double getMinStamina() {
        return minStamina;
    }
}
