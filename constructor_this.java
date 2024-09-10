import java.util.Scanner;
class Book{
    String bookname;
    String author;
    double price;
    Book(String bookname,String author){
        this.bookname = bookname;
        this.author = author;
    }
    Book(String bookname,String author,double price){
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Book Name: "+bookname+" "+"Author:"+author+" "+"Price:"+price);
    }
}

public class constructor_this {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name of the book:-");
    String bookname = sc.nextLine();

    
    System.out.println("Enter the Author of the book:-");
    String author = sc.nextLine();

    
    System.out.println("Enter the Price of the book:-");
    double price = sc.nextDouble();

    Book b = new Book(bookname,author);
    Book c = new Book(bookname,author,price);


    b.display();
    c.display();
    }

}
