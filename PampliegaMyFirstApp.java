import java.util.Scanner;
import java.util.Date;

public class PampliegaMyFirstApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:  ");
        String fullName = scanner.nextLine();
        System.out.println("The current date and time is: "); 

        Date date = new Date();

        System.out.println(date.toString());

        scanner.close();
    }
}