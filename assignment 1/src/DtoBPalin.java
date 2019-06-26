
public class DtoBPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=27;
		String rev="";
		String a=Integer.toBinaryString(n);
		System.out.println("decimal to binary"+a);
		for (int i = 0; i < a.length(); i++) {
			rev=rev+a.charAt(i);
		}
		if (rev==a) {
			System.out.println("this number is palindrome"+a);
		}
		else{
		System.out.println("this number is not palindrome"+a);
	}
	}
	}
