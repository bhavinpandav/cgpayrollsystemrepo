
public class ThirdHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,20,30,35,40,45,31,05,80};
		int find=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length-2; i++) {
			find=arr[i];
		}
System.out.println("The Third Highest number is :"+find);
	}

}
