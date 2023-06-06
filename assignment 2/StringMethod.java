import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        // String s = new String("amanabamana");
        Scanner sc = new Scanner(System.in);

        String s = new String();
        s = sc.nextLine();

        // number of times 'a' appears .....................
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("count of a is : "+count);


        // number of times "and" appears ..................
        int f=0,lcount=0;
        for(int i=0;((i<s.length())&&((f+3)<=s.length()));i++){
            if((s.substring(f,f+3)).equals("and")){
                lcount++;
            }
            f++;
        }
        System.out.println("cout of and is "+lcount);

        // Starsts with "the"........................
        if(s.startsWith("The") == true){
            System.out.println("Yes the string starts with .... The...");
        }
        else{
            System.out.println("No the string starts with .... The...");
        }

        // put the string into an array.......
        int n=s.length();
        char []c = new char[n];
        for(int i=0;i<n;i++){
            c[i]=s.charAt(i);
        } 
        for(char x:c){
            System.out.println(x);
        }

        //display the tokens in the string .................
        
        
        
        
        int l=0;
        for(int i=0;i<n;i++){
            if((s.charAt(i) == '@') ||(s.charAt(i)==' ')|| (s.charAt(i) == '.')){
               System.out.println(s.substring(l,i));
               l=i+1;
            }
        }
        System.out.println(s.substring(l,n));
    }
}
