import java.util.Scanner;

class MainClass{  
 public static void main(String args[]){  
	 int n;
	 System.out.println("enter the number");
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 if(n>0){
		 if(n%2==0){
			 System.out.println("this is even number");
			 
		 } 
		 else{
			 System.out.println("it is odd");
		 }
	 }
	 else{
		 System.out.println("it is negative no");
	 }
	 }  
}  