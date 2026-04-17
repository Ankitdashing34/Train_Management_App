import java.util.*;

public class Train_Management_App {

    // Binary Search Method
    public static int binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            // Compute mid index
            int mid = (low + high) / 2;

            // Compare using compareTo()
            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return mid; // Found
            } else if (result > 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Sorted array of bogie IDs (IMPORTANT)
        String[] bogieIds = {"B101", "B205", "B309", "B450", "B512"};

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Step 2: Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3–6: Perform Binary Search
        int index = binarySearch(bogieIds, key);

        // Step 7: Display result
        if (index != -1) {
            System.out.println("Bogie ID " + key + " FOUND at index " + index);
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND.");
        }

        // Program continues
        System.out.println("Binary search completed.");

        sc.close();
    }
}