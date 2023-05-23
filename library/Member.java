package MemberList;
import java.util.Scanner;
public class Member {
    private static int limit_of_book;
    private int member_id;
    private String name;
    private String dob;
    private int book_issued;

      
    static{
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the limit");
        limit_of_book = sc.nextInt();
    }

    Scanner sc = new Scanner(System.in);
    public Member(){
        System.out.println("enter the member_id");
        member_id = sc.nextInt();
        System.out.println("enter the member name");
        name = sc.next();
        // sc.nextLine();
        System.out.println("enter the date of birth");
        dob = sc.next();
        System.out.println("number of the book issued");
        book_issued = sc.nextInt();
    }

    public void display(){
        System.out.println("member_id : "+member_id);
        System.out.println("member name : "+name);
        System.out.println("date of birth : "+dob);
        System.out.println("book issued : "+book_issued);
    }

    public int get_member_id(){
        return member_id;
    }
    // public String get_name(int d){
    //     return name;
    // }
    public int bookIssued(){
        return book_issued;
    }
    public void increase_issued_book(){
        book_issued +=1;
    }
    public void decrease_issued_book(){
        book_issued -=1;
    }
    public static int limit(){
        return limit_of_book;
    }
}