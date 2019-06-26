import java.util.Scanner;


public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		System.out.println("input a binary number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextLine();
		System.out.println("Binary to decimal"+Integer.parseInt(n,2));
	

	}

}
