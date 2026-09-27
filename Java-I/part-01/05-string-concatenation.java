import java.util.Scanner;

public class ReadingInput{
    public static void main(String[] args){
        // create tool to read user input. name it scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String username = scanner.nextLine();

        System.out.print("What is the day today? ");
        String day = scanner.nextLine();

        System.out.println(" ");
        System.out.println("Hello there " + username + ". Nice to meet you on " + day + ".");
    }
}
