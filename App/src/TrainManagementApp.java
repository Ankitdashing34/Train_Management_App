import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainManagementApp {

    // Bogie class (Custom Object)
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // toString() for display
        @Override
        public String toString() {
            return "Bogie: " + name + " | Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Management System - Sorting Bogies by Capacity");

        // Step 2: Create List to store bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 3: Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 78));
        bogieList.add(new Bogie("First Class", 24));

        // Step 4: Sort using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: Display sorted bogies
        System.out.println("\nBogies sorted by capacity (ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 6: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}