import java.util.*;
class LeapYear {
    public static void main(String[] args) {
        int year ;
        Scanner input = new Scanner (System.in);
        year = input.nextInt();
        if ((year %4 ==0) &&  (year%100!=0) || (year%400==0))
        {
            System.out.println(" is a leap year");
        }
        else 
        {
            System.out.println(" is not a leap year");
        }
    }
}
