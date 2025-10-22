import java.util.*;

public class MobileRecharge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rechargeAgain = "yes";
        double totalAmount = 0;

        System.out.println("Welcome!");

        while (rechargeAgain.equalsIgnoreCase("yes")) {
            System.out.print("\nEnter Mobile Number: ");
            String mobile = scan.nextLine();

            System.out.println("\nSelect Your Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. Vi");
            System.out.println("4. BSNL");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();

            String operator = "";
            switch (choice) {
                case 1:
                    operator = "Jio";
                    break;
                case 2:
                    operator = "Airtel";
                    break;
                case 3:
                    operator = "Vi";
                    break;
                case 4:
                    operator = "BSNL";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    operator = "Jio";
            }

            System.out.println("\nSelect Plan Type:");
            System.out.println("1. Data Pack - ₹149");
            System.out.println("2. Unlimited Talktime - ₹249");
            System.out.println("3. Combo Pack - ₹399");
            System.out.print("Enter choice: ");
            int plan = scan.nextInt();
            scan.nextLine(); // consume newline

            double amount = 0;
            if (plan == 1) amount = 149;
            else if (plan == 2) amount = 249;
            else if (plan == 3) amount = 399;
            else {
                System.out.println("Invalid plan! Defaulting to Data Pack.");
                amount = 149;
            }

            totalAmount += amount;
            System.out.print("\nDo you want to do another recharge? (yes/no): ");
            rechargeAgain = scan.nextLine();
             System.out.println("\nRecharge Summary:");
            System.out.println("Mobile Number: " + mobile);
            System.out.println("Operator: " + operator);
            System.out.println("Plan Amount: ₹" + amount);
            System.out.println("Recharge Successful!");

        }
    }
}
