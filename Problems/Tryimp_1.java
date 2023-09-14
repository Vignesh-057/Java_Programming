package Problems;
import java.util.Scanner;

public class Tryimp_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			} else {
				System.out.print(ch);
				System.out.print(count);
				System.out.println();
				ch = str.charAt(i);
				count = 1;
			}
		}
//		System.out.print(ch);
//		System.out.print(count);
//		System.out.println();
	}
}