package deemo;
import java.util.*;
public class fibo_series
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a num");
		int n = obj.nextInt(); //n=5
		int t1=0,t2=1;
		for(int i=2; i<n; i++) //i=6
		{
			int sum=t1+t2; //1
			System.out.print(""+sum); //1
			t1=t2; //t1=1
			t2=sum; //t2=1
		}
		}
}
			
		
		
				
	


