package BookList;
import java.util.Scanner;
public class Book{
    private int book_id;
    private String title;
    private int no_of_copies_purchased;
    private int no_of_copies_available;
    
    Scanner sc = new Scanner(System.in);
    public Book(){
        System.out.println("enter the book id");
        book_id = sc.nextInt();
        System.out.println("enter the title");
        title = sc.next();
        System.out.println("total no of copies purchased");
        no_of_copies_purchased = sc.nextInt();
        System.out.println("total no of copies available");
        no_of_copies_available = sc.nextInt();
    }
    public int get_id(){
        return book_id;
    }
    public void increase_copies(){
        System.out.println("how many books are added");
        int x = sc.nextInt();
        no_of_copies_available +=x;
    }

    public void decrease_a_copies(){
        no_of_copies_available -=1;
    }
    
    public void increase_a_copies(){
        no_of_copies_available +=1;
    }

    public int copies(){
        return no_of_copies_available;
    }

    public void display_book(){
        System.out.println("book_id : "+book_id);
        System.out.println("title : "+title);
        System.out.println("no of copies purchased : "+no_of_copies_purchased);
        System.out.println("no of copies available : "+no_of_copies_available);
    }
}