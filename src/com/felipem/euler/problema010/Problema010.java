/**
 * 
 */
package com.felipem.euler.problema010;

import java.util.Iterator;
import java.util.List;

import com.felipem.euler.math.Primo;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema010 {

	/**
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 * 
	 * La suma de los números primos por debajo de 10 es 2 + 3 + 5 + 7 = 17.
	 * Halla la suma de todos los primos por debajo de dos millones.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Primo primo = new Primo();
		primo.cargarPrimosHasta(2000000L);
		List<Long> primosConocidos = primo.getPrimosConocidos();
		
		Long suma = 0L;
		Iterator<Long> it = primosConocidos.iterator();
		while (it.hasNext()) {
			suma += it.next();
		}
		System.out.println(suma);
	}

}
