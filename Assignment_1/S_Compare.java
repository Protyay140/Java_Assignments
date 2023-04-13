import javax.sound.sampled.SourceDataLine;
/*Q5. Write a program that accepts a String and assigns it to another. Check the outcome of comparison 
with == and equals() method. Take two Strings and put same input for them. Repeat the equality 
checking. Observe the outcome.
*/

public class S_Compare {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();

        s1 = "internet";
        s2 = "internet";
        String s3 = new String("internet");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }

}
