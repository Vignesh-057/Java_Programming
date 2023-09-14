package Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,6,7,78,8,9,9,0};
		List<Integer> l=new LinkedList<>();
//		l=Arrays.asList(a);
//		l.add(a);
		for(int i:a)
		{
			l.add(i);
		}
		System.out.println(l.remove(Integer.valueOf(5)));
		System.out.println(l);
	}
}
// Java Program to convert
// Array to List
//
//import java.util.*;
//import java.util.stream.*;
//
//class Collection {
//
//	// Generic function to convert an Array to List
//	public static <T> List<T> convertArrayToList(T array[])
//	{
//
//		// Create the List by passing the Array
//		// as parameter in the constructor
//		List<T> list = Arrays.asList(array);
//
//		// Return the converted List
//		return list;
//	}
//
//	public static void main(String args[])
//	{
//		// Create an Array
//		int array[]
//			= { 1,2,3,4,5,6,7,8,9,00,99};
//
//		// Print the Array
//		System.out.println("Array: "
//						+ Arrays.toString(array));
//
//		// convert the Array to List
//		List<int[]> list = Arrays.asList(array);
//
//		// Print the List
//		for(int[] i:list) {
//			System.out.println(i);
//		}
//		System.out.println("List: " + list);
//	}
//}
