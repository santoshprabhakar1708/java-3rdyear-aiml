import java.io.DataInputStream;
import java.io.IOException;

class Room {
    float length, breadth;
    
    Room(int a, int b) {
        length = a;
        breadth = b;
    }
    
    Room(int a) {
        length = a;
        breadth = 100;
    }
    
    float getdata() {
        return (length * breadth);
    }
}

class Overloading {
    @SuppressWarnings("deprecation")
    public static void main(String args[]) {
        float area;
        int l, b;
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.println("\nEnter the value for Room length:");
            l = Integer.parseInt(in.readLine());
            System.out.println("\nEnter the value for Room breadth:");
            b = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return;
        }
        
        Room room1 = new Room(l, b);
        area = room1.getdata();
        System.out.println("\nLength = " + room1.length);
        System.out.println("Breadth = " + room1.breadth);
        System.out.println("Area = " + area);
        
        System.out.println("\nPassing only length of the room with breadth = 100");
        Room room2 = new Room(l);
        area = room2.getdata();
        System.out.println("Length = " + room2.length);
        System.out.println("Breadth = " + room2.breadth);
        System.out.println("Area = " + area);
    }
}