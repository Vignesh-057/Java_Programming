package Problems;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int tem = n;
		int t =0;
		int rem;
		while(n!=0) {
			rem = n%10;
			t = (t*10) + rem;
			n = n/10;
		}
		if(t==tem) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("NOt palindrome "+t);
		}
		//System.out.println(t);
	}

}
