import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;


    Student(int a, String n) {
        id = a;
        name = n;
    }

    
    Student(int a, String n, int b) {
        id = a;
        name = n;
        age = b;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting input for the first student
        System.out.println("Enter the ID for the first student:");
        int ID1 = sc.nextInt();
        sc.nextLine();  
        System.out.println("Enter the Name for the first student:");
        String Name1 = sc.nextLine();
        Student s1 = new Student(ID1, Name1);

        
        System.out.println("Enter the ID for the second student:");
        int ID2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name for the second student:");
        String Name2 = sc.nextLine();
        System.out.println("Enter the Age for the second student:");
        int Age2 = sc.nextInt();
        Student s2 = new Student(ID2, Name2, Age2);

        s1.display();
        s2.display();
    }
}
