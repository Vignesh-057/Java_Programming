package pattren;

import java.util.Scanner;

public class UpArrowStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		n = n-1;
		for (int i = 0; i <=n; i++) {
			int l;
			if (i < 0) {
				l = -i;
			} else {
				l = i;
			}

			for(int j=-n;j<=n;j++) { 
				if(-(i)<j && j<(i)) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
}
