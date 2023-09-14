package collections.collectionsProblelms;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroToFront {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				al.add(arr[i]);
			}else {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
            al.add(i, 0);
        }
		System.out.println(al);
	}
}