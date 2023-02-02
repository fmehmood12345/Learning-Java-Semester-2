import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        int LearningPackage;
        boolean AdditionalCourse;

        System.out.println("Select a type of package: ");
        System.out.println("Learning Package 1: £10 per month, includes 2 courses per month with each additional course"
                + " being £6 \nLearning Package 2: £12 per month, includes 4 courses per month with each additional " +
                "course being £4\nLearning Package 3: £15 per month, includes 6 courses per month with each additional"
                + "course being £3");

        LearningPackage = keyboard.nextInt();

        if (LearningPackage == 1){
            System.out.println("Will you take any additional courses? Output true or false");
            AdditionalCourse = keyboard.nextBoolean();
            if (true == AdditionalCourse){
                System.out.println("Total is £22 per month");
            }//end if
            else{
                System.out.println("Total is £10 per month");
            }//end else
        }//end if

        if (LearningPackage == 2){
            System.out.println("Will you take any additional courses? Output true or false");
            AdditionalCourse = keyboard.nextBoolean();
            if (true == AdditionalCourse){
                System.out.println("Total is £28 per month");
            }//end if
            else{
                System.out.println("Total is £12 per month");
            }//end else
        }//end if

        if (LearningPackage == 3){
            System.out.println("Will you take any additional courses? Output true or false");
            AdditionalCourse = keyboard.nextBoolean();
            if (true == AdditionalCourse){
                System.out.println("Total is £33 per month");
            }//end if
            else{
                System.out.println("Total is £15 per month");
            }//end else
        }//end if

    }//end main
}
