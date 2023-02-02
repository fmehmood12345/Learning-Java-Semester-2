import java.util.Scanner;

public class SelectionFile {
    public static void main(String[] args){
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Pub and Grille");

        System.out.println();

        System.out.println("Please enter your age: ");
        age = keyboard.nextInt();

        if(age >= 21){
            System.out.println("You are allowed to drink");
        }
        else if(age>=16){
            System.out.println("You cannot drink alcohol! Maybe some sprite?");
            System.out.println("At least you can drive");
        }
        else{
            System.out.println("You cannot drink alcohol! Maybe some sprite?");
        }
        System.out.println();
        System.out.println("Thanks for coming to the Pub and Grille!");
    }//main end
}
