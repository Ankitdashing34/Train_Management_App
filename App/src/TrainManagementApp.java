import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    // Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return "Type: " + type + " | Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Management System - Safety Validation");

        // Step 2: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Flatbed", "Steel"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Step 3 & 4: Stream + allMatch() with condition
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    // Rule: Cylindrical → only Petroleum allowed
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true; // other types are allowed
                });

        // Step 5: Display result
        System.out.println("\nSafety Check Result:");
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        // Step 6: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}