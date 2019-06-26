import java.util.Scanner;


public class PAEODD {

	public static void main(String[] args) {
		int temp,a,f=0,rev=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0){
			if(n%2==0){
				System.out.println(+n+" is even number");		 
			} 
			else{
				System.out.println(+n+" is odd");
			}
		}
		temp=n;
		while(n>0){
			a=n%10;
			f=f+a*a*a;
			rev=rev*10+a;
			n=n/10;		 
		}
		if(temp == f){
			System.out.println(temp+" is armstrong");
		}
		else{
			System.out.println(temp+" is not armstrong");
		}
		if(rev==temp){
			System.out.println(temp+"it is palindrome");
		}			
		else{
			System.out.println(temp+"it is not palindrome");
		}
		boolean flag=false;
		int g=temp/2;
		if (temp>0) {
			for (int i = 1;i<g; i++) {
				if (temp/i==0||temp==1) {
					continue;
				}
				else{
					flag=true; 
					break;
				}
			}
			if(flag){
				System.out.println(+temp+" this is prime number");
			}else{
				System.out.println(+temp+" is not prime number");

			}
		}
	}

}
