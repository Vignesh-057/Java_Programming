package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		even.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		// int res = even.size()-2;
		System.out.println(even.get(even.size() - 2) + odd.get(odd.size() - 2));

	}
}