package Exercise;
// Guess the number

//Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods:
//     1. Constructor to generate the random number
//     2. takeUserInput() to take a user input of number
//     3. isCorrectNumber() to detect whether the number entered by the user is true
//     4. getter and setter for noOfGuesses
//     Use properties such as noOfGuesses(int), etc to get this task done!
import java.util.Scanner;
import java.util.Random;

class Game{
    public int random;
    public int userInput;
    private int noOfGuesses = 0;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random r = new Random();
        this.random=r.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        userInput=sc.nextInt();
    }
    boolean correctNumber(){
        noOfGuesses++;
        if(userInput==random){
            System.out.printf("You guessed the right number which is %d. \n You were able to guess the correct number in %d attempts.",random,noOfGuesses);
            return true;
        }
        else if(userInput<random){
            System.out.println("Guessed number is too low, please try again!!");
        }
        else if(userInput>random){
            System.out.println("Guessed number is too high, please try again!!");
        }
        return false;
    }
}
public class nog {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b =false;
        while(!b){   // will keep executing till b returns true i.e. you'll get the right guessed number
            g.takeUserInput();
            b=g.correctNumber();
        }
    }
}

