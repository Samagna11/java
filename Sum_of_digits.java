package deemo;
import java.util.*;
public class Sum_of_digits 
{
	public static void main(String[] args)
	{
	Scanner obj=new Scanner (System.in);
	System.out.println("enter number");
	int num=obj.nextInt(); 
	int sum=0;
	while(num !=0) 
	{
		int rem=num%10;
		sum=sum+rem;    
		num=num/10;
	}
	System.out.println("sum of digits" +sum);
	}
	

}
