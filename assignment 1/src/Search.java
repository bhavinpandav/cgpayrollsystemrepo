import java.util.Scanner;


public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int arr[]={10,23,35,15,79,76,15,45,32,15,24};
		System.out.println("enter the number::::");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
		int seachnumber=n;
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==seachnumber){
				flag=true;
				break;
			}
			
		}
		if(flag==true){System.out.println("number is found");

	}
		else{System.out.println("number is not there");}
}
}