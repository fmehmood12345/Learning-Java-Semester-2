public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray; // square brackets to show it's an array of integers hence the int.
        myArray = new int[5]; // INITIALISING THE ARRAY: shows that there is an array of length 5 - the array is a fixed size

        //adding all values into the array
        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 20;

//        //printing all values of the array using a for loop
//        for(int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }//end for

        //enhanced for loop
        for(int num : myArray){ //num is an integer as the elements of the array are integers the : refers to all the elements of the array, and they're printed
            System.out.println(num);
        }//end enhanced for
    }//end main
}
