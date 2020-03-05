package com.meli.mutants.home;

import com.meli.mutants.utils.DNAUtils;

/**
 * Clase que contiene los metodos que usaran para los distintos servicios/apis.
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class ServiceHome {
	
	public static boolean isMutant(String[] dna){
		
		return (DNAUtils.processDNA(dna)> 1)? true:false;
	}

}
