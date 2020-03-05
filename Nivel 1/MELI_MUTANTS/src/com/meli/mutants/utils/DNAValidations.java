package com.meli.mutants.utils;

import com.meli.mutants.exceptions.InvalidDNAContentException;
import com.meli.mutants.exceptions.InvalidDNADimensionException;
import com.meli.mutants.localization.DNAConstants;
import com.meli.mutants.localization.DNAMessages;


/**
 * Clase con los metodos necesarios para validar que los DNA enviados sean correctos
 * para ser procesados por la aplicacion.
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class DNAValidations {
	
	/**
	 * Metodo para revisar que el dna proximo a consultar tenga la dimension correcta
	 * y no contenga bases nitrogenadas incorrectas, es decir que no contenga alguna base
	 * distinta de A,T,C o G.
	 * @param dna
	 * @throws InvalidDNADimensionException
	 * @throws InvalidDNAContentException
	 */
	public static void checkDnaFormat(String[] dna) throws InvalidDNADimensionException, InvalidDNAContentException{
		
		int dnaSize = dna.length;
		
		for (String row : dna) {
			int rowSize = row.length();
			
			if (rowSize != dnaSize){
				throw new InvalidDNADimensionException(DNAMessages.INVALID_DNA_DIMENSION_ERROR_MESSAGE);
			}
			
			
			for (int i = 0; i < row.length(); i++) {
				
				String letter = Character.toString(row.charAt(i)) ;
				
				if (DNAConstants.VALID_LETTERS.contains(letter)){
					continue;					
				}
				else{
					throw new InvalidDNAContentException(DNAMessages.INVALID_DNA_CONTENT_ERROR_MESSAGE);
				}
				
			}
			
		}
		
		
		
	}

}
