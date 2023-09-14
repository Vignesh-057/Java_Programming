package collections.collectionsProblelms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayRotationUsingCollection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		System.out.println("Enter array elements: ");
		
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter no of ratation: ");
		int d = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			al.add(arr[i]);
		}
		Collections.rotate(al, d); // Collections.rotate(al, -d);
		// System.out.println(al); // -d left rotations

//		for (int i = 0; i < al.size(); i++) {
//			arr[i] = al.get(i);
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(int i:al) {
			System.out.println(i);
		}
	}
}
