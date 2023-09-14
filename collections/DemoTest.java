package collections;
import java.util.*;

public class DemoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> at = new ArrayList<>();
		at.add(1);
		at.add(6);
		at.add(7);
		at.add(77);
		at.add(5);
		at.add(57);
		// at.remove(1);
		// at.clear();
		at.set(4, 73);
		Collections.sort(at);
		//System.out.println(at);
		for(int i:at) {
			System.out.println(i);
		}
		
//		for(int i=0;i<at.size();i++) {
//			System.out.println(at.get(i));
//		}
		
	}
}
