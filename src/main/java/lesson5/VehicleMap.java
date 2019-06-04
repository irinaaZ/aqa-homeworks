package lesson5;

/*
3. Create Map vehicles : vehicles.put("BMW", 5);, print
 */

import java.util.HashMap;
import java.util.Map;

public class VehicleMap {
    public static void main(String[] args) {

        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW",5);

        for (Map.Entry<String, Integer> entry: vehicles.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
