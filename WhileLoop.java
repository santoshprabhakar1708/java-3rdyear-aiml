import java.util.Scanner;

class WhileLoop {
    // Function to print N Fibonacci Numbers
    static void fibonacci(int n) {
        int num1 = 0, num2 = 1;
        int i = 0;

        while (i < n) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

            i++;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        // Function Call
        fibonacci(n);
        scanner.close();
    }
}