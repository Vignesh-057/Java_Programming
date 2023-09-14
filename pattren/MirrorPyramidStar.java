package pattren;

import java.util.Scanner;

public class MirrorPyramidStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		for (int i = -n+1; i < n; i++) {
			int l;
			if (i < 0) {
				l = -i;
			} else {
				l = i;
			}

//			for(int s=0;s<n-l;s++) {      
//				System.out.print(" ");    //single space 
//			}
//			for(int j=0;j<l+1;j++) {      
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
			/* using 2 loop method */
			for (int j = 0; j < n + 1; j++) {
				if (j < n - l) {
					System.out.print(" ");    // single space // double space == RigthArrowStar
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
