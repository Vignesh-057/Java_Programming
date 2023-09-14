package TRyproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class ListUsing {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int size1=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
//		String s="";
//		for(int i=0;i<arr1.length;i++) {
//			s+=arr1[i];
//		}
//		for(int i=0;i<arr2.length;i++) {
//			s+=arr2[i];
//		}
//		String s1[]=s.split("");
//		for(int i=0;i<s1.length;i++) {
//			System.out.println(s1[i]+" ");
//		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			al.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			al.add(arr2[i]);
		}
		Object[] arr = al.toArray();
		for(int i=0;i<al.size();i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
