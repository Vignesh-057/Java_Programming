package TRyproblems;

import java.util.Scanner;

public class TwoArray {

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
		int arr3[]=new int[arr1.length+arr2.length];
		int i=0;
		for( i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		int k=0;
		for(int j=arr1.length;j<arr3.length;j++) {
			arr3[j]=arr2[k++];
			//System.out.println(arr3[j]);
		}
		for(int m=0;m<arr3.length;m++) {
			System.out.print(arr3[m]+" ");
		}
	}
}