import java.util.Scanner;

class EachStudent {
    private int roll;
    private String name;
    private int score;

    Scanner sc = new Scanner(System.in);
    public EachStudent(){
        System.out.println("enter the roll : ");
        roll = sc.nextInt();

        System.out.println("enter the name : ");
        name = sc.nextLine();

        sc.nextLine();
        System.out.println("enter the score : ");
        score = sc.nextInt();
    
        
    }
        // public void display(){
        //     System.out.println("roll : "+roll);
        //     System.out.println("name : "+name);
        //     System.out.println("score : "+score);
        // }

    public void display(){
        System.out.println("roll : "+roll);
        System.out.println("name : "+name);

        try{
            if((score<0) || (score>100))
            throw new ArithmeticException("score cannot be non-negative and cannot be exceed 100");
            
            System.out.println("score : "+score);
        }catch(ArithmeticException e){
            System.out.println("my catch : "+e.getMessage());
        }
        
    }
}

public class ExcepStudent{
    public static void main(String[] args) {
        EachStudent s = new EachStudent();
        s.display();
    }
}
