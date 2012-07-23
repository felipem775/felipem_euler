/**
 * 
 */
package com.felipem.euler.problema020;

import java.math.BigInteger;


/**
 * @author felipem ( http://felipem.com )
 *
 * Por problemas con el factorial y pasarlo a String, finalmente he optado por la solución de
 * http://rianjs.net/2011/05/java-solution-to-project-euler-problem-20
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
		
		BigInteger factorial100 = BigInteger.valueOf(1);
		for (int i = 1; i <= 100; i++)
			factorial100 = factorial100.multiply(BigInteger.valueOf(i));
		
		
		String snum = factorial100.toString();
		System.out.println(snum);
		
		int suma = 0;
		
		 
		for (int i = 0; i < snum.length(); i++)
		{
			int n = Integer.parseInt(snum.substring(i,i+1));
			suma += n;
		}
		System.out.println(suma);
	}

}
