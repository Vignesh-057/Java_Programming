package pattren;

import java.util.Scanner;

public class xxx123MiddleLogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i) {
					if (i < n / 2) {
						System.out.print(n - i);
					} else {
						System.out.print(i + 1);
					}
				} else if (n == i + j + 1) {
					if (i < n / 2) {
						System.out.print(i + 1);
					} else {
						System.out.print(j + 1);
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}