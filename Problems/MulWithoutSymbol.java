package Problems;

import java.util.Scanner;

public class MulWithoutSymbol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = sc.nextInt();
		int sum =0;
		for(int i=1;i<=mul;i++) {
			sum= sum+n;
		}
		System.out.println(sum);
		
	}

}
