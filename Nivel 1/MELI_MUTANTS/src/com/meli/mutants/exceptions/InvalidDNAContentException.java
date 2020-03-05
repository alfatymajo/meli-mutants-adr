package com.meli.mutants.exceptions;

/**
 * Excepcion lanzada cuando el DNA que se envia contiene letras distintas de (A,T,C,G).
 * @author Alexis Rodriguez - DNI 35.094.185
 */
public class InvalidDNAContentException extends Exception {


	private static final long serialVersionUID = -5805805080826370118L;

	public InvalidDNAContentException(String message) {
		super(message);
	}
	
	
}
