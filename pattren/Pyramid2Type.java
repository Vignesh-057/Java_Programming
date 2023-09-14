package pattren;

import java.util.Scanner;

public class Pyramid2Type {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {      
				System.out.print(" ");    //single space 
			}
			for(int j=0;j<n+i-4;j++) {      
				System.out.print("* ");
			}
			System.out.println();
		}
	}
    /*using 2 loop method
     * for(int j=0;j<2*n-5;j++) {  
				if(j<n-i-1) {
					System.out.print(" ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();*/

}
