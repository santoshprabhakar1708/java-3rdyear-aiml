package Conditionals;

import java.util.Scanner;

public class main {
     public static void main(String args[]){
         System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();        
        if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Minor");
        }
    }
}
