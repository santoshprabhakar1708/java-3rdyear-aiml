import java.util.Scanner;
class Employee{
    String name;
    int id;
    Employee(String name,int id){
        this.name = name;
        this.id =id;
    }
    Employee(Employee e){
        this.name = e.name;
        this.id=e.id;
    }
    void display(){
        System.out.println("Name: "+name+" Id: "+id);
    }
}




public class Copy_constructor {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the name of the employee:-");
        String name = sc.nextLine();
        System.out.println("Enter the id of the employee:-");
        int id = sc.nextInt();
        sc.nextLine();
        Employee e1 = new Employee(name,id);
        Employee e2 = new Employee(e1);

    }
}
