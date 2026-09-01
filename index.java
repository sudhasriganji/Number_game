import java.util.Random;
import java.util.Scanner;

public class Decodelabs_java_P1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Random random =new Random();
        int number=random.nextInt(20)+1;
        int guess=0;
        int attempts=0;
        int maxAttempts=10;
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Guess a number between 1 and 20");
        System.out.println("You have "+maxAttempts+" attempts");
        while(guess !=number && attempts<maxAttempts){
            System.out.println("Enter your guess: ");
            guess=sc.nextInt();
            attempts++;
            if(guess>number){
                System.out.println("Too High! Try again.");
            } 
            else if(guess<number){
                System.out.println("Too Low! Try again.");
            }
            else{
                System.out.println("Correct! You guessed the number.");
                System.out.println("Number of attempts: "+attempts);
            }
        }
        if(guess !=number){
            System.out.println("\nGAME OVER!");
            System.out.println("You have used all "+maxAttempts+" attempts.");
            System.out.println("The correct number was: ");
        }
        sc.close();
    }
}
