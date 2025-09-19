import java.util.*;
public class BillingSystem
{
    public static void Menu(String [] items,int [] bill)
    {
        System.out.println("Welcome to SuperMarket");
        System.out.println("No  Item            Price");
        System.out.println("--------------------------");
        for(int i=0;i<items.length;i++)
        {
            System.out.printf("%d. %-15s - $%d\n",i,items[i],bill[i]);
        }
        
    }
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
		String [] menu={"Burger","Pizza","Sandwich","Mango", "pastry","Chocolate cake"};
        int[] price={50,250,179,150,99,300};
        Menu(menu,price);
        int store=0;
        double totalbill=0;
        int numberItems=0;
        double tax=0;
        int [] quantityStore=new int [menu.length];
        int subtotal=0;
        System.out.println("do you want to shop (Yes/No) ");
        char ch=scan.next().charAt(0);
        while(ch == 'y' || ch == 'Y')
        {
            System.out.println("Enter your items no  ");
            store=scan.nextInt();
            if(store >5 || store<0)
            {
             System.out.println("Enter Correct Number");
                    
            } 
            else
            {
                System.out.print("Enter Quantity number ");
                numberItems=scan.nextInt();
                quantityStore[store]=quantityStore[store]+numberItems;
                System.out.println("Do you want to shop again (y/n)");
                ch=scan.next().charAt(0);
            }
         
        }
         for(int i=0;i<menu.length;i++)
         {
             if(quantityStore[i]>0)
             {
                 System.out.println(i+ "  - " +menu[i]+ "  - "+price[i]+ "  - "+quantityStore[i]+ "  - "+price[i]*quantityStore[i]);
             }
         }
         for(int i=0;i<menu.length;i++)
         {
             if(quantityStore[i]>0){
                 subtotal=subtotal +(price[i]*quantityStore[i]);
             }
         }
         tax=subtotal * 0.10;
         totalbill= subtotal + tax;
         System.out.println("Your bill is "+totalbill);
	}
}
