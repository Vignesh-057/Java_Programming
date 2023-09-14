package collections;

import java.util.*;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> l = new LinkedList<>();
		l.add("dhoni");
		l.add("kholi");
		l.add("vignesh");
		l.add("kumar");
		l.add("abd");
		//System.out.println(l);
		l.addFirst("MS");
		System.out.println(l);
		System.out.println(l.getFirst());
		l.remove(4);
//		for(String str:l) {
//			System.out.println(str);
//		}
		Iterator <String> it = l.iterator();
		System.out.println();
		while(it.hasNext()) {
			String check = it.next();
			if(check.equals("dhoni")) {
				it.remove();
			}
		}
		System.out.println(l);

	}

}
