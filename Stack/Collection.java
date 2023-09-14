package Stack;

import java.util.HashSet;
import java.util.Scanner;

public class Collection {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = { 7, 2, 2, 1, 5, 6 };
		HashSet<Integer> se = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			se.add(a[i]);
		}
		System.out.println(se);
	}
}