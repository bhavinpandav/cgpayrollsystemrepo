
public class Sequence {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		int rem=0,i=0,count=0;
		int arr[]=new int[number];
		while(number>0){
			i++;
			rem=number%10;
			if(rem<=9)
				count++;
			arr[i]=rem;
			number/=10;
		}
		for(int j=0;j<=count;j++){
			for(int k=j;k<=count;k++){
				if(arr[j]<arr[k]){
					int temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		System.out.print("The largest number is ");//display largest number
		for(int j=0;j<count;j++){
			System.out.print(arr[j]);
		}
		int sec=0;
		System.out.print("\nThe smallest number is ");//display smallest number
		for(int j=count-1;j>=0;j--){
			if(arr[j]>0){
				System.out.print(arr[j]);
				sec=arr[j];
				break;
			}
		}
		for(int j=count-1;j>=0;j--){
			if(sec==arr[j]){
				continue;
			}else{
				System.out.print(arr[j]);
			}
		}
	}
}
