package Problems;

import java.util.Scanner;
public class Occurance {
	public static void main(String args[]) {
		String str;
		int i, len;
		int counter[] = new int[26];
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		str = sc.nextLine();
		len = str.length();
		
		for(i=0;i<counter.length;i++)
		{
			counter[i]=0;
		}
		
		for (i = 0; i < len; i++) {
			
			char c=str.charAt(i);
			
			counter[c-97]++;
			
		}
		for(i=0;i<26;i++)
		{
			if(counter[i]!=0)
			System.out.println( (char)(97+i)+" "+counter[i]);
		}
		
	}
}