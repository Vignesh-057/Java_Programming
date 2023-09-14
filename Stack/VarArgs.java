package Stack;

public class VarArgs {
	static int min(int... vals) {
		int min = Integer.MAX_VALUE;            //vals[0]
		for(int k: vals) {
			if(k<min) {
				min = k;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int m = min(23,34,4,5,6,7);
		System.out.println(m);
	}
}
