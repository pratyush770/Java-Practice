package JAVA;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

// Interface in JAVA
//interface Student{  // interface 1
//    public void Learn();  // methods having empty bodies
//    public void Revise();
//}
//interface Teacher{  // interface 2
//    public void Teach();
//}
//class School implements Student,Teacher{  // use implements instead of extends
//    public void Learn(){  // requires all methods of interfaces
//        System.out.println("Student is learning");
//    }
//    public void Revise(){
//        System.out.println("Student is revising");
//    }
//    public void Teach(){
//        System.out.println("Teacher is teaching");
//    }
//    public void Extra(){
//        System.out.println("I am an extra method");
//    }
//}


// Default method in JAVA
//interface Camera{
//    public void takePic();  // typing public is optional as it is public by default
//    private void CameraQuality(){  // It cannot be called since it is private
//        System.out.println("The quality of camera is 4k");
//    }
//    default void CameraName(String n){  // method is declared default using default keyword
//        CameraQuality();  // private method can be called in default method
//        System.out.println("The name of the camera is : " + n);
//    }
//}
//class CellPhone{
//    public void myPhone(String n){
//        System.out.println("The name of my cellphone is : " + n);
//    }
//}
//class SmartPhone extends CellPhone implements Camera{
//    public void takePic(){
//        System.out.println("The picture is captured successfully");
//    }
//}


// Inheritance in interface
//interface a {
//    void meth1();
//}
//interface b extends a{  // a interface gets extended in interface b using keyword extends
//    void meth2();
//}
//class c implements b{
//    public void meth1(){
//        System.out.println("Hello");
//    }
//    public void meth2(){
//        System.out.println("World");
//    }
//}


// Polymorphism in interface
//interface Camera{
//    void takePic();
//}
//interface GPS{
//    void TrackLocation();
//}
//class SmartPhone implements Camera,GPS{
//    public void takePic(){
//        System.out.println("Picture taken successfully");
//    }
//    public void TrackLocation(){
//        System.out.println("Location tracked successfully");
//    }
//}


// Practice Question
//class Monkey{
//    public void jump(){
//        System.out.println("Monkey is jumping");
//    }
//    public void bite(){
//        System.out.println("monkey is biting");
//    }
//}
//interface BasicAnimal{
//    void eat();
//    void sleep();
//}
//class Human extends Monkey implements BasicAnimal{
//    public void eat(){
//        System.out.println("Monkey is eating");
//    }
//    public void sleep(){
//        System.out.println("monkey is sleeping");
//    }
//}


// Creating a thread by extending thread class
// Method 1 ( Default method with no parameters )
//class MyThread extends Thread{
//    @Override
//    public void run() {  // use run method for executing thread
//        int i = 0;
//        while (i < 20) {
//            System.out.println("This is method 1");
//            try{
//                Thread.sleep(500);
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//            i++;
//        }
//    }
//}
//class MyThread1 extends Thread{
//    @Override
//    public void run(){
//        int i =0;
//        while(i < 20) {
//            System.out.println("This is method 2");
//            try{
//                Thread.sleep(500);   // will take a 500 millisecond gap after each iteration
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//            i++;
//        }
//    }
//}

// Creating a thread by implementing Runnable interface
// Method 2 ( Taking Runnable r as a parameter)
//class MyThread implements Runnable{
//    public void run(){ // will not work without this run() method
//        int i = 0;
//        while(i<20){
//            System.out.println("This is method 1");
//            i++;
//        }
//    }
//}
//class MyThread1 implements Runnable{
//    public void run(){
//        int i =0;
//        while(i<20){
//            System.out.println("This is method 2");
//            i++;
//        }
//    }
//}

// Constructors from Thread class in JAVA ( 2 methods already done)
// Method 3 ( Taking String name as a parameter)
//class MyThread extends Thread {
//    MyThread(String name){
//        super(name); // the name is taken from Thread class so super(name) is used
//    }
//    public void run(){
//        System.out.println("I am a thread");
//    }
//}

// Method 4 ( Taking Runnable r as well as String name as a parameter)
//class MyThread extends Thread implements Runnable{
//    MyThread(String name){
//        super(name);
//    }
//    public void run(){
//        System.out.println("I am a method ");
//    }
//}


// JAVA Thread priorities
//class MyThread extends Thread{
//    public void run(){
//        int i = 0;
//        while(i<10) {
//            System.out.println("This is method 1 which is MIN_PRIORITY");
//            i++;
//        }
//    }
//}
//class MyThread1 extends Thread{
//    public void run(){
//        int i = 0;
//        while(i<10) {
//            System.out.println("This is method 2 which is NORM_PRIORITY");
//            i++;
//        }
//    }
//}
//class MyThread2 extends Thread{
//    public void run(){
//        int i = 0;
//        while(i<10) {
//            System.out.println("This is method 3 which is MAX_PRIORITY");
//            i++;
//        }
//    }
//}


