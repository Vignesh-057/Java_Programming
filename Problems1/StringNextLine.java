package Problems1;

import java.util.Scanner;

public class StringNextLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		for(int i=0;i<str.length();i++) {
			char c = sb.charAt(i);
			if(Character.isLowerCase(c)) {
				sb.setCharAt(i, Character.toUpperCase(c));
			}else {
				sb.setCharAt(i, Character.toLowerCase(c));
			}
		}
		
		str = sb.toString();
		
		
		
		String s[] = str.split("(?=[ a-z])");
		for (String word : s) {
            System.out.println(word);
        }
		//System.out.println(s[0]);dd	
	}
}