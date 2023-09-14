package collections;

import java.util.HashSet;
import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HashSet<Character> hs = new HashSet<>();
		hs.add('a');
		System.out.println(hs);
	}
}
