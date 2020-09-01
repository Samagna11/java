package deemo;
import java.util.*;
public class Sequence
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int n=obj.nextInt();
		int even=n/2;
		int odd=(3*n)+1;
		while(n!=1)
		{
			if(n%2==0)
			{
				System.out.println(n+ "");
				 even=n/2;
				 n=even;
			}
			else
				if (n%2!=0)
			{
				System.out.println(n+ "");
				odd=(3*n)+1;
				n=odd;
			}
		}
		System.out.print(n);	
	}

}
