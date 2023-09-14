package pattren;

import java.util.Scanner;

public class Star1to5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {      //reverse star "j<n-i"
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}
