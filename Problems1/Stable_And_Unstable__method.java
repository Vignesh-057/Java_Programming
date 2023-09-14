package Problems1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Demo{
	public static int find_pass(int input1,int input2,int input3, int input4, int input5){
		int res1 = 0;
		int res2 = 0;
		for (int i = 0; i < 5; i++) {
			int a1[] = new int[5];
//			for (int j = 0; j < 5; j++) {
//				a1[j] = sc.nextInt();
//			}
			a1[0] = input1;
			a1[1] = input2;
			a1[2] = input3;
			a1[3] = input4;
			a1[4] = input5;
			
			ArrayList<Integer> stable = new ArrayList<Integer>();
			ArrayList<Integer> unstable = new ArrayList<Integer>();
			for (int j = 0; j < 5; j++) {
				int alen = 0;
				int atemp = a1[j];
				while (atemp > 0) {
					alen++;
					atemp /= 10;
				}
				HashSet<Integer> hs = new HashSet<>();
				int rem;
				int a = a1[j];
				while (a > 0) {
					rem = a % 10;
					hs.add(rem);
					a /= 10;
				}

				
				if ((alen / 2) == hs.size()) {
					stable.add(a1[j]);
					// System.out.println(a1[j]);
				} else {					
					unstable.add(a1[j]);					
					// System.out.println(a1[j]);
				}
			}
				Collections.sort(stable);
				res1 = stable.get(stable.size()-1);
				Collections.sort(unstable);
				res2 = unstable.get(0);
				
			
		}
		return (res1-res2);
	}
}
public class Stable_And_Unstable__method  {
	public static void main(String[] args) {
		Demo d = new Demo();
//		d.find_pass(122, 211, 1010, 3535, 4747);
		System.out.println(d.find_pass(112,211,1010,3535,4747));
		
	}

}
