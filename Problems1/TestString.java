package Problems1;

import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);

		String res = sb.reverse().toString();
		System.out.println(res);

		String s[] = res.split("");
		int n = s.length - 1;

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[n] + "");
			--n;
		}
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetterOrDigit(str.charAt(i))) {
			}
		}
	}

}
