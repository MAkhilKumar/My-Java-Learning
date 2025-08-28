import java.util.*;
public class ArraySearch
{
    public static int linear(int array[], int keys) 
    {
        Scanner input=new Scanner(System.in);
        for(int a=0;a<array.length;a++)
        {
            if(array[a] == keys) {
                return a;
            }
        }
        return -1;
    }
	public static void main(String[] args) 
	{
	    int array[]={ 2,4,6,8,10,12,14};
	    int keys=12;
	    int index=linear(array, keys);
	    if (index==-1) 
	    {
	       System.out.println("Error! not found");
	    } else 
	    {
	        System.out.println(index);
	    }
	}
}
