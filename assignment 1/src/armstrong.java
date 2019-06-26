import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f=0,a,temp;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0){
			a=n%10;
			
			n=n/10;
			f=f+a*a*a;
			
			
		}
		if(temp==f){
			System.out.println(+temp+"the number is armstrong");
			
		}
		else{
			System.out.println(temp+"the number is not armstrong");
		}
	}

}
