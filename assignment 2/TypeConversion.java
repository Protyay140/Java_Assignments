import java.util.Scanner;
class Conversion{
    public void basic_to_object(){

        Integer in = Integer.valueOf(10);
        
        System.out.println(in);
    
    }
    public void object_to_basic(){
        
        Integer in = Integer.valueOf(20);
        
        int i = in.intValue();
        
        System.out.println(i);
    
    }
    public void basic_to_string(){
        
        String str = String.valueOf(30);
        
        System.out.println(str);
    }
    public void string_to_object(){
        
        String str = "100";
        
        Integer in = Integer.valueOf(str);
        
        System.out.println(in);
    }
    public void object_to_string(){
        
        Integer in = Integer.valueOf(200);
        
        String str =  in.toString();
        
        System.out.println(str);
    }
}

public class TypeConversion{
    public static void main(String[] args) {
        Conversion c = new Conversion();
        c.basic_to_object();
        // c.object_to_basic();
        // c.basic_to_string();
        // c.string_to_object();
        // c.object_to_string();
    }
}
