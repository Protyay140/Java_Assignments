/* Q6. Write a program where class contains void show(int) to display the argument passed. Call the 
function once with short as actual parameter and again double as actual parameter. Add another 
function as void show(double) . Repeat the calls. Observe the outcomes in each case. ......*/

class Check{

    public void show(int n)
    {
        System.out.println("I am an integer");
    }
    public void show(double d)
    {
        System.out.println("I am a double");
    }
}

public class Func {
    public static void main(String[] args) {
        short a = Short.parseShort("5");
        double d = Double.parseDouble("5.55");

        Check c = new Check();

        c.show(a);
        c.show(d);
        
    }
}
