package collections.collectionsProblelms;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroToEnd {
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
			al.add(arr[i]);
		}
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i)==0) {
				al.remove(i);
				count++;
			}
		}
		
		for(int i=0;i<count;i++) {
			al.add(0);
		}
		System.out.println(al);
	}
}