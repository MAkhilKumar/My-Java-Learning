import java.util.*;

public class FlightBooking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Destination: ");
        String destination = scan.nextLine();

        System.out.print("Enter Seat Type (Economy/Business): ");
        String seatType = scan.nextLine();

        System.out.print("Enter Travel Date (DD/MM/YYYY): ");
        String date = scan.nextLine();

        
        System.out.println("Passenger Name : " + name);
        System.out.println("Destination    : " + destination);
        System.out.println("Seat Type      : " + seatType);
        System.out.println("Travel Date    : " + date);
        
        System.out.println("Flight to  " + destination + " has been booked successfully!");
    }
}