// Exception class in JAVA
//class NegativeNumberException extends Exception {
//    @Override
//    public String getMessage() {
//        return "The entered number is negative";
//    }
//
//    @Override
//    public String toString() {
//        return "Please enter a positive number";
//    }
//}
public class Oops2 {
    // throws keyword usage
//    public static int Square(int a) throws NegativeNumberException{
//        int area;
//        if(a<0){
//            throw new NegativeNumberException();
//        }
//        else {
//            area = a * a;
//            return area;
//        }
//    }
    public static void main(String[] args) {
        // Interface in JAVA
//        School s = new School();
//        s.Learn();
//        s.Revise();
//        s.Teach();
//        s.Extra();

        // Default method in JAVA
//        SmartPhone sc = new SmartPhone();
//        sc.takePic(); // method of interface is called
//        sc.CameraName("Nikon");  // default method is called along with the private method defined in the interface
//        sc.myPhone("Redmi Note 7 Pro");  // method of the base class is called

        // Inheritance in interface
//        c obj = new c();
//        obj.meth1();
//        obj.meth2();

        // Polymorphism in interface
//        Camera c = new SmartPhone();  // will work only for methods of camera interface
//        c.takePic();
//        c.TrackLocation();  // will not work

        // Practice question
//         1) Class Monkey with interface BasicAnimal
//        Human h = new Human();
//        h.eat();
//        h.sleep();
//        h.jump();
//        h.bite();

        // Demonstrating polymorphism in class and interface
//        Monkey m =new Human();  // works only for methods of class Monkey
//        m.jump();
//        m.eat();  // will not work
//        BasicAnimal b = new Human();  // works only for methods of interface BasicAnimal
//        b.eat();
//        b.jump();  // will not work

        // Creating a thread by extending Thread class ( Method 1 )
//        MyThread t1 = new MyThread();
//        MyThread1 t2 = new MyThread1();
//        t1.start();  // start() method is used to run the thread
//        try{
//            t1.join();  // will execute t1 first and then t2
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        t2.start();
//        System.out.println(t1.getState());   // returns the state of the thread
//        System.out.println(t2.getState());
//        System.out.println(Thread.currentThread().getState());  // returns the state of the current thread

        // Creating a thread by implementing Runnable interface ( Method 2 )
//        MyThread m1 = new MyThread();
//        Thread t1 = new Thread(m1);  // create thread object for this type of thread creation
//        MyThread1 m2 = new MyThread1();
//        Thread t2 = new Thread(m2);
//        t1.start();
//        t2.start();

        // Method 3 ( Taking string as a parameter )
//        MyThread t1 = new MyThread("Pratyush");
//        t1.start();
//        System.out.println("The id of the thread is " + t1.getId()); // will give the id of the thread
//        System.out.println("The name of the thread is " + t1.getName());  // will give the name of the thread

        // Method 4 ( Taking String name as well as Runnable r as parameters )
//        MyThread m1 = new MyThread("Pratyush");
//        Thread t1 = new Thread(m1);
//        t1.start();
//        System.out.println("The id of the string is : " + t1.getId());

        // JAVA Thread priorities
//        MyThread m1 = new MyThread();
//        MyThread1 m2 = new MyThread1();
//        MyThread2 m3 = new MyThread2();
//        // setPriority() is used to set the priority
//        m1.setPriority(Thread.MIN_PRIORITY); // MIN_PRIORITY = 1;
//        m2.setPriority(Thread.NORM_PRIORITY); // NORM_PRIORITY = 5;
//        m3.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10;
//        m1.start();
//        m2.start();
//        m3.start();

        // Try Catch block in JAVA
//        int a ;
//        try{
//            System.out.print("Enter a number : ");
//            Scanner sc = new Scanner(System.in);
//            a=sc.nextInt();
//            System.out.println("The entered number is : " + a); // will work if there is no error
//        }
//        catch(Exception e){
//            System.out.println("An exception has occured which is : " + e);  // will display if there is an error
//        }
//        System.out.println("End of the program");  // will display if try catch block is used otherwise it will display only if there is no error

        // Exception class in JAVA using throw keyword
//        int a;
//        System.out.print("Enter a number : ");
//        Scanner sc = new Scanner(System.in);
//        a=sc.nextInt();
//        if(a<0){
//            try{
//                throw new NegativeNumberException();
//            }
//            catch(Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e);  // executes toString method or can also be declared explicitly
//            }
//        }
//        else{
//            System.out.println("The entered number is : " + a);
//        }

        // try catch with usage of throws keyword
//        try{
//            int r;
//            System.out.print("Enter the side : ");
//            Scanner sc = new Scanner(System.in);
//            r=sc.nextInt();
//            int s = Square(r);
//            System.out.println("The area of the square is : " + s);
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}
