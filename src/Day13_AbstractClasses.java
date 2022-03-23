import java.util.Scanner;

/**
 * Tutorials > 30 Days of Code > Day 13: Abstract Classes
 *
 * https://www.hackerrank.com/challenges/30-abstract-classes/
 * @author lizarragadev
 *
 */

public class Day13_AbstractClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tit = sc.nextLine();
        String aut = sc.nextLine();
        int pri = sc.nextInt();
        MyBook myBook = new MyBook(tit, aut, pri);
        myBook.display();
    }
}

abstract class Book {
    String title;
    String author;

    public Book(String title, String author) {
         this.title = title;
         this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: "+ title +
                "\nAuthor: "+ author +
                "\nPrice: "+ price);
    }
}

