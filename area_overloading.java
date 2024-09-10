import java.util.Scanner;
class Overload{
    int Area(int x, int y){
        return x*y;
    }
    int Area(int x){
        return x*x;
    }
}
 class area_overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:-");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:-");
        int b = sc.nextInt();
        Overload over = new Overload();
        int rectangle = over.Area(l,b);
        int square = over.Area(l);
        System.out.println("Area of Rectangle is "+rectangle);
        System.out.println("Area of Square is "+square);
    }
}
