import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Consumer Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Units Used: ");
        int units = scan.nextInt();
        double rate;
        if(units <= 100)
            rate = 3.0;        
        else if(units <= 300)
            rate = 4.5;     
        else
            rate = 6.0;     
        double total = units * rate;
        System.out.println("Name: " + name);
        System.out.println("Total Bill Amount: ₹" + total);
        System.out.println("\nThank You!");
    }
}
