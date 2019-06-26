
public class ArrayDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,22,33,400,800,12,321,2,48,4};
		int onedigit=0,twodigit=0,threedigit=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=9){
				onedigit++;
			}else if(arr[i]<=99){
				twodigit++;
			}else if(arr[i]<=999){
				threedigit++;
			}
			
		}System.out.println("1 digit no are"+onedigit);
		System.out.println("2 digit no are"+twodigit);
		System.out.println("3 digit no are"+threedigit);

	}

}
