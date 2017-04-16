package main.java;

public class HelloWorld {

	/**
	 * Make the classic HelloWorld program in Java.
	 * 
	 * @return the statement "Hello World"
	 */
	public static String hello() {
		return "Hello World";
	}

	/**
	 * Make a basic summation function between two integers.
	 * 
	 * @param x
	 * @param y
	 * @return the sum of x and y.
	 */
	public static int sum(int x, int y) {
		return x + y;
	}

	/**
	 * Return the distance between the two given numbers.
	 * 
	 * Hint: Explore the Math (Use Math(dot)) and find useful functions to
	 * solve.
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return the distance between the given coordinates.
	 */
	public static int distance(int x1, int y1, int x2, int y2) {
		int nX = x2 - x1;
		int nY = y2 - y1;
		int nXsquare = (int) Math.pow(nX, 2);
		int nYsquare = (int) Math.pow(nY, 2);
		return (int) Math.sqrt(nXsquare + nYsquare);
	}

	/**
	 * Return the sum of the values within the given array.
	 * 
	 * Hint: Use a for loop. If you are daring, use a while loop. If you are an
	 * expert, use recursion.
	 * 
	 * @param listOfInts
	 *            an array of integers.
	 * @return sum of of array values.
	 */
	public static int summation(int[] listOfInts) {
		return summationHelper(listOfInts, 0, 0);
	}
	
	public static int summationHelper(int[] listofInts, int currentIndex, int sum) {
		if (currentIndex == listofInts.length) {
			return sum;
		}
		sum = sum + listofInts[currentIndex];
		return summationHelper(listofInts, currentIndex + 1, sum);
	}

	/**
	 * Combine the two given strings.
	 * 
	 * Example: If the strings "Hello" and "World" were given, the result would
	 * be "HelloWorld."
	 * 
	 * @param a
	 * @param b
	 * @return the combined strings.
	 */
	public static String combineString(String a, String b) {
		return a + b;
	}
	
	/**
	 * Return a Boolean value indicating if the number is divisible by 2.
	 *
	 * Hint: Use the modulus operator (%).
	 * 
	 * @param number
	 * @return
	 */
	public static boolean divisibleByTwo(int number) {
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}
}