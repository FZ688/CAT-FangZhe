package Week2;

/**
 * @author fz
 */
public class Food {
    private String name;       //食物名称
    private int value;      //吃掉食物所能增加的属性值
    private FoodType type;  //食物的恢复类型（体力/血量）

    public Food(String name, int value, FoodType type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }
}
