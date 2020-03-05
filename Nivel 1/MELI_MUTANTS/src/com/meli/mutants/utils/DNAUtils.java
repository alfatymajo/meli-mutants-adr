package com.meli.mutants.utils;

import com.meli.mutants.localization.DNAConstants;

/**
 * Clase con metodos utiles para tratar los DNA.
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class DNAUtils {
	
	
	/**
	 * Retorna true si tiene mas de una secuencia mutante en el DNA
	 * @param dna
	 * @return
	 */
	public static int processDNA(String[] dna){
		int result = 0;
		
		result += checkRows(dna);
		if (result > 1)
			return result;
		
		result += checkColumns(dna);
		if (result > 1)
			return result;
		
		result += (checkDiagonal(dna))?1:0;
		
		return result;
	}
	
	
	/**
	 * Busca en las filas si hay 0, 1 o 2 secuencias de base mutantes.
	 * */
	public static int checkRows(String[] dna){
		
		int result = 0;
		
		for (String item : dna) {
			result += checkLine(item)?1:0;
			if (result > 1){
				break;
			}
			else{
				continue;
			}
		}
		
		return result;
	}
	
	
	/**
	 * Busca en las columnas si hay 0, 1 o 2 secuencias de base mutantes.
	 * */
	public static int checkColumns(String[] dna){
		int result = 0;
		
		for (int i = 0; i < dna.length; i++) {
			String column = "";
			
			for (String item : dna) {
				column += item.charAt(i);
			}
			
			result += (checkLine(column))?1:0;
			
			if (result > 1){
				break;
			}
			else{
				continue;
			}
			
		}
		
		return result;
	}
	
	/**
	 * Extrae la linea oblicua del DNA y revisa si tiene una secuencia base mutante.
	 */
	public static boolean checkDiagonal(String[] dna){
		
		String diagonal = "";
		
		for (int i = 0; i < dna.length; i++) {
			
			diagonal += dna[i].charAt(i);
		}
		
		return checkLine(diagonal);
	}
	
	/**
	 * Revisa el string si tiene alguna de las 4 letras (A,T,C,G) en una secuencia de 4.
	 * @param String que representa una fila, columna o diagonal.
	 * @return
	 */
	public static boolean checkLine(String line){
		
		return (line.contains(DNAConstants.BASE_A) || line.contains(DNAConstants.BASE_T) || line.contains(DNAConstants.BASE_C) || line.contains(DNAConstants.BASE_G))?true:false;
	}
	
	/**
	 * Pasa a mayusculas todos los Strings del DNA.
	 * 
	 */
	public static String[] DNAToUpperCase(String[] dna){
		
		for (int i = 0; i < dna.length; i++) {
			
			dna[i] = dna[i].toUpperCase();
		}
		
		return dna;
	}

}
