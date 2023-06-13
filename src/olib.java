// Online Library

import java.util.Scanner;
class Library{
    String books [];
    int no_of_books = 0;
    Library(){
        this.books= new String[100];
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " has been added");
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.printf("The book %s has been issued \n!",book);
                this.books[i]=null;
                return;
            }
        }
        System.out.println("The book does not exist");
    }
    void returnBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " has been returned");
    }
    void showAvailableBooks(){
        System.out.println("The available books are");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
}
public class olib {
    public static void main(String[] args) {
        Library l =new Library();
        String a;
        int ch;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("1) Add a book");
            System.out.println("2) Issue a book");
            System.out.println("3) Return a book");
            System.out.println("4) Show available books");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the book you want to add : ");
                    a = sc.next();
                    l.addBook(a);
                    break;
                case 2:
                    System.out.print("Enter the book you want to issue : ");
                    a = sc.next();
                    l.issueBook(a);
                    break;
                case 3:
                    System.out.print("Enter the book you want to return : ");
                    a = sc.next();
                    l.returnBook(a);
                    break;
                case 4:
                    l.showAvailableBooks();
                    break;
                default:
                    System.out.println("You have entered wrong choice");
            }
        } while (ch < 5) ;
    }
}
