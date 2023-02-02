import java.util.Random;
public class RandomFile {
    public static void main(String[] arg){
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("Number is: \t"+ myRandomNumber);

        myRandomNumber = random.nextInt(1000); // This is to limit the number between 0 and 999.
        System.out.println("0 to 999:\t"+myRandomNumber);

        //shifting can be used to randomly generate a number between 1 and 1000 instead of 0 to 999. Essentially you shift 1 to the right.
        myRandomNumber = random.nextInt(1000) + 1; //This plus one shifts by 1. Meaning the smallest number is 1 and the highest is 1000.
        System.out.println("1 to 1000:\t" +myRandomNumber);


    }//end main

}
