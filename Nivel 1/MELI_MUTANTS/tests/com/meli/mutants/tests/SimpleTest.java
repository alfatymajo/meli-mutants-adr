package com.meli.mutants.tests;

import java.util.Random;
import java.util.Vector;

import com.meli.mutants.exceptions.InvalidDNAContentException;
import com.meli.mutants.exceptions.InvalidDNADimensionException;
import com.meli.mutants.home.ServiceHome;
import com.meli.mutants.localization.DNAMessages;
import com.meli.mutants.utils.DNAUtils;
import com.meli.mutants.utils.DNAValidations;

/**
 * Clase con el metodo Main para hacer las pruebas de varios casos de uso de a uno a la vez.
 * Cada vez que se ejecute, probara un caso de uso al azar.
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class SimpleTest {

	public static void main(String[] args) {
		
		//DNA No Mutante
		String[] dna = {"ATGCGA","CAGTGC","TTATTT","AGACGG","GCGTCA","TCACTG"};
		
		////DNA No Mutante V2
		String[] dnaTwo = {"ATGCGA","CAGTGC","TTATTT","AGACGG","TCGTCA","TCACTG"};
		
		//DNA Mutante
		String[] dnaM = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
		
		//DNA Mutante V2
		String[] dnaMTwo = {"ATGCGA","CAGTGC","GGGGGT","AGAAGG","CCCCTA","TCACTG"};
		
		//DNA Con caracteres invalidos
		String[] dnaInvChars 	= {"ATGCGF","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
		
		//DNA con Dimension invalida
		String[] dnaInvDim 		= {"ATGCG","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
		
		//DNA con Dimension invalida V2
		String[] dnaInvDimTwo 	= {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA"};
		
		Vector dnas = new Vector<>();
		/*0*/ dnas.add(dna);
		/*1*/ dnas.add(dnaTwo);
		/*2*/ dnas.add(dnaM);
		/*3*/ dnas.add(dnaMTwo);
		/*4*/ dnas.add(dnaInvChars);
		/*5*/ dnas.add(dnaInvDim);
		/*6*/ dnas.add(dnaInvDimTwo);
		
		Random rd = new Random();
		int vectorIndex = rd.nextInt(7);
		
		System.out.println(DNAMessages.DNA_MAIN_TEST_INDEX_MESSAGE + vectorIndex);
		
		
		String[] dnaToCheck  = (String[]) dnas.get(vectorIndex);
		
		try {

			DNAValidations.checkDnaFormat(dnaToCheck);

			boolean result = ServiceHome.isMutant(DNAUtils.DNAToUpperCase(dnaToCheck));

			if (result) {
				System.out.println(DNAMessages.DNA_MUTANT_MESSAGE);
			} else {
				System.out.println(DNAMessages.DNA_HUMAN_MESSAGE);
			}
		} catch (InvalidDNADimensionException e) {
			System.out.println(e.getMessage());
		} catch (InvalidDNAContentException e) {
			System.out.println(e.getMessage());
		}
		


	}

}
