import java.util.Scanner;  // for taking input from the user
public class Main {
    public static void main(String[] args) {
        //System.out.println("JAVA Practice");


        // Literals in JAVA
//        int a=10;
//        byte b=20;
//        short c=1233;
//        long d=55555L;
//        char e='A';
//        boolean f=true;
//        float g=2.56F;
//        double h=2.6666;
//        String i="Hello"; //extra literal provided by java
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);
//        System.out.println(i);


        // Addition of two numbers by taking input from the user
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the first number : ");
//        int a=sc.nextInt();
//        System.out.print("Enter the second number : ");
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.print("The addition of the two numbers is : ");
//        System.out.println(sum);
//        System.out.print("Enter the string : ");
//        String str=sc.nextLine(); //for reading all the words and for reading only 1 word use only next();
//        System.out.println(str);


        // Calculating percentage for 5 subjects by taking inputs from the user
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the marks of the first subject : ");
//        float a=sc.nextFloat();
//        System.out.print("Enter the marks of the second subject : ");
//        float b=sc.nextFloat();
//        System.out.print("Enter the marks of the third subject : ");
//        float c=sc.nextFloat();
//        System.out.print("Enter the marks of the fourth subject : ");
//        float d=sc.nextFloat();
//        System.out.print("Enter the marks of the fifth subject : ");
//        float e=sc.nextFloat();
//        float sum=((a+b+c+d+e)/500)*100;
//        System.out.print("You got " + sum + "%");


        // Increment and Decrement operator usage
//        int a = 10;  // first value is assigned (10) and then it is incremented
//        System.out.println(a++); // it will show 10
//        int b = 12;  // first value is incremented (13) and then it is assigned
//        System.out.println(++b); // it will show 13
        // same logic applies for a-- and --b


        // Type casting in JAVA
//        float a = 10.0f + 2;  // float + int = float
//        int sum= (int) (a); // converts the float into integer
//        System.out.println(sum); // it shows 12 and not 12.0


        // printf usage
//        float a = 10.123f;
//        float b = 12.111f;
//        float c= a+b;
//        System.out.printf("The sum of the two numbers is : %f",c);  // returns answer with all decimal points
//        System.out.printf("\nThe sum of the two numbers is : %.2f",c); // returns answer with only 2 decimal points (%.2f)
//        System.out.printf("\nThe sum of the two numbers is : %8.3f",c); // returns answer in total 8 spaces with only 3 decimal points


        // String methods in JAVA
        //String a =" Pratyush ";
//        int val=a.length();  // returns the length of the string
//        System.out.println(val);
//        String val1=a.toLowerCase();  // converts the string into lowercase alphabets
//        System.out.println(val1);
//        String val2=a.toUpperCase();  // converts the string into uppercase alphabets
//        System.out.println(val2);
//        String val3=a.trim();   // removes all spaces from the starting and ending
//        System.out.println(val3);
//        String val4=a.substring(3);  // returns a substring from the specified starting point
//        System.out.println(val4);
//        String val5=a.substring(2,8); // returns a substring from the specified starting point and end point but end point gets excluded
//        System.out.println((val5));
//        String val6=a.replace('r','a');  // replaces the character in the string
//        System.out.println(val6);
//        String val7=a.replace("rat","ttt");  // replaces multiple characters in the string
//        System.out.println(val7);
//        boolean val8=a.startsWith(" Pr");  // returns true if the string starts with the specifies character
//        System.out.println(val8);
//        boolean val9=a.endsWith("sh ");  // returns true if the string ends with the specifies character
//        System.out.println(val9);
//        char val10=a.charAt(2);  // returns character at a given index position
//        System.out.println(val10);
//        int val11=a.indexOf("at");  // returns the index of the string but only the first occurence
//        System.out.println(val11);
//        int val12=a.indexOf("y",2);  // returns the index of the string starting from the mentioned index and returns -1 if not matched
//        System.out.println((val12));
//        int val13=a.lastIndexOf("t");  // returns the index of the string from ending
//        System.out.println(val13);
//        int val14=a.lastIndexOf("t",5); // returns the index of the string from ending from the mentioned index and retunrs -1 if not matched
//        System.out.println(val14);
//        boolean val15=a.equals(" Pratyush ");  // returns true if the string is equal to the mentioned string
//        System.out.println(val15);
//        boolean val16=a.equalsIgnoreCase(" pratyusH ");  // returns true if the string is equal to the mentioned string ignoring the case of the characters
//        System.out.println(val16);


        // Switch statement in JAVA
//        int age;
//        System.out.print("Enter your age : ");
//        Scanner sc=new Scanner(System.in);
//        age=sc.nextInt();
//        switch(age){
//            case 18 :
//                System.out.println("You're an adult now!");
//                break;
//            case 23 :
//                System.out.println("You're an employee now!");
//                break;
//            default :
//                System.out.println("Enjoy your life!");
//        }

        // Practice Questions
        // 1)Enter number for getting specific day
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number for getting day (1-7) : ");
//        int day=sc.nextInt();
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }

        // 2)Find leap year or not by taking input from the user
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the year to check whether it is a leap year or not : ");
//        int yr=sc.nextInt();
//        if((yr%4==0 && yr%100!=0)||yr%400==0){
//            System.out.println("It is a leap year");
//        }
//        else{
//            System.out.println("It is not a leap year");
//        }

        // 3)Find whether the site is an indian,commercial or organizational website
