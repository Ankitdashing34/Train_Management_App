import java.util.LinkedList;

public class TrainConsistLinkedList {

    public static void main(String[] args) {

        // Step 1: User runs program
        System.out.println("Train Consist Management - LinkedList Implementation");

        // Step 2: Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Step 3: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Step 4: Insert Pantry Car at position 2 (index starts from 0)
        train.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // Step 5: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Step 6: Display final train consist
        System.out.println("\nFinal Train Consist after removals:");
        System.out.println(train);

        // Step 7: Program continues
        System.out.println("\nSystem ready for further operations...");
    }
}