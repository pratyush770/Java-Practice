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
    }
}
