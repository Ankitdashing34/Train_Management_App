import java.util.HashSet;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Consist Management - Unique Bogie IDs");

        // Step 2: Create HashSet to store bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Step 3: Add bogie IDs (including duplicates)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B102"); // duplicate
        bogieIds.add("B101"); // duplicate

        // Step 4: Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs (duplicates ignored):");
        System.out.println(bogieIds);

        // Step 5: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}