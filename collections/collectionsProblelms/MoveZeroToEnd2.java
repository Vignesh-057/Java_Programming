package collections.collectionsProblelms;

import java.util.*;

public class MoveZeroToEnd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                al.add(arr[i]);
            } else {
                count++; 
            }
        }
        
        for (int i = 0; i < count; i++) {
            al.add(0);
        }
        System.out.println(al);
        
        // Step 5: Convert the ArrayList back to an array
//        for (int i = 0; i < al.size(); i++) {
//            arr[i] = al.get(i);
//        }
//        
//        // Print the modified array
//        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }
}
