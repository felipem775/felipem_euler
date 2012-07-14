/**
 * 
 */
package com.felipem.euler.problem2;

/**
 * @author felipe
 *
 */
public class Problem2 {
	
	/**
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	 * 
	 * Cada nuevo término en la sucesión de Fibonacci es generado por la adición de los dos términos anteriores. Comenzando con 1 y 2, los 10 primeros términos serían:
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,...
	 * Considerando los términos de la sucesión de Fibonacci cuyos valores no superan los cuatro millones, halla la suma de los términos pares. 
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Inicilizo valores
		 */
		int limite = 4000001;
		
		int suma = 0;
		int anterior = 1;
		int i = 1;
		int aux = 0;
		
		while (i < limite) {
			aux = i;
			if (aux %2 ==0)suma += aux;
			i += anterior;
			anterior = aux;
		}
		System.out.println(suma);
	}
}
