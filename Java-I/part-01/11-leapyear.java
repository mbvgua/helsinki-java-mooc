import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a year: ");
        Short userYear = Short.valueOf(scanner.nextLine());

        if (userYear%4 == 0){
            if (userYear%100 == 0 && userYear%400 != 0){
                System.out.println("This is not a leap year.");
            } else {
                System.out.println("This is a leap year!");
            }
        } else {
            System.out.println("This is not a leap year!");
        }
    }
}
