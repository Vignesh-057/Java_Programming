package collections;

import java.util.*;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("England", "London");
		hm.put("Norway", "Oslo");
		hm.put("Germany", "Berlin");
		hm.put("USA", "Washington DC");
		System.out.println(hm.values());
		for(String i:hm.values()) {
			System.out.println(i);
		}
		
		//hm.remove("England");
		
		for(String str:hm.keySet()) {
			System.out.println(str+" --> "+hm.get(str));
		}
		
//		for(Map.Entry m:hm.entrySet())  
//	      {  
//	          System.out.println(m.getKey()+" "+m.getValue());      
//	      }  

			
	}

}
