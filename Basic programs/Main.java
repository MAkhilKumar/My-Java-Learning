/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

   import java.util.*;
class leap {
    public static void main(String[] args) {
        int year ;
        Scanner input = new Scanner (System.in);
        year = input.nextInt();
        if ((year %4 ==0) &&  (year%100!=0) || (year%400==0)){
        System.out.println(" is a leap year");
    }
    else {
        System.out.println(" is not a leap year");
    }
}
}