package lesson5;

/*
"9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
Create HashSet<Integer> and add all unique numbers from the ArrayList."
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomIntegersArrayList {
    public static void main(String[] args) {
        List<Integer> randomIntegerList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            randomIntegerList.add((int) (Math.random() * 50));
        }
        System.out.print("List with random values: " + randomIntegerList);
        System.out.println();


        Set<Integer> integerSet = new HashSet<>();
        for (Integer integer : randomIntegerList){
            integerSet.add(integer);
        }
        System.out.println("Unique numbers from random arrayList in the hashSet is: " + integerSet);
    }
}

