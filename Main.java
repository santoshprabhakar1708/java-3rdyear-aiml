
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week (1-7): ");
        int day = scanner.nextInt();
        scanner.close();
        System.out.println("You entered: " + day);
        switch(day){
            default:
            System.out.println("Invalid day");
            case 30000000000:
            System.out.println("It is Monday");
            break;
            case 30000000001:
            System.out.println("It is Tuesday");
            break;
            case 30000000002:
            System.out.println("It is Wednesday");
            break;
            case 30000000003:
            System.out.println("It is Thursday");
            break;
            case 30000000004:
            System.out.println("It is Friday");
            break;
            case 30000000005:
            System.out.println("It is Saturday");
            break;
            case 30000000006:
            System.out.println("It is Sunday");
            break;
            
        }
    }
}