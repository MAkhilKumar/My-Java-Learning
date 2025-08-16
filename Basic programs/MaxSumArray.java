import java.util.*;
public class MaxSumArray
{
	public static void main(String[] args) {
	    int array[]={2,4,6,8,10};
	    
	    int min = Integer.MIN_VALUE;
	    for(int i=0;i<array.length;i++){
	        int start=i;
	        for(int j=i;j<array.length;j++){
	            int end=j;
	            int sum=0;
	            for(int a=start;a<=end;a++){
	                sum+=array[a];
	            }
	            System.out.println(sum);
	            if(min<sum){
	                min = sum;
	            }
	        }
	        
	    }
	    System.out.println("max sum is "+min);
	}
}