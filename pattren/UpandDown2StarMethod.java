package pattren;

import java.util.Scanner;

public class UpandDown2StarMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		n=n-1;
		//uparrow
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=2*n+1;j++) {
				if(n-i<j && j<n+1+i) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		//downarrow
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=2*n+1;j++) {
				if(i<j&&j<2*n+1-i) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
