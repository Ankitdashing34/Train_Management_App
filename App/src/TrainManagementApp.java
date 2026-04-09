import java.util.HashMap;
import java.util.Map;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Management System - Bogie Capacity Mapping");

        // Step 2: Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 3: Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);

        // Step 4: Iterate using entrySet()
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Step 5: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}