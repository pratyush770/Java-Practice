// Rock,Paper and Scissors game using JAVA

import java.util.Random;
import java.util.Scanner;
public class rps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 0 for rock, 1 for paper, 2 for scissor : ");
        int userinput=sc.nextInt();
        if(userinput>=3){
            System.out.println("Enter a valid number");
        }
        else {
            Random r = new Random();
            int computerinput = r.nextInt(3);
            if (userinput == computerinput) {
                System.out.println("It's a draw!");
            }
            else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 ||
                    userinput == 2 && computerinput == 0) {
                System.out.println("Congratulations, you win!!");
            }
            else {
                System.out.println("Computer win!");
            }
            System.out.println("Computer choice : " + computerinput);
        }
    }
}
