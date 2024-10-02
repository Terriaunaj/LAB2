import java.util.Arrays;
import java.util.Scanner;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
			
		
	}
	
	public static double divide(double a, double b) {
		return a/b;
	}
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static boolean isDivisibleBy7(int value) {
		if(value % 7 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String main(String args) {
		
		return "Overloaded main method was passed \"" + args + "\".";
	}
	
	public static int findMin(int a, int b, int c) {
		if(a < b && a < c) {
			return a;
		}
		
		else if(b < a && b < c) {
			return b;
		}
		
		else {
			return c;
		}
	}
	
	public static int findMin(int[] array) {
		Arrays.sort(array);
		return array[0];
	}

	public static double average(int[] array) {
		int sum = 0;
		int count = 0;
		for(int i = 0; i < array.length; ++i) {
			
			sum += array[i];
			count++;
		}
		return (double)sum/count;
	}
	
	public static String[] toLowerCase(String[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = array[i].toLowerCase();
		}
		return array;
	}
	public static String[] toLowerCaseCopy(String[] array) {
		
		String[] copy = Arrays.copyOf(array, array.length);
		
		for(int i = 0; i < array.length; i++) {
			copy[i] = copy[i].toLowerCase();
		}
		return copy;
	}
	
	public static void removeDuplicates(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			int value = array[i];
			
			for(int j = i + 1; j < array.length; j++) {
				
				if(array[j] == value) {
					array[j] = 0;
					array[i] = 0;					
				}
			}
		}
	}
}
