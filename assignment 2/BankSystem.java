import java.util.Scanner;

class Customer {
    private static int count,credit_limit;
    private int customer_id;
    private String name;
    private int loan;
    private String phone_number;

    Scanner sc = new Scanner(System.in);

    static {
        Scanner sc = new Scanner(System.in);
        count = 0;
        System.out.println("enter the credit limit");
        credit_limit = sc.nextInt();
    }

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
    public void display()
    {
        System.out.println("\ncustomer id : "+customer_id);
        System.out.println("customer name : "+name);
        System.out.println("current loan : "+loan);
        System.out.println("phone number : "+phone_number);
    }
    public static int get_credit_limit()
    {
        return credit_limit;
    }
    public void add_loan(int l)
    {
        loan = loan + l;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Customer c[] = new Customer[2];
        c[0] = new Customer();
        c[1] = new Customer();
        // c[2] = new Customer();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\n1.customer details\n2.customer loan");
            int ch;
            System.out.println("\n\nenter your choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                            int c_id;
                            System.out.print("enter the customer_id : ");
                            c_id = sc.nextInt();
                            
                            for(int i=0;i<2;i++){
                                if(c_id == c[i].get_customer_id())
                                {
                                    c[i].display();
                                }
                            }
                            break;
                case 2:
                        System.out.print("enter the customer id : ");
                        c_id = sc.nextInt();

                        for(int i=0;i<2;i++)
                        {
                            if(c_id == c[i].get_customer_id());
                            {
                                System.out.print("enter the amount you want to take loan : ");
                                int l_amount = sc.nextInt();
                                if(l_amount > Customer.get_credit_limit())
                                    {
                                        System.out.println("\namount is greater than credit limit");
                                        break;
                                    }
                                else if(l_amount <= Customer.get_credit_limit())
                                    {
                                        c[i].add_loan(l_amount); 
                                        break;
                                    }
                            }
                        }

                        break;

                case 3: System.out.println("wrong choice \n\nplz enter the correct case");
                        break;
            }
        } while (true);
    }
}