import java.util.Scanner;

public class NumberCalculations{
    public static void main(String[] args){
        /*
         * basic math calculations are familiar:
         * +: addition
         * -: subraction
         * *: multiplication
         * /: division
         * %: modulo(remainder of)
         */

        //calculate number of seconds in a day
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds? ");
        int daysToConvert = Integer.valueOf(scanner.nextLine());
        int convertedToSeconds = daysToConvert * 24 * 60 * 60;
        System.out.println(" ");
        System.out.println("Thats " +convertedToSeconds+ " seconds!");
        System.out.println(" ");

        // operator precedence also occurrs in string concatenation
        System.out.println("This is four: "+(2+2));
        System.out.println("But this isnt what you expected: " +2+2);
        System.out.println(" ");

        // sum of two numbers inputted by user
        int firstNum, secondNum;

        System.out.print("Give the first number: ");
        firstNum = scanner.nextInt();
        System.out.print("Give the second number: ");
        secondNum = scanner.nextInt();

        System.out.println(firstNum+ " + " +secondNum+ "=" +(firstNum+secondNum));
        System.out.println("The total is:" +(firstNum+secondNum));
        System.out.println(" ");

        // multiplcation
        System.out.print("Give the first number: ");
        firstNum = scanner.nextInt();
        System.out.print("Give the second number: ");
        secondNum = scanner.nextInt();

        System.out.println(firstNum+ " * " +secondNum+ "=" +(firstNum*secondNum));
        System.out.println("The total is:" +(firstNum*secondNum));
        System.out.println(" ");

        // division
        System.out.print("Give the first number: ");
        firstNum = scanner.nextInt();
        System.out.print("Give the second number: ");
        secondNum = scanner.nextInt();

        System.out.println("The average is: " +((float)firstNum+secondNum)/2);
        System.out.println(" ");

        // simple calculator
        System.out.println("Simple calculator");
        System.out.print("What is value 1: ");
        int randoVal1 = scanner.nextInt();
        System.out.print("What is value 2: ");
        int randoVal2 = scanner.nextInt();

        System.out.println("Here are the calculations: ");
        System.out.println(randoVal1 +" + "+ randoVal2 +" = "+ (randoVal1+randoVal2));
        System.out.println(randoVal1 +" - "+ randoVal2 +" = "+ (randoVal1-randoVal2));
        System.out.println(randoVal1 +" * "+ randoVal2 +" = "+ (randoVal1*randoVal2));
        System.out.println(randoVal1 +" / "+ randoVal2 +" = "+ (randoVal1/(float)randoVal2));
    }
}
