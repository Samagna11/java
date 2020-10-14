package deemo;
import java.util.*;
public class Reverse 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a num");
		int num=obj.nextInt();
		int rev=0;
		while(num!=0)
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		System.out.println("" +rev);
		}

}
