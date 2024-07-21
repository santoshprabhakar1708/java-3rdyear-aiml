package UserInput;
import java.util.*;
public class main {
    public static void main(String args[]){
        operation.sum();
    }
}

class operation{
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : "+sum);
    }
}