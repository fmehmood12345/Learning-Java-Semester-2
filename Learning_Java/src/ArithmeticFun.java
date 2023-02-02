public class ArithmeticFun {
    //  write psvm for shortcut and hit tab
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;


        // sout is shortcut for the print statement
        System.out.println("The result is: " + result);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

        result += 20;
        System.out.println("Result is now: " + result);

        result++; // incrementing by 1 or you could do ++result
        System.out.println("Result++ " + result);

        result--; // decrementing by 1 or you could do --result
        System.out.println("Result-- " + result);
    }
}
