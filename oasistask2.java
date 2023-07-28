import java.util.Scanner;
import java.lang.Math;

public class oasistask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // To Generate a random number between 0 to 100
        int answer = (int) (Math.random() * 100) + 1;

        // Number of trials
        int trials = 5;

        // Take input from user or we can say that guess the number
        Boolean correct = false;
        System.out.println("I have selected a number between 1 to 100 .\nYou have 5 trials to guess the number.");

        // React according to user input
        while (trials > 0) {
            System.out.println("ENTER YOUR GUESS : ");
            int guess = sc.nextInt();
            trials--;
            if (guess == answer) {
                System.out.println(
                        "You have successfully entered the correct number and the number is" + answer + "\n\n || YOU WIN ! ||");
                break;
            } else if (guess > answer) {
                System.out.println(
                        "Your guessed number is greater than actual number. You have " + trials + " trials left.\n");
            } else if (guess < answer) {
                System.out.println(
                        "Your guessed number is less than actual number. You have " + trials + " trials left.\n");
            }
        }

        // After unsucessful guesses
        if (correct == false) {
            System.out.println("You have no trials left.\nActual number was:  " + answer + "\n\n || YOU LOSE ! ||");
        }
    }
}