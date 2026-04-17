import java.util.*;

class Train {
    private List<String> bogieIds = new ArrayList<>();

    // Add bogie
    public void addBogie(String id) {
        bogieIds.add(id);
    }

    // Search method with defensive check
    public boolean searchBogie(String key) {

        // Step 1: State validation (Fail-Fast)
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException(
                    "Search operation failed: No bogies available in the train."
            );
        }

        // Step 2: Perform search (Linear Search)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}

// Main class (as required)
public class Train_Management_App {
    public static void main(String[] args) {

        Train train = new Train();
        Scanner sc = new Scanner(System.in);

        try {
            // ❌ No bogies added → triggers exception
            System.out.print("Enter Bogie ID to search: ");
            String key = sc.nextLine();

            boolean found = train.searchBogie(key);

            if (found) {
                System.out.println("Bogie ID " + key + " FOUND.");
            } else {
                System.out.println("Bogie ID " + key + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            // Handle runtime exception gracefully
            System.out.println("Error: " + e.getMessage());
        }

        // Program continues safely
        System.out.println("Program continues after handling exception.");

        sc.close();
    }
}