/* Q9. Design a BankAcct class with account number, balance and interest rate as attribute. Interest rate is 
same for all account. Support must be there to initialize, change and display the interest rate. Also 
supports are to be there to return balance and calculate interest.............*/

import java.util.Scanner;

class Account {
    private String acc_num;
    private float balance;
    private static float rate_of_interest;

    Scanner sc = new Scanner(System.in);

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rate of interest");
        rate_of_interest = sc.nextFloat();
    }

    public Account() {
        // Scanner sc = new Scanner(System.in);

        System.out.println("enter the account number");
        acc_num = sc.next();

        System.out.println("enter the balance");
        balance = sc.nextFloat();

    }

    public String get_acc_num() {
        return acc_num;
    }

    public float get_balance() {
        return balance;
    }

    public static float get_rot() {
        return rate_of_interest;
    }

    public void display() {
        System.out.println("account number : " + acc_num);
        System.out.println("balance : " + balance);
        System.out.println("interest : " + balance * 0.01 * rate_of_interest); // Here the time is "1"........
    }

    public void update_balance() {

        System.out.println("enter the new balance : ");
        balance = sc.nextFloat();

    }
}

public class BankAccount {

    public static void main(String[] args) {
        Account accounts[] = new Account[2];
        accounts[0] = new Account();
        accounts[1] = new Account();
        // accounts[2] = new Account();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].display();
        }

        System.out.println("enter the account number to update the balance : ");
        String s = sc.next();

        for (int i = 0; i < accounts.length; i++) {
            if (s.equals(accounts[i].get_acc_num())) { // to check the entered account number is matched or not...
                accounts[i].update_balance();
                break;
            }
        }

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].display();
        }
    }
}