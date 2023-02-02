import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);

        String adjective;
        String girls_name;
        String adjective2Occupation;
        String place;
        String clothing;
        String hobby;
        String adjective3Occupation;
        String boys_name;
        String mans_name;

        System.out.println("please enter an adjective:\t");
        adjective = word.nextLine();

        System.out.println("please enter a girls name:\t");
        girls_name = word.nextLine();

        System.out.println("please enter an occupation:\t");
        adjective2Occupation = word.nextLine();

        System.out.println("please enter a place:\t");
        place = word.nextLine();

        System.out.println("please enter an item of clothing:\t");
        clothing = word.nextLine();

        System.out.println("please enter a hobby:\t");
        hobby = word.nextLine();

        System.out.println("please enter another occupation:\t");
        adjective3Occupation = word.nextLine();

        System.out.println("please enter a boys name:\t");
        boys_name = word.nextLine();

        System.out.println("please enter a mans name:\t");
        mans_name = word.nextLine();

        System.out.println();

        System.out.println("There once was a " + adjective + " girl named " + girls_name + " who was a "
                + adjective2Occupation + " in the kingdome of "+ place + ". She loved to wear " + clothing +
                " and to " + hobby + ". She wanted to marry the " + adjective3Occupation + " named " + boys_name +
                " but her father, King " + mans_name + " forbid her from seeing him.");
    }
}
