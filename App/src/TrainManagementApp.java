import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainManagementApp {

    // Bogie class (same as UC7)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Bogie: " + name + " | Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Management System - Stream Filtering");

        // Step 2: Create list of bogies (reuse UC7)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 78));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3: Convert to stream and apply filter
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60) // condition
                .collect(Collectors.toList());

        // Step 4: Display filtered bogies
        System.out.println("\nBogies with capacity greater than 60:");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Step 5: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}