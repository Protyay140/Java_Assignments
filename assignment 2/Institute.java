// For every person in an institute details like name, address (consists of premises number, street, city,
// pin and state), phone number, e-mail id are maintained. A person is either a student or a faculty. For
// student roll number and course of study are also be maintained. For faculty employee id, department
// and specialisation are to be stored. One should be able to view the object details and set the attributes.
// For address, one may change it partially depending on the choice. Design and implement the classes.

import java.util.Scanner;

class Person{
    private String name;
    private String adress;
    private String phone_number;
    private String email;

    Scanner sc = new Scanner(System.in);

    public Person(){
        System.out.print("enter the name : ");
        name = sc.nextLine();

        System.out.print("enter the adress : ");
        adress = sc.nextLine();

        System.out.print("enter the phone number : ");
        phone_number = sc.nextLine();

        System.out.print("enter the email : ");
        email = sc.nextLine();

    }
    public String get_name()
    {
        return name;
    }
    public String get_adress()
    {
        return adress;
    }
    public String get_phoneNumber()
    {
        return phone_number;
    }
    public String get_email()
    {
        return email;
    }
    public void edit(String s)
    {
        adress = s;
    }
}

class Student extends Person{
    private int roll_number;
    private String course;
    
    Scanner sc = new Scanner(System.in);

    public Student(){
        super();
        System.out.print("enter the roll number : ");
        roll_number = sc.nextInt();

        sc.nextLine();
        System.out.print("enter the course name : ");
        course = sc.nextLine();
    }

    public void display()
    {
        System.out.println("name : "+get_name());
        System.out.println("adress : "+get_adress());
        System.out.println("email : "+get_email());
        System.out.println("phone number : "+get_phoneNumber());
        System.out.println("roll number : "+roll_number);
        System.out.println("department : "+course);
    }

    public int get_roll()
    {
        return roll_number;
    }

    public void edit()
    {
        System.out.println("enter the new adress : ");
        String add = sc.nextLine();

        edit(add);
    }
}

class Faculty extends Person{ 
    private int faculty_id;
    private String department;
    private String specialisation;

    Scanner sc = new Scanner(System.in);

    public Faculty(){
        super();
        System.out.print("enter the faculty id : ");
        faculty_id = sc.nextInt();

        sc.nextLine();

        System.out.print("enter the department : ");
        department = sc.nextLine();

        System.out.print("enter the specialisation : ");
        specialisation = sc.nextLine();
    }

    public int get_fId()
    {
        return faculty_id;
    }

    public void edit()
    {
        System.out.println("enter the new adress : ");
        String add = sc.nextLine();

        edit(add);
    }

    public void display()
    {
        System.out.println("name : "+get_name());
        System.out.println("adress : "+get_adress());
        System.out.println("email : "+get_email());
        System.out.println("phone number : "+get_phoneNumber());
        System.out.println("faculty id : "+faculty_id);
        System.out.println("department : "+department);
        System.out.println("specialisation : "+specialisation);
    }
}

public class Institute {
    public static void main(String[] args) {
        System.out.println("student's informations\n");
        Student s = new Student();
        System.out.println("\n\nfaculty's informations\n");
        Faculty f = new Faculty();

        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("\n\n1.display students \n2.display faculty \n3.edit students information\n4.edit faculty information");
            int ch;
            System.out.println("enter your choice : ");
            ch = sc.nextInt();

            switch(ch){
                case 1  : 
                         s.display(); 
                         break;
                
                case 2  : 
                         f.display();
                         break;

                case 3  : 
                         System.out.println("enter student's roll : ");
                         int s_roll = sc.nextInt();
                         if(s_roll == s.get_roll())
                            {
                                s.edit();
                            }
                         else{
                            System.out.println("roll number is wrong...");
                         }
                         break;
                         
                case 4  : 
                        System.out.println("enter faculty id : ");
                        int f_id = sc.nextInt();
                        if(f_id == f.get_fId())
                        {
                            f.edit();
                        }
                        else{
                            System.out.println("faculty id is wrong...");
                         }
                         break;
            }

        }while(true);
    }
}
