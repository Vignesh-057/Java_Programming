package Problems;
import java.util.Scanner;
public class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,lcm;
		a = sc.nextInt();
		b = sc.nextInt();
		lcm = (a>b)?a:b;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}
}