package deemo;
import java.util.*;
public class sumfibo 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number");
		int n=obj.nextInt(); //n=4
		int a=0;
		int b=1;
		int c=0;
		int sum=a+b; //sum=1
		for(int i=2; i<=n; i++) //i=3
		{
			c=a+b; //c=1 fibo c=4
			sum=sum+c; //sum=1
			a=b;
			b=c;
			}
		System.out.println("sum of fibonacci upto given num:" +sum);
			
		}
		
		

}
