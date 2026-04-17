import java.util.*;

public class Train_Management_App {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Step 1: Create array of passenger bogie capacities
        int[] capacities = {120, 80, 150, 60, 200, 90};

        System.out.println("Original Capacities:");
        printArray(capacities);

        // Step 2–4: Sort using Bubble Sort
        bubbleSort(capacities);

        // Step 5: Display sorted result
        System.out.println("\nSorted Capacities:");
        printArray(capacities);

        // Program continues
        System.out.println("\nSorting completed successfully.");
    }
}