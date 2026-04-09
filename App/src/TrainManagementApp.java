import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: User enters inputs
        System.out.println("Train Management System - Input Validation");

        System.out.print("\nEnter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Step 2: Define regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Step 3: Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Step 4: Create matcher objects
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 5: Validate using matches()
        System.out.println("\nValidation Results:");

        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        // Step 6: Program continues
        System.out.println("\nSystem ready for further operations...");

        scanner.close();
    }
}