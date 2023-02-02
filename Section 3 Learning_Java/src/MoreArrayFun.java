public class MoreArrayFun {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];

//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//        array[5] = 6;
//        array[6] = 7;
//        array[7] = 8;
//        array[8] = 9;
//        array[9] = 10;

        //YOU DON'T HAVE TO PUT THE VALUES INTO THE ARRAY IF ITS JUST 1-10

        //for loop to add content into the array
        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }//end for

//        for(int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }//end for

        for(int num : array) { //for loop to print out the content of the array
            System.out.println(num);
        }//end enhanced for
    }//end main
}
