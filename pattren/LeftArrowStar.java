package pattren;

import java.util.Scanner;

public class LeftArrowStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		n=n-1;
		for (int i = -n; i <= n; i++) {
			int l;
			if (i < 0) {
				l = -i;
			} else {
				l = i;
			}

			for(int j=1;j<=l+1;j++) {      
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
