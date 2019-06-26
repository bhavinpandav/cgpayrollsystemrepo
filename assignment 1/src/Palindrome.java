import java.util.Scanner;


public class Palindrome {
public static void main(String[] args) {
	int num,rev=0,rmd;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	int n=num;
	while(num>0){
		rmd=num%10;
		rev=rev*10+rmd;
		num=num/10;
	}
	if(rev==n){
		System.out.println(n+"it is palindrome");
	}
	else{
				System.out.println(n+"it is not palindrome");
	}
	}
}
