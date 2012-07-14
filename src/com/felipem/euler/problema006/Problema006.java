/**
 * 
 */
package com.felipem.euler.problema006;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema006 {

	/**
	 * The sum of the squares of the first ten natural numbers is,
	 * 		1^2 + 2^2 + ... + 10^2 = 385
	 * The square of the sum of the first ten natural numbers is,
	 * (1 + 2 + ... + 10)2 = 552 = 3025
	 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 * 
	 * La suma de los cuadrados de los diez primeros números naturales es,
	 * 1² + 2² + ... + 10² = 385
	 * El cuadrado de la suma de los diez primeros números naturales es,
	 * (1 + 2 + ... + 10)² = 55² = 3025
	 * Por tanto, la diferencia entre la suma de los cuadrados de los diez primeros números naturales y el cuadrado de la suma de estos es 3025 - 385 = 2640.
	 * Halla la diferencia entre la suma de los cuadrados de los primeros cien números naturales y el cuadrado de la suma de estos.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int cuadradoPrimeros = 0;
		int sumaPrimeros = 0;
		
		int hastaCual = 101;
		/*
		 * Para cuadradoPrimeros voy calculando el resultado final
		 * Para sumaPrimeros voy calculando sólo la suma, después del bucle realizaré el cuadrado
		 */
		for (int i = 1; i< hastaCual; i++) {
			cuadradoPrimeros += i*i;
			sumaPrimeros += i;		
		}
		System.out.println(sumaPrimeros*sumaPrimeros - cuadradoPrimeros);
		//System.out.println(cuadradoPrimeros - sumaPrimeros*sumaPrimeros );

	}

}
