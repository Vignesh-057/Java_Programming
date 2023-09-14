package collections;

import java.util.LinkedList;
import java.util.*;

public class Collection_iteratror {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> l = new LinkedList<>();
		l.add("dhoni");
		l.add("kholi");
		l.add("vignesh");
		l.add("kumar");
		l.add("abd");
		l.addFirst("MS");
		
//		for(String str:l) {
//			System.out.println(str);
//		}
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String i = it.next();
			if(i.equals("dhoni")) {
				it.remove();
			}
		}
//		for(String str:l) {
//			String s = it.next();
//			if(s.equals("abd")) {
//				it.remove();
//			}
//		}
		System.out.println(l);

	}

}
