package Problems;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		
		String str="bghtgegynrniveiivutpoeuyuirnbjddvhgtryupoeetjlvhnil";
		
		Map<Character,Integer> mp=new TreeMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(mp.containsKey(str.charAt(i)))
			{
				mp.put(c,mp.get(c)+1);
			}
			else {
				mp.put(c,1);
			}
		}
		
		
		
		System.out.println(mp);
		
		  for (Entry<Character, Integer> entry : mp.entrySet()) 
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
		
		  
		for(char i:mp.keySet())
		{
			System.out.println(i+"-->"+mp.get(i));
		}
		
		
		
	}
}
