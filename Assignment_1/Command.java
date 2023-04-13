/* Q2. Write a program that accepts number of command line parameters and displays the parameters and 
count of such parameters. */


public class Command {
    public static void main(String[] args) {
        int count = Integer.parseInt("0");

        for(int i=0;i<args.length;i++)
            {
                System.out.println(args[i]);
                count++;
            }

        System.out.println("total count : "+count);
    }
}
