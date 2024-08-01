import javax.swing.JOptionPane;

public class Javax {
    public static void main(String[] args) {
            String input = JOptionPane.showInputDialog("Enter a number:");
            
            try {
                int number = Integer.parseInt(input);
                boolean isPalindrome = isPalindrome(number);
                
                String message = number + " is " + (isPalindrome ? "a palindrome." : "not a palindrome.");
                JOptionPane.showMessageDialog(null, message);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
}