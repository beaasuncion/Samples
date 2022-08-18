public class App {
    public static void main(String[] args) {

        // int - stores integers (whole numbers), without decimals, such as 123 or -123
        int myAge = 18;

        // float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        float myGradeInClass = 4.00f;

        // char - stores single characters, such as 'a' or 'B'. Char values are
        // surrounded by single quotes
        char myMiddleInitial = 'U';

        // boolean - stores values with two states: true or false
        boolean iLoveProgramming = true;
        boolean iAm6FeetTall = false;

        // String - stores text, such as "Hello". String values are surrounded by double
        // quotes
        String myFirstName = "Beatriz";

        // If you don't want others (or yourself) to overwrite existing values, use the
        // final keyword (this will declare the variable as "final" or "constant", which
        // means unchangeable and read-only)
        final String myLastName = "Asuncion";

        System.out.println(myAge);
        System.out.println(myGradeInClass);
        System.out.println(myMiddleInitial);
        System.out.println(iLoveProgramming);
        System.out.println(iAm6FeetTall);
        System.out.println(myFirstName);
        System.out.println(myLastName);
    }
}