import java.util.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie with validation
class PassengerBogie {
    private int id;
    private int capacity;

    public PassengerBogie(int id, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid capacity for bogie ID " + id + ": Capacity must be greater than 0"
            );
        }
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "PassengerBogie{id=" + id + ", capacity=" + capacity + "}";
    }
}

// Train class
class Train {
    private List<PassengerBogie> bogies = new ArrayList<>();

    public void addBogie(PassengerBogie bogie) {
        bogies.add(bogie);
    }

    public void displayBogies() {
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}

// Main class (as required)
public class Train_Management_App {
    public static void main(String[] args) {

        Train train = new Train();

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie(1, 120);
            train.addBogie(b1);

            // Invalid bogie
            PassengerBogie b2 = new PassengerBogie(2, -10);
            train.addBogie(b2); // Will not execute

        } catch (InvalidCapacityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Continue execution
        System.out.println("\nValid bogies in train:");
        train.displayBogies();
    }
}