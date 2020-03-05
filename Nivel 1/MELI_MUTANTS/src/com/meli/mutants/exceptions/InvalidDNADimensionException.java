package com.meli.mutants.exceptions;

/**
 * Excepcion lanzada cuando el DNA que se envia no contiene la dimension correcta.
 * La dimension correcta es cuando el largo de todos los Strings contenidos en el
 * array sea igual en cada caso a la cantidad total de Strings (Matriz NxN). 
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class InvalidDNADimensionException extends Exception {


	private static final long serialVersionUID = 2222231966774717397L;
	
	public InvalidDNADimensionException(String message){
		super(message);
	}

}
