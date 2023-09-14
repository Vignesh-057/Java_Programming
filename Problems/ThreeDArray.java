
package Problems;

import java.util.Scanner;

public class ThreeDArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a[][][] = {{
			    {1,2,3},
			    {4,5,6},
			    {7,8,9}},
			{
				{10,11,12},
				{13,14,15},
				{16,17,18}},
			{
				{19,20,21},
				{22,23,24},
				{25,26,27}}};
		
		int b[][][] = new int[3][3][3];
		int c[][][] = new int[3][3][3];
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					b[i][j][k] = sc.nextInt();
					c[i][j][k] = a[i][j][k]+b[i][j][k];
			     }
		    }
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					System.out.print(c[i][j][k]+" ");
			     }
				System.out.println();
		    }
			System.out.println();
		}
		
	}

}
