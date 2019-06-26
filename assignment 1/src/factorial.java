import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		int n,i,fact=1;
		System.out.println("enter thge number:");
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 
		 for(i=1;i<=n;i++)
		 {
			 fact=fact*i;
			 System.out.println("factorial:"+fact);
		 }

	}

}
