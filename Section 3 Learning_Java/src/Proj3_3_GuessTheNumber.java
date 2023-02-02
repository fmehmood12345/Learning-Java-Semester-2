import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);
        Random randomNo = new Random();

        int randomNumber;
        int UserGuess;
        int NoOfGuesses = 0;

        randomNumber = randomNo.nextInt(100) + 1;

        System.out.println("Guess the number between 1 and 100 ");
        UserGuess = keyboard.nextInt();


        while (UserGuess != randomNumber) {
            NoOfGuesses += 1;

            if (UserGuess < randomNumber) {
                System.out.println("Your guess was too low");
            }//end if

            else if (UserGuess > 100) {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
            }//end else if

            else {
                System.out.println("Your guess was too high");
            }//end else

            System.out.println("Guess the number between 1 and 100 ");
            UserGuess = keyboard.nextInt();
        }// end while

        NoOfGuesses += 1;
        System.out.println("Congratulations! You guessed the number in " + NoOfGuesses + " guesses! Thanks for playing!");


    }//end main
}


/*  ANOTHER WAY TO DO THE PROBLEM:
import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] arg) {

        Scanner keyboard = new Scanner(System.in);
        Random randomNo = new Random();
        int UserGuess;
        int randomNumber;
        int NoOfGuesses = 0;

        boolean guessedNumber = false;

        randomNumber = randomNo.nextInt(100) + 1;

        while (!guessedNumber) {
            System.out.println("Guess the number between 1 and 100 ");
            UserGuess = keyboard.nextInt();
            NoOfGuesses++;

            if (UserGuess >= 1 && UserGuess <= 100) { // || means OR  && means AND
                if (UserGuess == randomNumber) {
                    NoOfGuesses++;
                    System.out.println("You have guessed the correct number with " + NoOfGuesses + " guesses");
                    guessedNumber = true;
                }//end if

                else if (UserGuess > randomNumber) {
                    System.out.println("Your guess was too high");
                    NoOfGuesses++;
                }//end else if

                else{
                    System.out.println("The guess is too low");
                    NoOfGuesses++;

                }//end else
            }//end if

            else{
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
            }//end else

        }//end while

    }//end main
}

*/