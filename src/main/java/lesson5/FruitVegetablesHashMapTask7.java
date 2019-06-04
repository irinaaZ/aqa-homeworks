package lesson5;

/*
"7. Create HashMap<String, String> and add 10 pairs:
 watermelon, berry;
 banana, fruit;
 cherry, berry;
 pineapple, fruit;
 melon, vegetable;
 cranberry, berry;
 apple, fruit;
 iris, flower;
 potato, vegetable;
 carrot, vegetable;

Print the content of the map, each pair from a new line.
Example:
watermelon - berry;
cherry - berry;
..."
 */

import java.util.HashMap;
import java.util.Map;

public class FruitVegetablesHashMapTask7 {
    public static void main(String[] args) {
        Map<String,String> fruitVegetablesMap = new HashMap<>();
        fruitVegetablesMap.put("watermelon","berry");
        fruitVegetablesMap.put("banana","fruit");
        fruitVegetablesMap.put("cherry","berry");
        fruitVegetablesMap.put("pineapple","fruit");
        fruitVegetablesMap.put("melon","vegetable");
        fruitVegetablesMap.put("cranberry","berry");
        fruitVegetablesMap.put("apple","fruit");
        fruitVegetablesMap.put("iris","flower");
        fruitVegetablesMap.put("potato","vegetable");
        fruitVegetablesMap.put("carrot","vegetable");

        for (Map.Entry<String, String> entry: fruitVegetablesMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

