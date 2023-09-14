package Problems;

import java.util.Scanner;

public class PrintUppwecase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    String str1 = str.replaceAll("[E,A,I,O,U]","");
	    str1 = str1.replaceAll("[A-z]","");
		System.out.println(str1);
//		if(str1.equals("[^0-1]")) {
//			System.out.println("number");
//		}
		
	}

}
