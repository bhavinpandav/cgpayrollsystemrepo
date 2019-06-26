import java.util.Scanner;
import java.util.function.BinaryOperator;


public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Decimal To Binary of "+n);
		System.out.println(Integer.toBinaryString(n));

	}

}
