public class TrainManagementApp {

    // Class representing Train Consist
    static class Train {
        private int bogieCount;

        // Constructor to initialize train
        public Train(int bogieCount) {
            this.bogieCount = bogieCount;
        }

        // Method to display bogie count
        public void displayBogieCount() {
            System.out.println("Initial number of bogies: " + bogieCount);
        }
    }

    public static void main(String[] args) {

        // Step 1 & 2: Welcome message
        System.out.println("Welcome to Train Consist Management System");

        // Step 3: Initialize train consist
        int initialBogieCount = 5; // default value
        Train train = new Train(initialBogieCount);

        // Step 4: Display bogie count
        train.displayBogieCount();

        // Step 5: Continue program
        System.out.println("System is ready for further operations...");
    }
}