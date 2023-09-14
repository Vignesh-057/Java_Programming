package Stack;
import java.util.*;
public class DemoMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,1,1,1,1,2,5,2,3,5};
		Map<Integer,Integer> mp=new TreeMap<>();
		for(int i:a) {		
			if(!mp.containsKey(i)) {
				mp.put(i,1);
			}else{
				mp.put(i,mp.get(i)+1);
			}
		}
		for(int i:mp.keySet()) {
			if(mp.get(i)<2) {
			System.out.println(i);
			}
		}
	}
}