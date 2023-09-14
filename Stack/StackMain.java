package Stack;

public class StackMain {
	
	public static void main(String[] args) {
		StackDemo s1 = new StackDemo();
//		s1.push(23);
//		s1.push(47);
//		s1.push(7);
//		System.out.println(s1.pop());
		
		StackDemo s2 = new StackDemo();
		//System.out.println(s2.pop());
		s2.push(123);
		s2.push(417);
		s2.push(77);
		System.out.println(s2.pop());
		s2.push(55);
		s2.push(34);
		s2.push(2);
		System.out.println(s2.pop());
	}
}
