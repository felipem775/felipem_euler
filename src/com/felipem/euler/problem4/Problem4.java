/**
 * 
 */
package com.felipem.euler.problem4;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problem4 {

	/**
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * 
	 * Un número capicúa se lee igual en ambos sentidos. El mayor capicúa formado por el producto de dos números de 2 dígitos es 9009 = 91 x 99.
	 * Halla el mayor capicúa formado por el producto de dos números de 3 dígitos.
	 * @param args
	 */
	public static void main(String[] args) {
		int mayor = 0;
		for (int a = 999; a > 99; a--) {
			for (int b = 999; b >99; b--) {
				int producto = a * b;
				String sProducto = new Integer(producto).toString();
				if (esPalindromo(producto)) {
					if (producto > mayor) {
						mayor = producto;
					}
					
					
				}
			}
		}
		System.out.println(mayor);
		
	}
	
	/*
	 * Comparo el string con su reverso utilizando el método reverse de StringBuffer
	 */
	private static boolean esPalindromo(int n) {
		if (new Integer(n).toString().equals(new StringBuffer(new Integer(n).toString()).reverse().toString())) {
			return true;
		}
		return false;
		
	}

}
