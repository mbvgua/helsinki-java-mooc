import java.util.Scanner;

/*
 * Variable: a container in which information of a given type is stored
 */
public class Variables{
    public static void main(String[] args) {
        // initializing and declaring variables as: <type> <name> = <value>
        int foo = 12;

        // to initialize multiple values of the same type at the same time
        int foo1, foo2, foo3, foo4;
        foo1 = foo2 = foo3 = foo4 = 10;

        // a shorthand for this would be:
        int bar1=10, bar2=10, bar3=40;

        /*
         * Data types in Java include:
         *  - byte: 8-bit signed two's compelement integer
         *      -128 <= byte <= 128
         *  - short: 16-bit signed two's complement integer
         *      -32,768 <= short <= 32,768
         *  - integer: 32-bit signed two's complement integer
         *      -2,147,483,648 <= int <= 2,147,483,648
         *  - long: 64-bit signed two's complement integer
         *      -9,223,372,036,854,775,808 <= long <= 9,223,372,036,854,775,808
         *  - float: single precision 32-bit IEEE 754 floating point
         *      2^-149 <= float <= (2-2^-23)*2^127
         *  - double: double precision 64-bit IEEE 754 floating point
         *      2^-1074 <= double <=(2-2^-52)*2^1023
         *  - boolean: true or false values
         *  - char: single 16-bit unicode character
         *      'a', 'b', 'M' e.t.c
         *  - string: a sequence of characters
         *      "Java is really similar to the langs im used to"
         *  - text blocks: 
         *      """This is a text block. Already present in python too :)"""
         *  - final: variables that cannot be reassigned
         */
        byte fooByte =17;
        System.out.println("Byte: " +fooByte);

        short fooShort=10000;
        System.out.println("Short: " +fooShort);

        int fooInt = 1;
        System.out.println("Int: " +fooInt);

        long fooLong = 10000L;
        System.out.println("Long: " +fooLong);

        float fooFloat = 17.3F;
        System.out.println("Float: " +fooFloat);

        double fooDouble = 17.3;
        System.out.println("Double: " +fooDouble);

        boolean fooBoolean = true;
        boolean barBoolean = false;
        System.out.println("Boolean: " +fooBoolean);
        System.out.println("Boolean: " +fooBoolean);

        char fooChar = 'a';
        System.out.println("Char: " +fooChar);

        // NOTE: String starts with an uppercase letter
        String fooString = "This is nice!";
        System.out.println("String: " +fooString);

        final int CURRENT_YEAR = 2026;
        System.out.println("Final: " +CURRENT_YEAR);

        /*
         * NOTE:
         * - in Java you could perform something called type inference, whereby a variables type
         *   will automatically be detected when using the 'var' keyword
         * - in Java, since its a statically typed language and all variable types must be defined
         *   before assignment, there is no inbuilt 'typeOf()' class
         */
        var x=100;
        var motto="Just do it!";
        var PI=3.14;

        System.out.println(" ");
        // variables redeclaration is not possible as it would bring about errors.
        // However, you could reassign the variable, as long as you leave out its type. Also the
        // type must match thatwhichit was declared as.
        double pi=3.14;
        System.out.println("Original variable value is: "+pi);

        // double pi=3.142;     - this causes errors
        pi = 3.142;
        System.out.println("Variable reassgined to: "+pi);

        System.out.println(" ");
        /*
         * Reading different variable types from user
         * - byte: scanner.nextByte()
         * - int: scanner.nextInt()
         * - long: scanner.nextLong()
         * - float: scanner.nextFloat()
         * - double: scanner.nextDouble()
         * - boolean: scanner.nextBoolean()
         *
         *   these only read the defined type. anything else throws an error
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a byte: ");
        byte inputByte = scanner.nextByte();
        System.out.println("Byte values is: " +inputByte);

        System.out.print("Input an integer: ");
        int inputInt = scanner.nextInt();
        System.out.println("Integer value is: "+inputInt);

        System.out.print("Input a boolean: ");
        boolean inputBool = scanner.nextBoolean();
        System.out.println("Boolean value is: "+inputBool);

        System.out.print("You get the gist...");
        System.out.println(" ");
        /*
         * a simpler method could be reading the values as strings and then converting them into
         * their appropriate value types.
         */
        System.out.print("How old are you? ");
        int userAge = Integer.valueOf(scanner.nextLine());

        System.out.print("What is the value of PI: ");
        double piValue = Double.valueOf(scanner.nextLine());

        System.out.print("Are you sure? ");
        boolean userCertainty = Boolean.valueOf(scanner.nextLine());

        System.out.println("User is "+userAge+" years old.");
        System.out.println("The claim the valueof pi is "+piValue);
        // this is a ternary operator!!! how imissed this. present in Js/ts
        System.out.println("Are they sure about it? "+ (userCertainty==true ? "yes" : "no"));






    }
}
