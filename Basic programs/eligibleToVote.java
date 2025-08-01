import java.util.*;

public class eligibleToVote {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int n=input.nextInt(); 
        if(n > 18 ){
          System.out.print(n+ " is eligible to vote ");
        }
         
        else {
            System.out.print(n+ " is not eligible");
        }
  }
}
