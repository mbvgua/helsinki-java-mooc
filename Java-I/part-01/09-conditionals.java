import java.util.Scanner;

public class Conditionals{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String greeting = "Hello World!";

        if (true){
            System.out.println(greeting);
        }
        System.out.println("");

        // Speeding ticket exercise. if > 120, issue ticket
        System.out.print("What speed are you currently driving? ");
        Short userSpeed = Short.valueOf(scanner.nextLine());

        if (userSpeed >= 120 ){
            System.out.println("Speeding ticket!");
        } else {
            System.out.println("Safe driving");
        }
        System.out.println("");

        /*
         * Comparison Operators:
         *  >   Greater than
         *  >=  Greater than or Equal to
         *  <   Less than
         *  <=  Less than or Equal to
         *  ==  Equal to
         *  !=  Not Equal to
         */
        // prints out orwell if user inputs the year 1984
        System.out.print("Give me *the* year: ");
        Integer userYear = Integer.valueOf(scanner.nextLine());
        if (userYear == 1984){
            System.out.println("Orwell");
        } else {
            System.out.println("Yeah, better luck next time :)");
        }
        System.out.println("");

        // prints out ancient history if year inputted is smaller than 2015
        System.out.print("Give me a random year: ");
        Integer randomYear = Integer.valueOf(scanner.nextLine());
        if (randomYear <= 2015){
            System.out.println("Ancient history!");
        } else {
            System.out.println("Noiceeee");
        }
        System.out.println("");

        // are these positive numbers?
        System.out.println("Give me a random number: ");
        Byte randomNum = Byte.valueOf(scanner.nextLine());
        if (randomNum > 0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }
        System.out.println("");

        // are you and adult yet?
        System.out.println("How old are you? ");
        Integer userAge = Integer.valueOf(scanner.nextLine());
        if (userAge >= 20){
            System.out.println("Yup! you're an adult");
        } else if(userAge >= 13){
            System.out.println("You're a teenager ;/");
        } else if(userAge<=0 || userAge>=200){
            System.out.println("Cap!");
        }

        System.out.println("");

        // which is larger
        System.out.print("Input number 1: ");
        Integer userNum1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Input number 2: ");
        Integer userNum2 = Integer.valueOf(scanner.nextLine());

        if (userNum1 > userNum2){
            System.out.println("Greater number is: " +userNum1);
        } else if (userNum1 < userNum2){
            System.out.println("Greater number is: " +userNum2);
        } else {
            System.out.println("the numbers are equal!");
        }
        System.out.println("");

        // grading system
        System.out.print("Give points [0-100]: ");
        Integer userGrade = Integer.valueOf(scanner.nextLine());

        if (userGrade <= 0){
            System.out.println("Grade: impossible!");
        } else if (userGrade <= 49){
            System.out.println("Grade: failed");
        } else if (userGrade <= 59){
            System.out.println("Grade: 1");
        } else if (userGrade <= 69){
            System.out.println("Grade: 2");
        } else if (userGrade <= 79){
            System.out.println("Grade: 3");
        } else if (userGrade <= 89){
            System.out.println("Grade: 4");
        } else if (userGrade <= 100){
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
        System.out.println("");

        // odd or even numbers?
        System.out.print("Give a number: ");
        Integer oddOrEven = Integer.valueOf(scanner.nextLine());

        if (oddOrEven % 2 == 0){
            System.out.printf("Number %s is an even number.\n", oddOrEven);
        } else if(oddOrEven % 2 != 0){
            System.out.printf("Number %s is an odd number.\n", oddOrEven);
        } else {
            System.out.println("Please input a valid number");
        }
        System.out.println("");

        // string comparison
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        if (userString.equals("a string")){
            System.out.println("Yes! theyre equal...");
        } else {
            System.out.println("No! they dont match...");
        }
        System.out.println("");

        // did iget that password right?
        System.out.print("Enter your password: ");
        String userPass = scanner.nextLine();

        if (userPass.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        System.out.println("");

        /*
         * Logical operators
         *  && -> AND
         *  || -> OR
         *  !  -> NOT
         */

    }
}
