import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainManagementApp {

    // Bogie class (same as UC7 & UC8)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Management System - Grouping Bogies");

        // Step 2: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 78));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70)); // another Sleeper

        // Step 3: Convert to stream and group by bogie name
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Step 4: Display grouped result
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // Step 5: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}