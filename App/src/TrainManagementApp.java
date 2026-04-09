import java.util.LinkedHashSet;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Management System - LinkedHashSet Implementation");

        // Step 2: Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate (will be ignored)

        // Step 5: Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Maintained):");
        System.out.println(trainFormation);

        // Step 6: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}