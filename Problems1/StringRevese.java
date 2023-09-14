package Problems1;

import java.util.Scanner;

public class StringRevese {
	public static String rev(String str) {
		StringBuilder sb = new StringBuilder(str);

		// sb.reverse();
		// sb.toLowerCase();
		String temp = sb.reverse().toString();
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] ch = str.split(" ");
		System.out.println(ch.length);
		for (String s : ch) {
			System.out.print(rev(s) + " ");
		}
		// for (int i = 0; i < ch.length; i++) {
		// System.out.print(rev(ch[i]) + " ");
		//
		// }
	}
}
