import java.util.Random;
import java.util.Scanner;

public class EntryBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();
        boolean accessGranted = rand.nextBoolean();
        if (accessGranted) {
            System.out.println(" Access Granted " + name + "!");
        } else {
            System.out.println(" Access Denied " + name + ".");
        }
        sc.close();
    }
}