package pattren;

import java.util.Scanner;

public class HallowPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {      
				System.out.print("  ");
			}
			for(int j=0;j<i*2+1;j++) {
				//System.out.print(" "+j+i);
				if(j==0 || j==2*i || i==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
