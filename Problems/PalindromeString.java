package Problems;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		String str2 = sb.reverse().toString();
		
		if(str2.toLowerCase().equals(str.toLowerCase())){
			System.out.println("palindrome");	
		}else {
			System.out.println("not palindrome");
		}
	//	System.out.print(str2);
		
		
//		char str2 [] = str.toCharArray();
//		String res ="";
//		for(int i=str2.length-1;i>=0;i--) {
//			res += str2[i];
//		}
//		if(str.toLowerCase().equals(res.toLowerCase())){
//			System.out.println("palindrome");	
//		}else {
//			System.out.println("not palindrome");
//		}
			
	}

}
