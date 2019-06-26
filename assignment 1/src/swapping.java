import java.util.Scanner;


public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		System.out.println("enter the value:");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("before swaping"+x+"\t" +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping"+x+"\t" +y);

	}

}
