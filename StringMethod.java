import java.util.Scanner;
class Method{
    private String word;
    Scanner sc = new Scanner(System.in);

    public void a_appear(){
        System.out.println("enter the word");
        word = sc.nextLine();
        
        int count = 0;
        for(int i=0;i<word.length();i++){
            if('a' == word.charAt(i)){
                count++;
            }
        }
        System.out.println("number of 'a' appears in the word : "+count);
    }

    public void and_appear(){
        System.out.println("enter the word");
        word = sc.nextLine();
        
        int count = 0;
        for(int i=0;i<word.length()-2;i++){
            String temp = word.substring(i, i+3);
            if(temp.equals("and") == true)
            {
                count++;
            }
            // System.out.println(word.substring(i, i+3));
        }
        System.out.println("number of 'and' appears in the word : "+count);
    }

    public void starts_with_the(){
        System.out.println("enter the word");
        word = sc.nextLine();
        if(word.substring(0, 3).equals("The")==true){
            System.out.println("it starts with 'The' ");
        }else{
            System.out.println("it does not start with 'The' ");
        }
    }

    public void convert_character_array(){
        System.out.println("enter the word");
        word = sc.nextLine();

        for(int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }
    }

    public void Tokens(){
        System.out.println("enter the word");
        word = sc.nextLine();

        int i=0,k=0;
        for(i=0;i<word.length();i++){
            if(word.charAt(i)=='@' || word.charAt(i)==' ' || word.charAt(i)== '.'){
                String temp = word.substring(k, i);
                System.out.println(temp);
                k=i+1;
            }
        }
        System.out.println(word.substring(k,i));
    }
}

public class StringMethod {
    public static void main(String[] args) {
        Method m = new Method();
        // m.a_appear();
        // m.and_appear();
        // m.starts_with_the();
        // m.convert_character_array();
        // m.Tokens();

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("1.'a' appears in the string\n2.'and' appears in the string\n3.Whether it starts with 'The' or not\n4.put the string into an array of characters\n5.display the tokens");
            int ch;
            System.out.println();
            System.out.println("enter your choice");
            ch = sc.nextInt();

            switch(ch){
                case 1 : m.a_appear();
                         break;
                case 2 : m.and_appear();
                         break;
                case 3 : m.starts_with_the();
                         break;
                case 4 : m.convert_character_array();
                         break;
                case 5 : m.Tokens();
                         break;
                default : System.out.println("wrong choice");
                          break;
            }

        }while(true);
    }
}
