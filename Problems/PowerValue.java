package Problems;

import java.util.Scanner;

public class PowerValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int expo = sc.nextInt();
		int sum =1;
		for(int i=1;i<=expo;i++) {
			sum= sum*base;
		}
		System.out.println(sum);
		
	}

}