//        System.out.print("Enter the name of the website : ");
//        Scanner sc= new Scanner(System.in);
//        String site=sc.next();
//        if(site.endsWith(".in")){
//            System.out.println("It is an indian website");
//        }
//        else if(site.endsWith(".org")){
//            System.out.println("It is an organizational website");
//        }
//        else if(site.endsWith(".com")){
//            System.out.println("It is a commercial website");
//        }


        // Factorial of a number
//        System.out.print("Enter a number : ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i;
//        int f=1;
//        for(i=1;i<=n;i++){
//            f=f*i;
//        }
//        System.out.printf("The factorial of the given number is : %d",f);


        // Printing array methods
//        int [] marks={1,2,3,4,5};
////        for(int i=0;i<marks.length;i++){    // displays array in straight order
////            System.out.println(marks[i]);
////        }
////        for(int i=marks.length-1;i>=0;i--){     // displays the contents of array in reverse order
////            System.out.println(marks[i]);
////        }
//        for(int element:marks){
//            System.out.println(element);   // for each loop method
//        }


        // Addition of 2 matrices using 2D array
//        int mat1 [][]={{1,2,3},{4,5,6}};
//        int mat2 [][]={{7,8,9},{10,11,12}};
//        int result [][]={{0,0,0},{0,0,0}};
//        System.out.println("The contents of the first matrix are");
//        for(int i=0;i<mat1.length;i++) {    // row number of times
//            for (int j = 0; j < mat1[i].length; j++) {  // column number of times
//                System.out.print(mat1[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        System.out.println("");
//        System.out.println("The contents of the second matrix are");
//        for(int i=0;i<mat1.length;i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.print(mat2[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        System.out.println("");
//        System.out.println("The addition of 2 matrices are as follows");
//        for(int i=0;i<mat1.length;i++){
//            for(int j=0;j<mat1[i].length;j++){
//                result[i][j]=mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j]+ " ");
//            }
//            System.out.println("");
//        }


        // Display array in reverse order ( IMPORTANT FROM DATA STRUCTURE POV )
//        int arr [] ={1,9,3,4,5,6};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);  // for calculating greatest integer of the array
//        int temp;
//        for(int i=0;i<n;i++){
//            // swap a[i] and a[l-1-i]
//            temp=arr[i];   // value of arr[i] gets stored in temp
//            arr[i]=arr[l-1-i];  // value of arr[l-1-i] gets stored in arr[i]
//            arr[l-1-i]=temp;   // value of temp gets stored in arr[l-1-i] hence swaps the 2 numbers
//        }
//        for(int element:arr){
//            System.out.print(element + " ");
//        }


        // Methods in JAVA
//        int a;
//        int b;
//        int c;
//        //Main obj=new Main();   // using object creation
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the first number : ");
//        a=sc.nextInt();
//        System.out.print("Enter the second number : ");
//        b=sc.nextInt();
//        //c=obj.logic(a,b); // using object creation
//        c=logic(a,b);  // without using object creation
//        System.out.print("The addition of the two numbers is : " + c);
// }
//        static int logic(int x,int y){   // without creating object
//        int z;
//        z=x+y;
//        return z;
//    }


//        // Variable Arguments in JAVA
//        System.out.println("The sum of numbers is : " + sum(1,2,3,4));
//    }
//
//    static int sum(int ...arr){
//        int result=0;
//        for(int a:arr){
//            result += a;
//        }
//        return result;
//    }


        // Practice Questions
        // 1)Printing star pattern using function
//        int a;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of lines you want to print : ");
//        a=sc.nextInt();
//        pattern1(a);
//
//    }

//    static void pattern1(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.print("\n");
//        }

        // using recursion
//        if (n > 0)
//            pattern1(n - 1);
//        for (int i = 0; i < n; i++) {
//            System.out.print("*" + " ");
//        }
//        System.out.print("\n");
//    }

        // 2)Sum of numbers using recursion
//        int a;
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        a=sc.nextInt();
//        System.out.print("The sum of the numbers using recursion is : " + sumRec(a));
//    }
//    static int sumRec(int n){
//        if(n==1){
//            return 1;   // Base condition
//        }
//        return n + sumRec(n-1);
//    }

        // 3)Printing star pattern using function
//        int a;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of lines you want to print : ");
//        a=sc.nextInt();
//        pattern2(a);
//     }
//     static void pattern2(int n) {
//        for(int i=n;i>=0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*" + " ");
//            }
//            System.out.print("\n");
//        }
//    }

        // using recursion
//         if(n>0){
//             for(int i=n;i>0;i--){
//                 System.out.print("*" + " ");
//             }
//             System.out.print("\n");
//             pattern2(n-1);
//         }
//     }

        // 4)Average of numbers using variable arguments
//        System.out.print("The average of numbers is : " + avg(8,16,6));
//    }
//    static int avg(int ...arr){
//        int sum=0;
//        int average;
//        for(int a:arr){
//            sum+=a;
//        }
//        average=sum/2;
//        return average;
//    }
    }
}
