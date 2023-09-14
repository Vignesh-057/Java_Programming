package Problems1;

import java.util.Scanner;

public class NStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 1;
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					++i;
				} else {
					break;
				}
			}
			//System.out.print(count);
			if (count > 1) {
				String c = String.valueOf(count);
				str1 += c+str.charAt(i);
				//System.out.print(str1);
			}else {
				str1 += String.valueOf(str.charAt(i));
				//System.out.print(str1);
			}
			count=1;
		}
		System.out.print(str1);
	}
}





/*ANOTHER METHOD IN CHATGPT
 * 
 * import java.util.Scanner;

public class NStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String compressedString = compressString(str);
        System.out.println(compressedString);
    }

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(count).append(input.charAt(i));
                count = 1;
            }
        }

        return compressed.toString();
    }
}
*/
