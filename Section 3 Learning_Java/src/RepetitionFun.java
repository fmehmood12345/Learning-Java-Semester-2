import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;

        //priming read - what the following code does is essentially prints out the positive number inputted and if a negative number is inputted then
        // the program exits
        System.out.println("Enter a none negative integer OR negative to exit");
        input = keyboard.nextInt();

        while(input>=0) {
            System.out.println(input);
            System.out.println("Enter a none negative integer OR negative to exit");
            input = keyboard.nextInt();
        }

        System.out.println("Done!");

        int count = 0;
        int count2 = 23;

        //WHILE LOOP
//        while(count < 10) { //loop continuation condition
//            System.out.println(count);
//            count++; //increments count by 1 after each loop
//        }//end while
//
        //DO WHILE LOOP
//        do{ // with do while loop, the output is printed first and then the condition is checked. Hence, if count2=100, 100 is outputted.
//            System.out.println(count2);
//            count2++;
//        }
//        while(count2 <23);

//        //FOR LOOP
//        for(int i = 0; i < 10; i++) {  //conditions are all mentioned in the header of the loop
//            System.out.println(i);
//        }//end for


    }//end main
}
