/**
 * 
 */
package com.felipem.euler.problema005;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema005 {

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 * 
	 * 2520 es el número más pequeño que puede ser dividido entre cada uno de los números del 1 al 10 sin quedar ningún resto.
	 * ¿Cuál es el menor número positivo que es divisible entre todos los números del 1 al 20? 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int hastaCual = 20;
		int numero = 20;
		
		
		while (!cumpleTodos(numero, hastaCual)) {
			numero++;
		}
		System.out.println(numero);
	}
	private static boolean cumpleTodos(int numero, int hastaCual) {
		for (int i = 2; i < hastaCual; i++) {
			if (numero % i !=0 ) return false;
		}
		return true;
		
	}

}
