import java.io.*;

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

    float getArea() {
        return length * breadth;
    }
}

class Ex1 {
    @SuppressWarnings("deprecation")
    public static void main(String args[]) {
        float area;
        int l = 0, b = 0;
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.println("\nEnter the value for Room length:");
            l = Integer.parseInt(in.readLine());
            System.out.println("\nEnter the value for Room breadth:");
            b = Integer.parseInt(in.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        Room room1 = new Room(l, b);
        area = room1.getArea();
        System.out.println("\nLength = " + room1.length);
        System.out.println("\nBreadth = " + room1.breadth);
        System.out.println("\nArea = " + area);
        System.out.println("\nPassing only length of the room with breadth = 100");
        
        Room room2 = new Room(l);
        area = room2.getArea();
        System.out.println("\nLength = " + room2.length);
        System.out.println("\nBreadth = " + room2.breadth);
        System.out.println("\nArea = " + area);
    }
}
