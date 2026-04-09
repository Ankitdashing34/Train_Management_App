import java.util.ArrayList;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Welcome to Train Consist Management System (Dynamic)");

        // Step 2: Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Step 3: Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Step 4: Display bogies after insertion
        System.out.println("\nBogies after insertion:");
        System.out.println(bogies);

        // Step 5: Remove a bogie (AC Chair)
        bogies.remove("AC Chair");

        // Step 6: Display after removal
        System.out.println("\nBogies after removal of 'AC Chair':");
        System.out.println(bogies);

        // Step 7: Check existence of "Sleeper"
        if (bogies.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the list.");
        } else {
            System.out.println("\n'Sleeper' bogie does NOT exist in the list.");
        }

        // Step 8: Final state of list
        System.out.println("\nFinal bogie list:");
        System.out.println(bogies);

        // Step 9: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}