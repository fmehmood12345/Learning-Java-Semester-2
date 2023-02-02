//java.util is a package which has a collection of classes and other things. Scanner is in one of the classes in this package
import java.util.Scanner;
public class UserInputFun {
    public static void main(String[] args) {
        //user input - scanner is a data type which allows us to use user input
        //Scanner is a data type which we have named keyboard. Then you have to have new and then pass in a value into the constructor called scanner
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;

        /*Then, we call the nextLine method of the Scanner class. We call in on our keyboard variable
        so that we can get the String that the user types*/
        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt(); //use nextInt for an integer.
        // It consumes the newLine method that we made for age when it runs, that's why if a string input is required after, you have to call that method again.

        /*Whenever you are taking non string input like .nextInt(); you should also put an extra call to next line
        underneath it to consume the new line character*/

        keyboard.nextLine();
        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Your age is: " + age);
        System.out.println("You live in " + city);

    }
}
