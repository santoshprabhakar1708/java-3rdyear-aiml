public class Bitwise{
    
    public static int bitwiseNOT(int num) {
        return ~num;
    }
    
    public static int bitwiseOR(int num1, int num2) {
        return num1 | num2;
    }
    
    public static int bitwiseAND(int num1, int num2) {
        return num1 & num2;
    }
    
    public static int leftShift(int num, int shiftAmount) {
        return num << shiftAmount;
    }
    
    public static int rightShift(int num, int shiftAmount) {
        return num >> shiftAmount;
    }
    
    public static void main(String[] args) {
        int a = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int b = args.length > 1 ? Integer.parseInt(args[1]) : 3;
        
        System.out.println("Bitwise NOT of " + a + ": " + bitwiseNOT(a));
        System.out.println("Bitwise NOT of " + b + ": " + bitwiseNOT(b));
        System.out.println("Bitwise OR of " + a + " and " + b + ": " + bitwiseOR(a, b));
        System.out.println("Bitwise AND of " + a + " and " + b + ": " + bitwiseAND(a, b));
        System.out.println("Left shift " + a + " by 1: " + leftShift(a, 1));
        System.out.println("Left shift " + b + " by 1: " + leftShift(b, 1));
        System.out.println("Right shift " + a + " by 1: " + rightShift(a, 1));
        System.out.println("Right shift " + b + " by 1: " + rightShift(b, 1));
    }
}