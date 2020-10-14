package deemo;
import java.util.*;
public class triperfect
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a num");
		int n= obj.nextInt();
		int sum=1+n;
		int i=2;
		while(i*i <=n)
		{
			if(n/i==i)
				sum=sum+i;
			else
				sum=sum+i+n/i;
			i=i+1;
		}
		if(sum==3*n)
			System.out.println(n+ "triperfectnum");
		else
			System.out.println(n+"not triperfect number");
				
		}
		

}
