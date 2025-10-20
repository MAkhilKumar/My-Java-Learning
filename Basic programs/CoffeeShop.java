import java.util.*;
public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        String orderAgain = "yes";
        double totalBill = 0;
        while(orderAgain.equalsIgnoreCase("yes")) {
            System.out.println("\nWhich coffee would you like?");
            System.out.println("1. Espresso - ₹80");
            System.out.println("2. Latte - ₹100");
            System.out.println("3. Cappuccino - ₹120");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scan.nextInt();
            double price = 0;
            String coffeeName = "";
            switch(choice) {
                case 1: coffeeName = "Espresso"; price = 80;
                break;
                case 2: coffeeName = "Latte"; price = 100;
                break;
                case 3: coffeeName = "Cappuccino"; price = 120;
                break;
                default: 
                    System.out.println("Invalid choice! Try again."); 
                    continue;
            }
            System.out.print("How many cups of " + coffeeName + " do you want? ");
            int qty = scan.nextInt();
            double subtotal = price * qty;
            totalBill += subtotal;
            System.out.print("\nWould you like to order another coffee? (Yes/No): ");
            orderAgain = scan.next();
        }
        System.out.println("Your total bill is: ₹" + totalBill);
        System.out.println("Thank you !");
    }
}  
