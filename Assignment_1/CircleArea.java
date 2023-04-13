/* Q3. Write a program that accepts radius of a circle and displays area of the circle. Declare a constant pi 
equals to 3.14 using OOP concept.
*/

import java.util.Scanner;
class Circle{
    private float radius;
    final double PI = 3.14;
    
    Scanner sc = new Scanner(System.in);

    public Circle(){
        radius = 0;
    }
    public void setRadius(){
        System.out.println("enter the radius");
        radius = sc.nextFloat();        
    }
    public void getArea(){
        System.out.println("area : "+ (PI*radius*radius));
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius();
        c.getArea();
    }    
}
