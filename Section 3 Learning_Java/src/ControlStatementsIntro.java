public class ControlStatementsIntro {
    public static void main(String[] args){
        int age = 19;
        //IF and ELSE statements
        if (age >=16) {
            System.out.println("You can drive!");
        }
        else {
            System.out.println("You cannot drive yet!");
        }// end of if else statements

        System.out.println();

        for(int i =1; //Declares i as 1
            i<= age; // i is less than age
            i++)  // adds one to i for each loop
            {
            System.out.println("Happy Birthday " + i);

        }//end for

        }//main ends
}
