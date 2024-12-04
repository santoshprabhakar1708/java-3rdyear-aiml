import java.io.DataInputStream;
import java.io.IOException;

class Shape {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

class Overloading2 {
    @SuppressWarnings("deprecation")
    public static void main(String args[]) {
        double area;
        double radius, base, height;
        DataInputStream in = new DataInputStream(System.in);
        Shape shape = new Shape();
        
        try {
            System.out.println("\nEnter the radius of the circle:");
            radius = Double.parseDouble(in.readLine());
            
            System.out.println("\nEnter the base of the triangle:");
            base = Double.parseDouble(in.readLine());
            
            System.out.println("\nEnter the height of the triangle:");
            height = Double.parseDouble(in.readLine());
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return;
        }
        
        area = shape.calculateArea(radius);
        System.out.println("\nCircle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
        
        area = shape.calculateArea(base, height);
        System.out.println("\nTriangle:");
        System.out.println("Base = " + base);
        System.out.println("Height = " + height);
        System.out.println("Area = " + area);
    }
}