import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {

        Scanner realNumbers = new Scanner(System.in);

        double number1;
        double number2;
        double number3;
        double mean;

        System.out.println("Enter a real number");
        number1 = realNumbers.nextDouble();
        number2 = realNumbers.nextDouble();
        number3 = realNumbers.nextDouble();
        realNumbers.nextLine();

        mean = (number1 + number2 + number3) / 3.0;

        System.out.println("The mean of the 3 numbers is " + mean);
    }
}
