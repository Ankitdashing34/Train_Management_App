import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    // Bogie class (reused from previous UCs)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Management System - Capacity Aggregation");

        // Step 2: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 78));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3 & 4: Stream → map → reduce
        int totalCapacity = bogieList.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);     // sum all values

        // Step 5: Display total capacity
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Step 6: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}