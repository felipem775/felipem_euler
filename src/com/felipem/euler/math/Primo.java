/**
 * 
 */
package com.felipem.euler.math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author felipem ( http://felipem.com )
 * Clase útil para números primos
 */
public class Primo {
	
	/**
	 * Realizo un listado de números primos conocidos para validar un número
	 */
	private List<Long> primosConocidos = new ArrayList<Long>();
	
	/**
	 * @return the primosConocidos
	 */
	public List<Long> getPrimosConocidos() {
		return primosConocidos;
	}

	/**
	 * Añado los dos primeros números primos para optimizar un poco el proceso
	 */
	public Primo() {
		primosConocidos.add(2L);
		primosConocidos.add(3L);
	}
	
	/**
	 * Comprueba si un número es primo, para ello realiza comprobación básica y posteriormente mira todos los primos menores a ese número.
	 * @param numero
	 * @return
	 */
	public boolean esPrimo(long numero) {
		if (numero < 2 || numero % 2 == 0) {
			return false;
		}
		// Miro si es un número que puede que ya haya comprobado
		if (numero > primosConocidos.get(primosConocidos.size()-1)) {
			
			// Calculo hasta la raiz por optimizar
			long raiz = (long) Math.sqrt(numero) + 1;
			// Empiezo a mirar por el último primo
			for (long i = primosConocidos.get(primosConocidos.size()-1); i < raiz; i = i+2) {
				primoConocido(i);
			}
			
		}
		// Finalmente valido el último número
		return primoConocido(numero);
		
	}
	/**
	 * Compruebo si un número es primo utilizando la lista de los primos conocidos.
	 * @param numero
	 * @return
	 */
	private boolean primoConocido(long numero) {
		
		if (primosConocidos.contains(numero)) {
			return true;
		}
		Iterator<Long> it = primosConocidos.iterator();
		while (it.hasNext()) {
			long primoConocido = it.next();
			if (numero % primoConocido == 0) return false;
		}
		primosConocidos.add(numero);
		return true;
	}
}
