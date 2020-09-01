package deemo;
import java. util.*;
public class add
{
	public static void main(String[] args)//main class
	{
		int num1,num2,sum;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first num");
			num1=sc.nextInt();
			System.out.println("enter second num");
			num2=sc.nextInt();
			sum = num1+ num2;
		System.out.println("sum of these num:"+sum);
	}
}