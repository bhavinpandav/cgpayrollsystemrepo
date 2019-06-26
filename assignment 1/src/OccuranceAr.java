import java.util.Scanner;


public class OccuranceAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array no you want in array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number of array");
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the occuring no");
		f=sc.nextInt();
		for (int i = 0; i < n; i++) {
			if(a[i]==f){
				count++;
			}

		}			System.out.println("no of occurance of "+f+" is "+count);

	}

}
