import java.util.*;
public class Fibonacci 
{

	public static void main(String args[]) 
	{
		
		int a=0, b=1, sum, count, i;
		System.out.println("Enter a no:" );
		Scanner S=new Scanner(System.in);
		count=S.nextInt();
		System.out.print("");
		for(i=1; i<=count; i++)
		{
			System.out.print(" ");
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
			}
	}
}


