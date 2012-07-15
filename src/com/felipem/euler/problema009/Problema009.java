/**
 * 
 */
package com.felipem.euler.problema009;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema009 {

	/**
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	 * a² + b² = c²
	 * For example, 3² + 4² = 9 + 16 = 2² = 5².
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 * 
	 * Una terna pitagórica es un conjunto de tres números naturales, a < b < c, para el cual,
	 * a² + b² = c²
	 * Por ejemplo, 3² + 4² = 9 + 16 = 2² = 5².
	 * Existe una única terna pitagórica para la cual a + b + c = 1000.
	 * Halla el producto abc.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int a = 1; a < 999; a++) {
			for (int b = 1; b < 999; b++) {
				for (int c = 1; c < 999; c++) {
					
					if (a + b + c == 1000) {
						if (a*a+b*b==c*c) {
							System.out.println("a=" +a);
							System.out.println("b=" +b);
							System.out.println("c=" +c);
							System.out.println("producto="+a*b*c);
							return;
						}
					}
					
				}
			}
		}
	}

}
