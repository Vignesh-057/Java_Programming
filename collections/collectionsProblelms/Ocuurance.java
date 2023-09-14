package collections.collectionsProblelms;

import java.util.HashMap;
import java.util.Scanner;

public class Ocuurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character,Integer> mp = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(mp.containsKey(str.charAt(i))) {
				mp.put(c, mp.get(c)+1);
			}else {
				mp.put(c, 1);
			}
		}
		for(char c:mp.keySet()) {
			//System.out.println(c+" "+mp.get(c));
			if(mp.get(c)==2) {
				System.out.println(c+" "+mp.get(c));
			}
		}
		System.out.println(mp);
	}
}