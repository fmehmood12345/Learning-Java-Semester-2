public class VariableFun {
    public static void main(String[] args) {
        //Have to add the data type of the variable with the variable
        int age = 20;

        // or you could have

        int ageExample; // declaration
        ageExample = 12; /*initialization - a variable is also known as an identifier. FYI the variable is written in camel case.
        if ageExample was to change after this we would call it an assignment.*/

        final int SOME_NUM = 150; /*This is an example of a symbolic constant. You have to use underscores with it.
         A symbolic constant cannot be changed as it has the word final in front of it.*/

        String name = "Farheen";

        //Challenge:
        String hometown = "Newcastle";


        // difference between the 2 variables is that the int variable holds the actual value of age and the
        // string variable hold the address of where the object is stored in memory.

        /* println adds a new line after an output but just print won't. The reason a new line is added so that if
         another print statement is run, then it will be added just underneath rather than beside it.*/

        System.out.println(name + " is " + age + " but sometimes she is " + ageExample); // + is concatenation operator

        // Another way to add the new line at the end but this time using just print
        System.out.print(name + " is " + age + " but sometimes she is " + ageExample + '\n');
        System.out.println("My home town is " + hometown);
    }
}
