/**
 * 
 */
package com.felipem.euler.problema007;

import java.util.ArrayList;
import java.util.List;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema007 {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 * 
	 * Haciendo una lista de los seis primeros números primos obtenemos: 2, 3, 5, 7, 11 y 13, podemos ver que el sexto primo es 13.
	 * ¿Cuál es el 10.001er número primo?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> primos = new ArrayList<Integer>();
		primos.add(2);
		int quePrimo = 10001;
		int numero = 2;
		while (primos.size() < quePrimo ) {
			numero++;
			if (esPrimo(numero, primos)) {
				primos.add(new Integer(numero));
			}
			
		}
		System.out.println(numero);
	}
	private static boolean esPrimo(long numero, List<Integer> primos) {
		
		for (int i = 0; i < primos.size(); i++) {
			if (numero % primos.get(i).intValue() == 0) return false;
		}
		
		return true;
		
	}

}
