import java.util.Scanner;

class sum_and_substraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:-");
        int num1 = sc.nextInt() ;

        System.out.println("Enter the second number:-");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        int sub = num1-num2;
        System.out.println("Sum of two number is:-"+sum);
        System.out.println("Substractiion of two number is:-"+sub);





    }
}