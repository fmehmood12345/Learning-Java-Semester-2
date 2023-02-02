import java.util.Scanner;
public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        char gender;

        System.out.println("please enter your age:");
        age = keyboard.nextInt();
        System.out.println("please enter your gender:");
        gender = keyboard.next().charAt(0);

        if (age>=19 && gender == 'M'){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }

        //DOESN'T WORK WITH SWITCH STATEMENTS
//        switch(age){
//        switch(gender){
//            case age>=19:
//            case "Male":
//            case "male":
//            case 'm':
//                System.out.println("you are eligible");
//                break;
//            default:
//                System.out.println("you are not eligible");
//        }
//        }

    }//end main
}
