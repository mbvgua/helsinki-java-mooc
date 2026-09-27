import java.util.Scanner;

public class ReadingInput{
    public static void main(String[] args){
        // create tool to read user input. name it scanner
        Scanner scanner = new Scanner(System.in);

        // print out a message. notice "print" is used. everything will be on one line
        System.out.print("Is Java really verbose? (y/n): ");

        // read input from user and assign it to variable in memory
        String message = scanner.nextLine();

        // print variable to system out
        System.out.println(" ");
        System.out.println(message);
    }
}
