/**
 * 
 */
package com.felipem.euler.problema001;

/**
 * @author felipe
 *
 */
public class Problema1 {

	/**
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 * Si listamos todos los números naturales inferiores a 10 que son múltiplos de 3 o 5, obtenemos 3, 5, 6 y 9. La suma de estos múltiplos es 23.
	 * Halla la suma de todos los múltiplos de 3 ó 5 menores que 1000.
	 * @param args
	 */
	public static void main(String[] args) {
		int suma = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				suma+=i;
			}
		}
		System.out.println(suma);
	}

}
