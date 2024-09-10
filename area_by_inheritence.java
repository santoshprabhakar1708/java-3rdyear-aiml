import java.util.Scanner;
class Shape{
    int getArea(){
        return 0;
    }
}
class Rectangle extends Shape{
    int width;
    int length;
    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    int getArea(){
        return length*width;
    }
}

class Box extends Rectangle{
    int height;
    Box(int length,int width,int height){
        super(length,width);
        this.height=height;
    }
    int getArea(){
        return length*width*height;
    }

}



public class area_by_inheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle");
        int width = sc.nextInt();
        System.out.println("Enter the height of the box");
        int height = sc.nextInt();
        Shape s = new Shape();
        Rectangle r = new Rectangle(length,width);
        Box b = new Box(length,width,height);
        System.out.println("Area of the shape is "+s.getArea());
        System.out.println("Area of the rectangle is "+r.getArea());
        System.out.println("Area of the box is "+b.getArea());

    }
}
