package JAVA;
import java.util.Scanner;

// 1)Display employee details
//class Employee{
//    int salary;
//    String name;
//
//    public void getsalary(){
//        System.out.println("The salary of the employee is : "+salary);
//    }
//    public void getname(){
//        System.out.println("The name of the employee is : "+name);
//    }
//}

// 2)Area and perimeter of square
//class Square{
//    int side;
//    public void area(){
//        int a;
//        a=side*side;
//        System.out.printf("The area of the square is : %d",a);
//    }
//    public void perimeter(){
//        int p;
//        p=side+side;
//        System.out.printf("\nThe perimeter of the square is : %d",p);
//    }
//}


// 3)Usage of private access modifier using getter and setter method
//class Employee{
//    private int id;
//    private String name;
//
//    public void setId(int i){
//        id=i;
//    }
//    public int getId(){
//        return id;
//    }
//    public void setName(String n){
//        name=n;
//    }
//    public String getName(){
//        return name;
//    }
//}

// 4)Constructor in JAVA
//class Employee{
//    int id;
//    String name;
//    public Employee(){   // Default constructor
//        id=1234;
//        name="Pratyush";
//    }
//    public Employee(int i,String n){   // Parameterized constructor
//        id=i;
//        name=n;
//    }
//}


// 5) Volume and surface area of a cylinder
//class Cylinder{
//    int radius;
//    int height;
//    Cylinder(int r,int h){
//        radius=r;
//        height=h;
//    }
//    public double surfaceArea(){
//        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius  * height;
//    }
//    public double volume(){
//        return Math.PI * radius * radius * height;
//    }
//}


// Inheritance in JAVA
//class Base{  // Base class
//    String name;
//    Base(){
//        name="Pratyush";
//    }
//    public String getName(){
//        return name;
//    }
//}
//class Derived extends Base{  // Derived class
//    int id;
//    Derived(){
//        id=1234;
//    }
//    public int getId(){
//        return id;
//    }
//}


// Constructors in inheritance
//class a{
//    int c;
//    a(){
//        System.out.println("Hi i am a base class constructor with no argument");
//    }
//    a(int i){
//        c=i;
//        System.out.println("Hi i am a base class constructor with an argument which is : " + c);
//    }
//}
//class b extends a{
//    b(){
//        System.out.println("Hi i am a derived class constructor");
//    }
//    b(int i,int j){
//        super(i); // takes value from base class
//        System.out.printf("Hi i am a derived class constructor with arguments %d and %d",i,j);
//    }
//}


// Method overriding
//class a{
//    public void meth1(){
//        System.out.println("Hello India");
//    }
//}
//class b extends a{
//    @Override  // annotation for overriding (optional but recommended)
//    public void meth1(){
//        System.out.println("Hello Pakistan");
//    }
//}


// Dynamic method dispatch/Runtime polymorphism
//class Phone{
//    public void met1(){
//        System.out.println("Hi");
//    }
//    public void met2(){
//        System.out.println("This is my phone");
//    }
//}
//class SmartPhone extends Phone{
//    public void met3(){  // to execute this method create reference for derived class i.e. SmartPhone s = new SmartPhone();
//        System.out.println("I am derived class");
//    }
//    public void met2(){
//        System.out.println("This is my smartphone");
//    }
//}


// Abstract class
//abstract class Parent{  // abstract class
//    abstract public void greet();   // abstract method
//}
//class Child extends Parent{
////    @Override
//    public void greet(){  // will work only for overriden method
//        System.out.println("I am overriden method from base class");
//    }
//    public void show(){  // will not work if the above method greet() is not written
//        System.out.println("Hello World");
//    }
//}
//class Child1 extends Parent{  // it must be either declared abstract or implement the abstract method greet();
//    public void show(){  // will not execute
//        System.out.println("Hello");
//    }
//}
public class Oops {
    public static void main(String[] args) {
        // Problem 1
//        Employee e = new Employee();
//        e.salary=2000;
//        e.name="Pratyush";
//        e.getsalary();
//        e.getname();

        // Problem 2
//        Square s= new Square();
//        s.side=3;
//        s.area();
//        s.perimeter();

        // Problem 3
//        Scanner sc= new Scanner(System.in);
//        int i;
//        String n;
//        System.out.print("Enter the id of the employee : ");
//        i=sc.nextInt();
//        System.out.print("Enter the name of the employee : ");
//        n= sc.next();
//        Employee e= new Employee();
//        e.setId(i);
//        System.out.println("The id of the employee is : " + e.getId());
//        e.setName(n);
//        System.out.println("The name of the employee is : " + e.getName());

        // Problem 4
//        Employee e = new Employee();  // Default constructor
//        System.out.println("The id of the employee is : " + e.id);
//        System.out.println("The name of the employee is : " + e.name);

//        Scanner sc= new Scanner(System.in);   // Parameterized constructor
//        int i;
//        String n;
//        System.out.print("Enter the id of the employee : ");
//        i=sc.nextInt();
//        System.out.print("Enter the name of the employee : ");
//        n=sc.next();
//        Employee e= new Employee(i,n);
//        System.out.println("The id of the employee is : " + e.id);
//        System.out.println("The name of the employee is : " + e.name);

        // Practice Problem
        // 1) Volume and surface area of a cylinder
//        int r,h;
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the height of the cylinder : ");
//        h=sc.nextInt();
//        System.out.print("Enter the radius of the cylinder : ");
//        r=sc.nextInt();
//        Cylinder c = new Cylinder(h,r);
//        System.out.println("The surface area of the cylinder is : " + c.surfaceArea());
//        System.out.println("The volume of the cylinder is : " + c.volume());

        // Inheritance in JAVA
//        Derived d = new Derived();  // Always create object for derived class
//        System.out.println("The name of the student is : " + d.getName());
//        System.out.println("The id of the student is : " + d.getId());

        // Constructors in inheritance
//        b obj= new b ();  // executes constructors with no arguments
//        b obj1 = new b(5,8);  // executes constructors with arguments

        // Method overriding
//        a obj = new a();
//        obj.meth1(); // will execute method from base class
//        b obj1= new b();
//        obj1.meth1();  // will override base class method and execute derived class method

        // Dynamic method dispatch/Runtime polymorphism
//        Phone obj=new SmartPhone();  // creating reference for derived class using base class
//        obj.met1();
//        obj.met2();  // it will show method of derived class
//        obj.met3(); // not allowed

        // Abstract class
//        Child c = new Child();
//        Child1 c1 = new Child1();   // will not execute
//        c.greet();
    }
}
