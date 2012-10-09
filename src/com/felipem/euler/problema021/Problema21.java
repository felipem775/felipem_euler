/**
 * 
 */
package com.felipem.euler.problema021;

import java.util.ArrayList;
import java.util.List;

import com.felipem.euler.math.Primo;



/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema21 {

	/**
	 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
	 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
	 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
	 * Evaluate the sum of all the amicable numbers under 10000.
	 * 
	 * Sea d(n) la suma de los divisores de n (números menores que n que dividen exactamente a n).
	 * Si d(a) = b y d(b) = a, donde a ≠ b, entonces a y b son una pareja de números amigos.
	 * Por ejemplo, los divisores de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, por lo tanto d(220) = 284. Los divisores de 284 son 1, 2, 4, 71 y 142; de modo que d(284) = 220.
	 * Calcula la suma de todos los números amigos inferiores a 10000.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] calculo = new int[10000];
		List<Integer> amigos = new ArrayList<Integer>();
		
		for (int i = 0; i < calculo.length; i++) {
			int suma = sumaListaNumeros(divisores(i)) - i;
			calculo[i] = suma;
			if (calculo[i] < i && calculo[suma] == i) {
				amigos.add(calculo[i]);
				amigos.add(i);
			}
		}
		System.out.println(sumaListaNumeros(amigos));
	}
	
	/**
	 * Suma los números de una lista de integers
	 * @param numeros
	 * @return
	 */
	private static Integer sumaListaNumeros(List<Integer> numeros) {
		int suma = 0;
		for (Integer numero : numeros) {
			suma += numero;
		}
		return suma;
	}
	
	/**
	 * Calcula todos los divisores de un número
	 * @param numero
	 * @return
	 */
	private static List<Integer> divisores(Integer numero) {
		List<Integer> divisores = new ArrayList<Integer>();
		
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				divisores.add(i);
			}
		}
		divisores.add(numero);
		return divisores;
	}
	/*private static List<Integer> divisores(Integer numero) {
		Primo primo = new Primo();
		List<Integer> divisores = new ArrayList<Integer>();
		divisores.add(1);
		divisores.add(numero);
		int i = 2;
		while (i <= numero) {
			if (numero % i == 0) {
				numero = numero / i;
				divisores.add(i);
				i = 2;
			}
			else {
				i++;
			}
		}
		
		return divisores;
	}*/
}
