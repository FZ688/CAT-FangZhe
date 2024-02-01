package Week2;

import java.util.Objects;

/**
 * @author fz
 */
public class Pet {
    //桌宠类
    private String name;
    private int money;
    private int hp;
    private int maxHp;
    private double exp;
    private int level;
    private double stamina;
    private double minStamina;
    private double maxStamina;

    private boolean isWorking = false; //是否正在工作

    private long startTime; //记录工作开始时间的
    public Pet() {
    }

    public Pet(String name, int money, int hp, int maxHp, double exp, int level, double stamina, double minStamina, double maxStamina) {
        this.name = name;
        this.money = money;
        this.hp = hp;
        this.maxHp = maxHp;
        this.exp = exp;
        this.level = level;
        this.stamina = stamina;
        this.minStamina = minStamina;
        this.maxStamina = maxStamina;
    }

    public void work() {
        if (stamina < 10) {
            System.out.println("体力不足，无法工作");
            return;
        }
        startTime = System.currentTimeMillis(); //记下初始工作时间
        isWorking = true;   //设定为工作状态
        System.out.println("开始工作~");
    }


    /*
    * 这里工作获取的金币是工作秒数✖1000(主要是为了快速见效)；
    *       消耗的体力是工作描述✖8.5
    * */
    public void stopWork() {
        long endTime = System.currentTimeMillis();
        long workTime = (endTime - startTime) / 1000;
        if (workTime <= 0) {
            System.out.println("工作时间不能为零");
            return;
        }
        stamina -= workTime * 8.5;
        money += workTime * 100;
        isWorking = false;
        System.out.println("工作结束，共获得金币：" + workTime * 100);
    }

    /*
    * 这里吃回血食物：血量回复值由对象的属性值决定
    *              消耗的金币是血量回复值✖10
    *
    * 吃回体力食物：体力回复值由对象的属性值决定
    *            消耗的金币是体力回复值✖10
    * */
    public void eat(Food food) {
        if (food.getType() == FoodType.HP) {
            hp += food.getValue();
            money -= food.getValue()*10;
            if (hp > maxHp) {
                hp = maxHp;
            }
        } else if (food.getType() == FoodType.STAMINA) {
            stamina += food.getValue();
            money -= food.getValue()*10;
            if (stamina > maxStamina) {
                stamina = maxStamina;
            }
        }
    }


    /*
    * 这里的道具：消耗金币为获取经验量✖10
    *           经验上限是当前等级✖100，突破上限会升级
    * */
    public void useItem(Item item) {
        money -= item.getValue()*10;
        exp += item.getValue();
        //判断是否满足升级条件
        if (exp >= 100 * level) {
            exp -=100*level;
            level++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
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

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
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

    public double getMinStamina() {
        return minStamina;
    }

    public void setMinStamina(double minStamina) {
        this.minStamina = minStamina;
    }

    public double getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(double maxStamina) {
        this.maxStamina = maxStamina;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return money == pet.money && hp == pet.hp && maxHp == pet.maxHp && Double.compare(exp, pet.exp) == 0 && level == pet.level && Double.compare(stamina, pet.stamina) == 0 && Double.compare(minStamina, pet.minStamina) == 0 && Double.compare(maxStamina, pet.maxStamina) == 0 && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, hp, maxHp, exp, level, stamina, minStamina, maxStamina);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", gold=" + money +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", exp=" + exp +
                ", level=" + level +
                ", stamina=" + stamina +
                ", minStamina=" + minStamina +
                ", maxStamina=" + maxStamina +
                '}';
    }
}
