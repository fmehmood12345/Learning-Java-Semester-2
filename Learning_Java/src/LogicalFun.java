public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;


        boolean combined = isRaining && isWarm;
        System.out.println("Is it raining and warm?: " + combined);

        combined= isRaining || isWarm;
        System.out.println("Is it raining OR warm?: " + combined);

        combined= !isRaining;
        System.out.println("Is it NOT raining?: " + combined);

        combined= !isWarm;
        System.out.println("Is it NOT warm?: " + combined);

    }
}
