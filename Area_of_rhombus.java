package deemo;
import java.util.*;
public class Area_of_rhombus
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 2 diagonals");
		int d1 = obj.nextInt();
		int d2= obj.nextInt();
		double a= (1.0/2.0)*d1*d2;
		System.out.println("area of rhombus=" +a);		
	}

}
