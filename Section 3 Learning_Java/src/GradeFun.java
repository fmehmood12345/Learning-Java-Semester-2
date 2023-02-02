import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        char grade;

        System.out.println("Enter a grade");
        grade = keyboard.next().charAt(0);


        //SWITCH CASE STATEMENTS TO ENSURE ONLY CERTAIN INPUTS ARE ALLOWED TO BE USED

        //Essentially when grade is inputted, and it follows the following cases then ALL the outputs are printed.
        // Only way to prevent all outputs to be printed is having break; after each case
        // If an input is given which is not any of the cases then the default option  is outputted

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("Great Job!");
                break;

            case 'B':
            case 'b':
                System.out.println("Good Job!");
                break;

            case 'C':
            case 'c':
                System.out.println("you can do better");
                break;

            case 'D':
            case 'd':
                System.out.println("You're getting pretty close to failing");
                break;

            case 'F':
            case 'f':
                System.out.println("You're failing");
                break;

            default:
                System.out.println("You have entered an invalid grade");
        }


    }//end main
}
