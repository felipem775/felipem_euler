/**
 * 
 */
package com.felipem.euler.problema022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.felipem.euler.file.Fichero;


/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema22 {

	/**
	 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
	 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
	 * What is the total of all the name scores in the file?
	 * 
	 * Descarga names.txt (clic derecho y 'Guardar enlace/destino como...'), un archivo de texto de 46 KB que contiene más de cinco mil nombres y empieza por ordenarlos alfabéticamente. A continuación, halla el valor alfabético para cada nombre y multiplica este valor por su posición en orden alfabético en la lista para obtener la puntuación del nombre.
	 * Por ejemplo, cuando la lista está ordenada alfabéticamente, COLIN, que es de valor 3 + 15 + 12 + 9 + 14 = 53, es el 938º nombre en la lista. Así que COLIN obtendría una puntuación de 938 x 53 = 49714.
	 * ¿Cuál es el suma de las puntuaciones de cada nombre en el archivo?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String lineaNombres = Fichero.leeLineas("src/com/felipem/euler/problema022/names.txt").get(0);
		
		// Parcheamos el string para cargar el listado de nombres
		String[] nombresTmp = lineaNombres.split("\"");
		List<String> nombres = new ArrayList<String>();
		for (String string : nombresTmp) {
			if (string.length() > 1) {
				nombres.add(string);
			}
		}
		
		// Ordenamos alfabéticamente
		Collections.sort(nombres);
		
		long total = 0;
		for (int i = 0; i < nombres.size(); i++) {
			total += (i + 1) * valorNombre(nombres.get(i));
		}
		
		System.out.println(total);
		
	}
	
	/**
	 * Calculamos el valor para un nombre.
	 * Todos los nombres van en mayúsculas y se ajustan al diccionario inglés, por lo que el valor ascii de las letras es consecutivo.
	 * @param nombre
	 * @return
	 */
	private static int valorNombre(String nombre) {
		int valor = 0;
		char[] tmp = nombre.toCharArray();
		for (int i = 0; i < nombre.length(); i++) {
			valor += (tmp[i] - 64);
		}
		return valor;	
	}

}
