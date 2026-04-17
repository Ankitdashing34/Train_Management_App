import java.util.Arrays;

public class Train_Management_App {

    public static void main(String[] args) {

        // Step 1: Create array of bogie type names
        String[] bogieTypes = {
                "Sleeper",
                "AC",
                "General",
                "Luxury",
                "ChairCar",
                "Cargo"
        };

        System.out.println("Original Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        // Step 2: Sort using built-in method
        Arrays.sort(bogieTypes);

        // Step 3: Display sorted result
        System.out.println("\nSorted Bogie Types (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));

        // Program continues
        System.out.println("\nSorting completed using Arrays.sort().");
    }
}