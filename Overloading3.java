public class Overloading3 {
    public static void printInfo(boolean bool) {
        System.out.println("Printing a boolean: " + bool);
    }

    public static void printInfo(char ch) {
        System.out.println("Printing a char: " + ch);
    }

    public static void printInfo(int num) {
        System.out.println("Printing an integer: " + num);
    }

    public static void printInfo(double num) {
        System.out.println("Printing a double: " + num);
    }

    public static void printInfo(String text) {
        System.out.println("Printing a string: " + text);
    }

    public static void printInfo(int num1, int num2) {
        System.out.println("Printing two integers: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        printInfo(true);
        printInfo('a');
        printInfo(5);
        printInfo(3.14);
        printInfo("Hello, World!");
        printInfo(10, 20);
    }
}