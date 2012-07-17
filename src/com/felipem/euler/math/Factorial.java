/**
 * 
 */
package com.felipem.euler.math;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static double getFactorial(double num) {
		
		if (num > 2) {
			return num * getFactorial(num -1);
		}
		else {
			return num;
		}

	}

}
