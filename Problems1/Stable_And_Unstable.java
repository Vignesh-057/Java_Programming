package Problems1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Stable_And_Unstable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int a1[] = new int[5];
			for (int j = 0; j < 5; j++) {
				a1[j] = sc.nextInt();
			}
			int res1 = 0;
			int res2 = 0;
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
				
			System.out.println(res1-res2);
		}
	}
}
