package Problems;

import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p;
		int n=sc.nextInt();
		int r=sc.nextInt();
		int d = n-r;
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum *=i;
		}
		int sum2 =1;
		for(int i=1;i<=d;i++) {
			sum2*=i;
		}
		int result = sum/sum2;
	    System.out.println(result);
	}

}
