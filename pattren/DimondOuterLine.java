package pattren;

import java.util.Scanner;

public class DimondOuterLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		n=n-1;
		for (int i = -n; i <=n; i++) {
			int l;
			if (i < 0) {
				l = -i;
			} else {
				l = i;
			}

			for(int s=0;s<l;s++) {      
				System.out.print(" ");   /// single space  
			}
			for(int j=0;j<2*(n-l)+1;j++) {
//     		    System.out.print(l+""+j);
//     			System.out.print("* ");
				if(j==0 || n==l+j ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  "); /// double space
				}
			} 
			System.out.println();
		}
	}
			/* using 2 loop method */
//			for (int j = 0; j < 2*n-l+1; j++) {
//				if (j < l) {
//					System.out.print("  ");    
//				} else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
//	}
}
