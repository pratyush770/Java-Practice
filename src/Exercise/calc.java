package Exercise;
import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String getMessage() {
        return "Please enter a valid input";
    }
}
class ZeroDivisonException extends Exception{
    @Override
    public String getMessage() {
        return "Cannot divide by zero";
    }
}
class MaxInputException extends Exception{
    @Override
    public String getMessage() {
        return "Maximum limit for input reached. Please enter an input less than 100000";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String getMessage() {
        return "Maximum multiplication input limit reached. Please enter an input less than 7000";
    }
}
public class calc {
    public static void Addition(int a,int b){
        int c;
        c=a+b;
        System.out.println("The addition of the two numbers is : " + c);
        }
    public static void Subtraction(int a,int b){
        int c;
        c=b-a;
        System.out.println("The subtraction of the two numbers is : " + c);
    }
    public static void Multiplication(int a,int b){
        int c;
        c=a*b;
        System.out.println("The multiplication of the two numbers is : " + c);
    }
    public static void Division(int a,int b){
        int c;
        c=b/a;
        System.out.println("The division of the two numbers is : " + c);
    }
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator performing basic operations");
        do{
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Exit");
        System.out.print("Enter your choice : ");
        ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter the first number : ");
                a = sc.nextInt();
                System.out.print("Enter the second number : ");
                b = sc.nextInt();
                if(a==8 && b==9){
                    try{
                        throw new InvalidInputException();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                else if (a > 100000 || b > 100000 || a > 100000 && b > 100000) {
                    try {
                        throw new MaxInputException();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    Addition(a, b);
                }
                break;
            case 2:
                System.out.print("Enter the first number : ");
                a = sc.nextInt();
                System.out.print("Enter the second number : ");
                b = sc.nextInt();
                if(a==8 && b==9){
                    try{
                        throw new InvalidInputException();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                else if (a > 100000 || b > 100000 || a > 100000 && b > 100000) {
                    try {
                        throw new MaxInputException();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    Subtraction(a, b);
                }
                break;
            case 3:
                System.out.print("Enter the first number : ");
                a = sc.nextInt();
                System.out.print("Enter the second number : ");
                b = sc.nextInt();
                if(a==8 && b==9){
                    try{
                        throw new InvalidInputException();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                else if (a > 100000 && b > 100000 || a > 100000 || b > 100000) {
                    try {
                        throw new MaxInputException();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else if (a > 7000 && a <=100000 || b > 7000 && b <= 100000 ||
                        a > 7000 && a <=100000 && b > 7000 && b <= 100000){
                    try{
                        throw new MaxMultiplierException();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    Multiplication(a, b);
                }
                break;
            case 4:
                System.out.print("Enter the first number : ");
                a = sc.nextInt();
                System.out.print("Enter the second number : ");
                b = sc.nextInt();
                if(a==8 && b==9){
                    try{
                        throw new InvalidInputException();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                else if (b == 0) {
                    try {
                        throw new ZeroDivisonException();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else if (a > 100000 || b > 100000 || a > 100000 && b > 100000) {
                    try {
                        throw new MaxInputException();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    Division(a, b);
                }
                break;
            case 5:
                return;
            default:
                System.out.println("You have entered wrong choice");
            }
        }while(ch!=5);
    }
}
