import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number between 0 and 100: ");
        Integer userInput = Integer.valueOf(scanner.nextLine());

        if (userInput%3 == 0 && userInput%5 == 0){
            System.out.println("FizzBuzz");
        } else if (userInput%5 == 0){
            System.out.println("Buzz");
        } else if (userInput%3 == 0){
            System.out.println("Fizz");
        } else {
            System.out.printf("The number is: %s\n", userInput);
        }
    }
}
