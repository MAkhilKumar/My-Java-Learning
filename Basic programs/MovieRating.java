import java.util.*;

public class MovieRating
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter the movie name: ");
        String movie = scan.nextLine();

        System.out.print("Rate the movie (1 to 5 stars): ");
        int rating = scan.nextInt();

        System.out.println("\n");
        System.out.println("Viewer: " + name);
        System.out.println("Movie: " + movie);
        System.out.println("Your Rating: " + rating);

        if(rating == 5)
            System.out.println("Review: Excellent choice Must-watch! ");
        else if(rating == 4)
            System.out.println("Review: Great movie worth watching! ");
        else if(rating == 3)
            System.out.println("Review: Average  Could be better.");
        else if(rating == 2)
            System.out.println("Review: Not so good Maybe watch once.");
        else if(rating == 1)
            System.out.println("Review: Poor movie. Skip it!" );
        else
            System.out.println("Invalid rating!");

        
        System.out.println("Thanks, " + name + "! ️");
    }
}
