import java.io.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        // Check if any arguments are passed
        if (args.length == 0) {
            System.out.println("No names were entered to sort.");
            return;
        }

        String t;
        int n = args.length;
        int i, j;
        System.out.println("\nYou have entered " + n + " names to sort in ascending order");

        // Sorting names using bubble sort
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    t = args[i];
                    args[i] = args[j];
                    args[j] = t;
                }
            }
        }

        // Printing sorted names
        System.out.println("\nSorted name list is...");
        for (i = 0; i < n; i++) {
            System.out.println(args[i]);
        }
    }
}

