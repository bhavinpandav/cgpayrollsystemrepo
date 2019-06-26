
public class MM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		int a[][]={{3,3,3,},{3,3,3},{3,3,3}};
		int b[][]={{4,4,4},{4,4,4},{4,4,4}};
		int c[][]=new int [3][3];
		for (i = 0;i  < c.length;i ++) {
			for ( j = 0; j < c.length; j++) {
				for (k = 0; k < c.length; k++) {
					c[i][j]=c[i][j]+a[k][j]*b[i][k];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
