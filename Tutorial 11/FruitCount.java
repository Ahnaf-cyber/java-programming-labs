import java.util.HashMap;

public class FruitCount {

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple", "orange", "banana"};

        HashMap<String, Integer> fruitCount = new HashMap<>();

        for (String fruit : fruits) {
            if (!fruitCount.containsKey(fruit)) {
                fruitCount.put(fruit, 1);
            } else {
                fruitCount.put(fruit, fruitCount.get(fruit) + 1);
            }
        }

        System.out.println(fruitCount);
    }
}
