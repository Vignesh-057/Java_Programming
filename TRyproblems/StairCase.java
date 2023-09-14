package TRyproblems;

import java.util.Scanner;

public class StairCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		//System.out.println(n);
		int sum =n;
		for(int i=0;i<n;i++) {
			sum=sum-i;
			if(sum>i) {
				
				count++;
			}
		}
		System.out.println(count);
	}
}