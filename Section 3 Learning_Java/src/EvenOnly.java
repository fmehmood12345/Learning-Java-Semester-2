public class EvenOnly {
    public static void main(String[] agr){
        int num=0;

        while(num<10) {

            if(num % 2 != 0) {
                num++;
                continue;
            }//end if

            System.out.println(num);
            num++;

        }//end while
    }//end main
}
