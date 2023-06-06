import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

class Customer {
    private static int count;
    private int credit_limit;
    private int customer_id;
    private String name;
    private int loan;
    private String phone_number;

    Scanner sc = new Scanner(System.in);

    // static {
    //     Scanner sc = new Scanner(System.in);
    //     count = 0;
    //     System.out.println("enter the credit limit");
    //     credit_limit = sc.nextInt();
    // }
        
    public Customer() {
        System.out.println("enter the customer id : (" + (count + 1) + ")");
        customer_id = sc.nextInt();

        sc.nextLine(); // .......................... To avoid the buffer
        System.out.println("enter the customer name : ");
        name = sc.nextLine();

        System.out.println("enter the current loan ");
        loan = sc.nextInt();

        System.out.println("enter the phone number ");
        phone_number = sc.next();

        count++;
    }
    public int get_customer_id()
    {
        return customer_id;
    }
    public void set_credit_limit(){
        System.out.println("enter the credit-limit : ");
        credit_limit = sc.nextInt();
    }

    public int get_credit_limit(){
        return credit_limit;
    }
    // public void set_credit_limit(){
    //     System.out.println("enter the credit limit : ");
    //     credit_limit = sc.nextInt();
    // }

    public void display()
    {
        System.out.println("\ncustomer id : "+customer_id);
        System.out.println("customer name : "+name);
        System.out.println("current loan : "+loan);
        System.out.println("phone number : "+phone_number);
    }
    // public int get_credit_limit()
    // {
    //     return credit_limit;
    // }
    public void add_loan(int l)
    {
        loan = loan + l;
    }
    public int get_loan()
    {
        return loan;
    }
}

class Privilledge extends Customer{
    private String s="privilledged";
    private int credit_limit;

    Scanner sc = new Scanner(System.in);

    public Privilledge(){
        super();
    }

    public void set_credit_limit(){
        System.out.println("enter the credit limit");
        credit_limit = sc.nextInt();
    }

    public int get_credit_limit(){
        return credit_limit;
    }
    // public int get_cutomer_id(){
    //     return ;
    // }

    public void display(){
        super.display();
        System.out.println("credit limit : "+credit_limit);
        System.out.println(s);
    }

}




public class BankSystem {
    public static void main(String[] args) {
       Customer c = new Customer();
       c.set_credit_limit();
       Privilledge p = new Privilledge();
       p.set_credit_limit();
        // c[2] = new Customer();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\n1.customer details for privilledge\n2.customer details for non-privilledge\n3.loan for non-privilledge person\n4.loan for privilledge person\n");
            int ch;
            System.out.println("\nenter your choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:     
                            p.display();
                            break;
                case 2:    c.display();
                           break;
                case 3 :

                            System.out.print("enter the amount you want to take loan : ");
                            int l_amount = sc.nextInt();
                            
                            // System.out.print("enter the customer id : ");
                            // c_id = sc.nextInt();

                            if(l_amount + c.get_loan() > c.get_credit_limit())
                                    {
                                        System.out.println("\nYour total loan is greater than credit limit");
                                        break;
                                    }else{
                                        c.add_loan(l_amount);
                                    }
                         break;
                

                case 4:
                            System.out.print("enter the amount you want to take loan : ");
                            int li_amount = sc.nextInt();
                            
                            // System.out.print("enter the customer id : ");
                            // c_id = sc.nextInt();

                            if(li_amount + p.get_loan() > p.get_credit_limit())
                                    {
                                        System.out.println("\nYour total loan is greater than credit limit");
                                        break;
                                    }else{
                                        p.add_loan(li_amount);
                                    }
             break;
                        

                case 5: System.out.println("wrong choice \n\nplz enter the correct case");
                        break;
            }
        } while (true);
    }
}