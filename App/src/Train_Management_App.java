import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    int id;
    int capacity;
    String type;

    public Bogie(int id, int capacity, String type) {
        this.id = id;
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bogie{id=" + id + ", capacity=" + capacity + ", type='" + type + "'}";
    }
}

public class Train_Management_App {

    public static void main(String[] args) {

        // Step 1: Create collection of bogies
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            bogies.add(new Bogie(i, (i % 100) + 50, (i % 2 == 0) ? "Passenger" : "Cargo"));
        }

        // -------------------------------
        // Loop-Based Filtering
        // -------------------------------
        long startLoop = System.nanoTime();

        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 120 && b.getType().equals("Passenger")) {
                filteredLoop.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // Stream-Based Filtering
        // -------------------------------
        long startStream = System.nanoTime();

        List<Bogie> filteredStream = bogies.stream()
                .filter(b -> b.getCapacity() > 120)
                .filter(b -> b.getType().equals("Passenger"))
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // Results
        // -------------------------------
        System.out.println("Loop-based filtering result size: " + filteredLoop.size());
        System.out.println("Stream-based filtering result size: " + filteredStream.size());

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Loop-based:   " + loopTime);
        System.out.println("Stream-based: " + streamTime);
    }
}