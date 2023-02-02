import java.util.Random;

public class DiceSimulation {
    public static void main(String[] arg) {
        int RandomNumber;

        Random random = new Random();


        for(int i = 0; i < 10; i++) {
            RandomNumber = random.nextInt(6) +1;
            System.out.println("The dice rolled: "+RandomNumber);
        }//end for
    }//end main
}
