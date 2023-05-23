import BookList.Book;
import MemberList.Member;
import TransactionList.Transaction;

import java.util.ArrayList;
import java.util.Scanner;

interface LibrayInterface{
    void add_new_book();
    void add_more_copies();
    void show_all_books();
    void show_particular_book();
    void add_new_member();
    void display_all_members();
    void show_particular_member();
    void issue_book();
    void return_book();
}

class LibraryMethods implements LibrayInterface{
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();
    ArrayList<Transaction> transacs = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void add_new_book(){
        Book b = new Book();
        books.add(b);
    }

    public void add_more_copies(){
        System.out.println("enter the book id");
        int id = sc.nextInt();
        for(int i=0;i<books.size();i++){
            if(books.get(i).get_id() == id){
                books.get(i).increase_copies();
            }
        }
    }
    
    public void show_all_books(){
        for(int i=0;i<books.size();i++){
            books.get(i).display_book();
        }
    }

    public void show_particular_book(){
        System.out.println("enter the book id");
        int d = sc.nextInt();
        for(int i=0;i<books.size();i++){
            if(books.get(i).get_id() == d){
                books.get(i).display_book();
            }
        }
    }

    public void add_new_member(){
        Member m = new Member();
        members.add(m);
    }

    public void display_all_members(){
        for(int i=0;i<members.size();i++){
            members.get(i).display();
        }
    }

    public void show_particular_member(){
        System.out.println("enter member id : ");
        int md = sc.nextInt();
        for(int i=0;i<members.size();i++){
            if(members.get(i).get_member_id()==md){
                members.get(i).display();
            }
        }
    }

    public void issue_book(){
        System.out.println("enter the book id: ");
        int bid=sc.nextInt();

        int flag1=0;
        int flag2=0;
        int j;
        for(j=0;j<books.size();j++){
            if(books.get(j).get_id() == bid){
                if(books.get(j).copies()>0){
                    flag1=1; 
                    break;        // one copy of that book is decreased ..........
                }
            }
        }
        if(flag1==0){
            System.out.println("sorry , book is not availble");
            return;
        }
        else{
            System.out.println("enter the member id");
            int mid = sc.nextInt();
            int i;
            for(i=0;i<members.size();i++){
                if(members.get(i).get_member_id() == mid){
                    if(members.get(i).bookIssued() < Member.limit()){
                        flag2=1;
                        books.get(j).decrease_a_copies();  
                        members.get(i).increase_issued_book(); 
                        break;         // book is issued to the member .........
                    }
                }
            }

            if(flag2==0){
                System.out.println("sorry , member is out of limit of books");
                return;
            }
            else{
                Transaction t = new Transaction("ISSUED",members.get(i),books.get(j));
                transacs.add(t);
            }
        }
    }

    public void return_book(){
        System.out.println("enter book id and member id");
        int bo_id = sc.nextInt();
        int me_id = sc.nextInt();

        int p,q;
        for(p=0;p<members.size();p++){
            if(members.get(p).get_member_id() == me_id){
                members.get(p).decrease_issued_book();
                break;
            }
        }
        for(q=0;q<books.size();q++){
            if(books.get(q).get_id() == bo_id){
                books.get(q).increase_a_copies();
                break;
            }
        }
        
        Transaction t = new Transaction("RETURN",members.get(p), books.get(q));
        transacs.add(t);
    }
}

public class Library {
    public static void main(String[] args) {
      

        LibraryMethods l = new LibraryMethods();

       Scanner sc = new Scanner(System.in);
       do{

        System.out.println();
        System.out.println("1.add new book\n2.add more copies\n3.show all books\n4.show details of a particular book\n5.add member \n6.display all members\n7.show details of a paritcular member\n8.issue a book\n9.return a book");
        System.out.println("enter your choice");
        int ch;
        ch = sc.nextInt();
       
        switch(ch){
            case 1 : 
                        l.add_new_book();
                        break;
            case 2 :  
                        l.add_more_copies();
                        break;

            case 3 :  
                       l.show_all_books();
                        break;
            case 4 :    
                       l.show_particular_book();
                        break;
            case 5 :    
                       l.add_new_member();
                        break;
            case 6 : 
                       l.display_all_members();
                        break;
            case 7 :    
                       l.show_particular_member();
                        break;
            case 8 :
                       l.issue_book();
                        break;

            case 9 : 
                       l.return_book();
                        break;

        }

       }while(true);
    }
}
