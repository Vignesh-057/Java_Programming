package Problems;

import java.util.Scanner;

public class NonFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int a=-1, b=1,c,d;
		for(int i=0;i<n;i++) {
			c = a+b;
			//System.out.println(c);
			a=b;
			b=c;
			d=a+b;
			for(int j=c+1;j<d;j++) {
				if(j<=n) {
					System.out.println(j);
				}
//					else {
//					break;
//				}
			}
		}
	}
}
