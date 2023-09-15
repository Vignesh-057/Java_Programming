package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		char arr[] = a.toCharArray();
		char brr[] = b.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(brr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
		if(Arrays.equals(arr, brr)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	}

}
