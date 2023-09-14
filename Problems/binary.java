package Problems;

import java.util.Scanner;

public class binary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = 0, d = 0, rem;
		while (n != 0) {
			rem = n % 10;
			sum += (rem * Math.pow(2, d++));
			n /= 10;
		}
		System.out.println(sum);
	}
}