public class ContinueBreak {
    public static void main(String[] args) {
        int count = 0;

        while(count<10) {
            if(count == 5) {
                count++; //done to prevent the infinite loop. How? If count remains 5, it will just continue loop[ing through the if statement. The program will not terminate.
                continue;// continue means to go back to the while loop and continue iterating.
                //Reason why 5 is not outputted is because once the program enters the if statement, count is incremented by 1, but
                //it is not told to output the value. Due to continue, the while loop is run again with count = 6 now. After that,
                //6, 7, 8 and 9 are outputted.
                // You could use break; instead of continue which will basically break out of the if loop when count = 5
                // Because of this only numbers 0 to 4 will be printed.
            }//end if
            System.out.println(count + "\t");
            count++;
        }//end while
    }//end main
}
