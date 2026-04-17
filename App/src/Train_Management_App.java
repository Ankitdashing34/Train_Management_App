import java.util.*;

public class Train_Management_App {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        // Traverse array sequentially
        for (String id : bogieIds) {

            // Compare using equals()
            if (id.equals(key)) {
                return true; // Match found (early termination)
            }
        }

        return false; // No match found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B450", "B512"};

        System.out.println("Available Bogie IDs: " + Arrays.toString(bogieIds));

        // Step 2: Accept search key from user
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3–5: Perform Linear Search
        boolean found = linearSearch(bogieIds, searchKey);

        // Step 6: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the list.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        // Program continues
        System.out.println("Search operation completed.");

        sc.close();
    }
}