import java.util.Scanner;

public class Conversation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // String response;    // if were using only 1
        String response1, response2, response3;    // create var first

        System.out.println("Greetings! How are you doing?");
        response1 = scanner.nextLine();

        System.out.println("Oh how ineteresting. Tell me more!");
        response2 = scanner.nextLine();

        System.out.println(" ");
        System.out.println("Thanks for sharing your responses: ");
        System.out.println(response1+" and "+response2);
    }
}
