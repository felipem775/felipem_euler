/**
 * 
 */
package com.felipem.euler.problema014;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema014 {

	/**
	 * The following iterative sequence is defined for the set of positive integers:
	 * n → n/2 (n is even)
	 * n → 3n + 1 (n is odd)
	 * 
	 * Using the rule above and starting with 13, we generate the following sequence:
	 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	 * 
	 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	 * Which starting number, under one million, produces the longest chain?
	 * 
	 * NOTE: Once the chain starts the terms are allowed to go above one million.
	 * 
	 * La siguiente secuencia iterativa es definida para el conjunto de enteros positivos:
	 * n → n/2 (si n es par)
	 * n → 3n + 1 (si n es impar)
	 * 
	 * Usando la regla anterior y comenzando con 13, generamos la siguiente secuencia:
	 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	 * 
	 * Se puede observar que esta secuencia (comenzando en 13 y terminando en 1) contiene 10 términos. Aunque aún no ha sido probado (Conjetura de Collatz), se cree que cualquier número inicial acaba en 1.
	 * ¿Qué número inicial, inferior a un millón, produce la cadena más larga?
	 * 
	 * NOTA: Una vez que la cadena comienza, los siguientes términos pueden superar el millón.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		long numeroBuscado = 0;
		int numeroTerminos = 0;
		
		for (long i = 2; i < 1000000; i++) {
			
			int iteraciones = calcularTerminos(i);
			if (iteraciones > numeroTerminos) {
				numeroTerminos = iteraciones;
				numeroBuscado = i;
//				System.out.println(numeroBuscado + " " + numeroTerminos);
			}
		}
		System.out.println(numeroBuscado + " " + numeroTerminos);
	}

	/**
	 * Calcula las iteraciones.
	 * IMPORTANTE i tipo long, como integer falla
	 * @param i 
	 * @return
	 */
	private static int calcularTerminos(long i) {
		int iteracion = 1;
		while (i > 1) {
			if (i % 2 == 0) {
				i = i / 2;
			}
			else {
				i = i * 3 + 1;
			}
			iteracion++;
		}
		return iteracion;
	}

}
