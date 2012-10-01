/**
 * 
 */
package com.felipem.euler.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author felipem ( http://felipem.com )
 * Clase útil para trabajar con ficheros
 *
 */
public class Fichero {

	public static List<String> leeLineas(String fichero) {
		
		List<String> lineas = new ArrayList<String>();
		
		File archivo = null;
		FileReader fr = null;
	    BufferedReader br = null;

	    try {
	         archivo = new File (fichero);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	            lineas.add(linea);
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		return lineas;
	}
}
