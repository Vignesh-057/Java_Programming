package Problems;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = 0;
		int temp = n;
		int check = temp;
		while(n!=0) {
			digit++;
			n = n/10;
		}
		int sum =0;
		while(temp!=0) {
			
			sum = (int) (sum+Math.pow(temp%10, digit));
			temp/=10;
		}
		if(check==sum) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("not amstrong number");
		}
	}

}
