public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        String myName = "Farheen";
        String yourName = "John";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);
        System.out.println("myAge is " + myAge);
        System.out.println("yourAge is " + yourAge);
        System.out.println("bobsAge is " + bobsAge);

        //relational operations
        boolean ageComparisons = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparisons);

        ageComparisons = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparisons);

        ageComparisons = yourAge == bobsAge;
        System.out.println("yourAge = bobsAge?: " + ageComparisons);

        boolean nameComparison = myName.equals(yourName); // How to compare two strings
        System.out.println("Do the names match?: " + nameComparison);

        //Challenge

        int currentAge = 20;
        boolean currentAgeComparison = currentAge >= 21;

        System.out.println("Is the current age greater than or equal to 21?: " + currentAgeComparison);
    }
}
