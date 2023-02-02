public class ConversionFun {
    public static void main(String[] args){
        double myDouble = 3.14;
        //In java, real numbers by default are a double. You have to convert to a float if you want a real number to be of type float

        // This technique is used for a variable conversion
        float myFloat = (float)3.14;
        // or you could do this for constants:
        float myFloat2 = 3.14f;

        double yourDouble = myFloat;
    }

}
