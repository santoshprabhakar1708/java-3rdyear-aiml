import java.util.Scanner;
class small{
    int num1,num2,num3;
    void insert(int x , int y, int z){
       num1 = x;
       num2 = y;
       num3 = z;
    }
    void compare(){
        if (num1>num2 && num1>num3){
            System.out.println(num1+" is the largest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2+" is the largest");
        }
        else{
            System.out.println(num3+" is the largest");
        }
    }
}

public class Smallestnum_method {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        small s = new small();
        s.insert(a,b,c);
        s.compare();

       }
}
