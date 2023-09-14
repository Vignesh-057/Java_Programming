package collections.collectionsProblelms;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
//		for(int i=0;i<al.size();i++) {
//			if(al.get(i)==0) {
//				al.remove(i);
//			}
//		}
		al.removeIf(element -> element == 0);
		System.out.println(al);
		
	}
}
