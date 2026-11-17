public class PasswordValidator {
    public static void main(String[] args) {
        String stored = "Bluebird7";
        // attempt1 is exact, attempt2 has the wrong case, attempt3 is built with new.
        // Print the result of each comparison. No if statements yet: just print the boolean.
      
        String attempt1 = "Bluebird7";
        System.out.println(attempt1.equals(stored));
        String attempt2 = "bluebird7";
        attempt1 = attempt1.toLowerCase();
        attempt2 = attempt2.toLowerCase();
        String attempt3 = new String ("Bluebird7");
        System.out.println(attempt3==stored);
        System.out.println(attempt3.equals(stored));
      //  System.out.println(stored.equals(missing));
       // System.out.println(missing.equals(stored));

        System.out.println("Miriam".compareTo("Noah")); //-1 (neg)
        System.out.println("Noah".compareTo("Miriam")); //1 (pos)

        System.out.println("Jaclyn".compareTo("Rachel")); //-8 (neg)
        System.out.println("Rachel".compareTo("Esther")); //13 (pos)
        System.out.println("Esther".compareTo("Jaclyn")); //-5 (neg)

    }
}
