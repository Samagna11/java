package deemo;
import java.util.*;
public class fiboseries
{
public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter fibonacci upto given num");
	int k= obj.nextInt(); //k=10
	int a= 0;
	int b= 1;
	int i;
	
	System.out.println(a); //0
	int sum=0;
	for( i=2; sum<k; i++) //3
	{
		sum=a+b; //1
		a=b; //1
		b=sum; //2
		System.out.println(" " +a);
	}
}
	
}
