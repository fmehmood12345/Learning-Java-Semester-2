import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.println("Please enter a number ");
        number = keyboard.nextInt();

        if (number % 3 == 0) {
            System.out.println("the number " + number + " is divisible by 3");
        }//end if
        else{
            System.out.println("the number " + number + " is not divisible by 3");
        }//end else
    }//end main
}
