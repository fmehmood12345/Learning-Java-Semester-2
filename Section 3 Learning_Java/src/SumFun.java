import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int sum = 0;
        int input;

        System.out.println("Please enter a non-negative number to exit");
        input= keyboard.nextInt();

        while(input>0) {
            sum = sum + input; // this is what I wrote, but you can do sum += input instead
            System.out.println("Total sum is: " + sum);
            System.out.println("Please enter a non-negative number to exit");
            input= keyboard.nextInt();

        }//end while
        System.out.println("You have entered a negative number therefore we exit. Done!");
        System.out.println("Total sum is: " + sum);


    }//end main
}
