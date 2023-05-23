package TransactionList;
import MemberList.Member;
import BookList.Book;

public class Transaction {
    public Transaction(String s,Member m,Book b){
        System.out.println("transaction details ::: ");
        System.out.println(s);
        System.out.println("member id : "+m.get_member_id());
        System.out.println("book id : "+b.get_id());
    }    
}
