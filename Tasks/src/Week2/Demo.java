package Week2;

import java.util.*;
import java.util.Collections;

/**
 * @author fz
 */
public class Demo {
    public static void main(String[] args) {
        // 初始化可用桌宠
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Lolis", new Pet("Lolis", 1000, 100, 100, 0, 1, 100, 50, 150));
        pets.put("Molis", new Pet("Molis", 1000, 100, 100, 0, 1, 100, 50, 150));
        pets.put("Polis", new Pet("Polis", 1000, 100, 100, 0, 1, 100, 50, 150));

        /*
        * 选择桌宠
        **/
        Scanner scanner = new Scanner(System.in);
        pets.forEach((k, v) -> System.out.println(k + " "));
        System.out.println("请选择桌宠(输入桌宠的名字)：");
        String petName = scanner.next();
        Pet pet = pets.get(petName);



        // 初始化食物和道具
        List<Food> hpFoods = new ArrayList<>();
        Collections.addAll(hpFoods, new Food("沙拉", 10, FoodType.HP), new Food("香煎牛仔骨", 20, FoodType.HP), new Food("西冷牛排", 30, FoodType.HP));

        List<Food> staminaFoods = new ArrayList<>();
        Collections.addAll(staminaFoods,new Food("芝士焗虾", 10, FoodType.STAMINA),new Food("盐焗鸡", 20, FoodType.STAMINA),new Food("东坡肘子", 30, FoodType.STAMINA));

        List<Item> items = new ArrayList<>();
        Collections.addAll(items,new Item("麦克风", 10),new Item("i9", 20),new Item("4090", 30));
        while (true) {
            // 显示宠物信息
            System.out.println("宠物名称：" + pet.getName());
            System.out.println("金币：" + pet.getMoney());
            System.out.println("血量：" + pet.getHp() + "/" + pet.getMaxHp());
            System.out.println("经验：" + pet.getExp());
            System.out.println("等级：" + pet.getLevel());
            System.out.println("体力：" + pet.getStamina() + "/" + pet.getMaxStamina());


            System.out.println("1. 工作");
            System.out.println("2. 停止工作");
            System.out.println("3. 吃食物");
            System.out.println("4. 使用道具");
            System.out.println("5. 退出游戏");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    pet.work();
                    break;
                case 2:
                    pet.stopWork();
                    break;
                case 3:
                    if (pet.isWorking()) {
                        System.out.println("请先停止工作");
                        break;
                    }
                    System.out.println("请选择食物：");
                    for (int i = 0; i < hpFoods.size(); i++) {
                        System.out.println(i + 1 + ". " + hpFoods.get(i).getName());
                    }
                    for (int i = 0; i < staminaFoods.size(); i++) {
                        System.out.println(i + 4 + ". " + staminaFoods.get(i).getName());
                    }
                    int foodIndex = scanner.nextInt();
                    if (foodIndex <= hpFoods.size()) {
                        pet.eat(hpFoods.get(foodIndex - 1));
                    } else {
                        pet.eat(staminaFoods.get(foodIndex - hpFoods.size() - 1));
                    }
                    break;
                case 4:
                    if (pet.isWorking()) {
                        System.out.println("请先停止工作");
                        break;
                    }
                    System.out.println("请选择道具：");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println(i + 1 + ". " + items.get(i).getName());
                    }
                    int itemIndex = scanner.nextInt();
                    pet.useItem(items.get(itemIndex - 1));
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
