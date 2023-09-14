package pattren;

import java.util.Scanner;

public class PyramidUsing2Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
//			for(int s=0;s<n-i-1;s++) {      
//				System.out.print("  ");
//			}
			for(int j=0;j<n+i;j++) {           //j === n+i      
				if(j<n-i-1) {                  // space formula 
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}
