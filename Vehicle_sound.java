class Vehicle{
    void start(){
        System.out.println("Vehicle started");
    }
}
class car extends Vehicle{
    void start(){
        System.out.println("Car started");
    }
}



public class Vehicle_sound {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        car c = new car();

        v.start();
        c.start();
    }
}
