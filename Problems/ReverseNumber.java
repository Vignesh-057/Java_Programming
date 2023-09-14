package Problems;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int t =0;
		int rem;
		while(n!=0) {
			rem = n%10;
			t = (t*10) + rem;
			n = n/10;
		}
		System.out.println(t);
	}
}