import java.util.Scanner;
// using method
class rectangle{
    int length;
    int breadth;
    int width;
    void insert(int len,int bre,int wid){
         length=len;
         breadth=bre;
         width=wid;
    }
    void area(){
 
    System.out.println("Area of rectangle is "+ length*breadth );
    }
    void volume(){
        System.out.println("Volume of rectangle is "+(length*breadth*width));
    }
}

class Rectangle1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle:-");
        int a = sc.nextInt();
        System.out.println("Enter the Breadth of the Rectangle:-");
        int b = sc.nextInt();
        System.out.println("Enter the width of the Rectangle:-");
        int c = sc.nextInt();
        rectangle r = new rectangle();
        r.insert(a,b,c);
        r.area();
        r.volume();
    }
}