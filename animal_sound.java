class Animal{
    void make_sound(){
        System.out.println("Animal is making sound");
    }
}
class cat extends Animal{
    void  make_sound(){
        System.out.println("Meow");
    }
}
class dog extends Animal{
    void make_sound(){
        System.out.println("Bhau");
    }
}




public class animal_sound {
    public static void main(String[] args) {
        Animal a = new Animal();
        cat c = new cat();
        dog d = new dog();
        a.make_sound();
        c.make_sound();
        d.make_sound();
    }
}
