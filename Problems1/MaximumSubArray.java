package Problems1;

import java.util.Scanner;

public class MaximumSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			max = Math.max(max,arr[i]);
		}
		for(int i=0;i<arr.length;i++) {                  //// conditions
			if(sum+arr[i]<0) {                          ////  sum + arr[i] < 0 ===> sum=0
				sum =0;                                ////   sum + arr[i] >= 0 ===> sum = sum+arr[i];  max = Math.max(max,sum);
				continue;
			}else {
				sum = sum+arr[i];
				max = Math.max(max,sum);
			}
		}
		System.out.println(max);
	}

}
