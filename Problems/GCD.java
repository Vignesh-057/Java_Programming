package Problems;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = 0;
		int min = (a<b)?a:b;
		for(int i=1;i<min;i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	
	}

}
