package Problems;

import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sc.close();
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) >= 97 && sb.charAt(i) <= 122) {
				int c = sb.charAt(i) - 32;
				sb.setCharAt(i, (char) c);
			} else if (sb.charAt(i) >= 65 && sb.charAt(i) <= 90) { 
				int c = sb.charAt(i) + 32;
				sb.setCharAt(i, (char) c);
			}
		}
		System.out.println(sb);
	}
}