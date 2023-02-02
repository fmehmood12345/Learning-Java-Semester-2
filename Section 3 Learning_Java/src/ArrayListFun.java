import java.util.ArrayList;
public class ArrayListFun {
    //ArrayLists only allow certain data types to be used. Example primitive data types cannot be used. They only work with reference types#
    // To solve this issue you have to use wrapper classes(this is in another section).
    /* There are 8 wrapper classes:

    */
    public static void main(String[] args) {
        /*So at this point you have imported ArrayList and you want to use methods
         of that class to print out the entire array.

        1. Initialise an array of type String. Instead of doing int[] myArray; you have to now use the ArrayList class
            so to do this you have to do the following: */
        ArrayList<String> namesList = new ArrayList<>();

        /* 2. Now use the add method from the array list class to add items into the array called nameslist*/
        namesList.add("John");
        namesList.add("Kyle");
        namesList.add("Matthew");
        namesList.add("Amanda");
        namesList.add("Wendy");

        /* 3. Now use a for loop to loop through the array to output all the values. Notice as we are using the
         ArrayList class you have to not use namesList.length (.length is a property), but you have to use .size() and
         rather than outputting namesList[i] you would use .get(i).*/
        for(int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }//end for

        //ENHANCED FOR LOOP:
        for(String name : namesList) {
            System.out.println(name);
        }

        //OVERALL YOU HAVE USED 3 METHODS FROM THE ArrayList CLASS: .add(), .get(), .size()
    }//end main
}
