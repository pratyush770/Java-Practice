package JAVA;
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

public class Oops2 {
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

//         Practice question
//         1) Class Monkey with interface BasicAnimal
//        Human h = new Human();
//        h.eat();
//        h.sleep();
//        h.jump();
//        h.bite();

//        Demonstrating polymorphism in class and interface
//        Monkey m =new Human();  // works only for methods of class Monkey
//        m.jump();
//        m.eat();  // will not work
//        BasicAnimal b = new Human();  // works only for methods of interface BasicAnimal
//        b.eat();
//        b.jump();  // will not work
    }
}
