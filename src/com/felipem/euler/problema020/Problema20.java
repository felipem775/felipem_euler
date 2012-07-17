/**
 * 
 */
package com.felipem.euler.problema020;

import java.math.BigInteger;

import com.felipem.euler.math.Factorial;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema20 {

	/**
	 * n! means n × (n − 1) × ... × 3 × 2 × 1
	 * 
	 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
	 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
	 * 
	 * Find the sum of the digits in the number 100!
	 * 
	 * n! significa n x (n - 1) x ... x 3 x 2 x 1
	 * 
	 * Por ejemplo, 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800,
	 * y la suma de los dígitos del número 10! es 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
	 * 
	 * Halla la suma de los dígitos del número 100!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Double factorial100 = Factorial.getFactorial(100);
		System.out.println(factorial100);
		factorial100 = new Double(123456789);
		int suma = 0;
		
		while (factorial100 > 0) {
			suma += factorial100 % 10;
			factorial100 = Math.floor(factorial100 / 10);
		}
		System.out.println(suma);
	}

}
