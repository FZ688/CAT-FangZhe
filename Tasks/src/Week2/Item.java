package Week2;

/**
 * @author fz
 */
public class Item {
    private String name;    //道具名称
    private int value;      //使用道具所能获得的经验值

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
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
}
