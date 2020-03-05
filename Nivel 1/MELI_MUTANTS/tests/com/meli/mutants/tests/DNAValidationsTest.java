package com.meli.mutants.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.meli.mutants.exceptions.InvalidDNAContentException;
import com.meli.mutants.exceptions.InvalidDNADimensionException;
import com.meli.mutants.utils.DNAValidations;

public class DNAValidationsTest {

	@Test
	public void testCheckDnaFormatContentOne() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_CHARS_ONE);
			fail("Se esperaba InvalidDNAContentException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNAContentException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}

	}
	
	@Test
	public void testCheckDnaFormatContentTwo() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_CHARS_TWO);
			fail("Se esperaba InvalidDNAContentException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNAContentException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatContentThree() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_CHARS_THREE);
			fail("Se esperaba InvalidDNAContentException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNAContentException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatContentFour() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_CHARS_FOUR);
			fail("Se esperaba InvalidDNAContentException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNAContentException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatContentFive() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_CHARS_FIVE);
			fail("Se esperaba InvalidDNAContentException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNAContentException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatContentSix() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_CHARS_SIX);
			fail("Se esperaba InvalidDNAContentException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNAContentException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatDimensionOne() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_DIMENSION_ONE);
			fail("Se esperaba InvalidDNADimensionException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNADimensionException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatDimensionTwo() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_DIMENSION_TWO);
			fail("Se esperaba InvalidDNADimensionException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNADimensionException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatDimensionThree() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_DIMENSION_THREE);
			fail("Se esperaba InvalidDNADimensionException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNADimensionException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatDimensionFour() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_DIMENSION_FOUR);
			fail("Se esperaba InvalidDNADimensionException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNADimensionException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatDimensionFive() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_DIMENSION_FIVE);
			fail("Se esperaba InvalidDNADimensionException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNADimensionException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatDimensionSix() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_DIMENSION_SIX);
			fail("Se esperaba InvalidDNADimensionException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNADimensionException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatDimensionSeven() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_DIMENSION_SEVEN);
			fail("Se esperaba InvalidDNADimensionException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNADimensionException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDnaFormatDimensionEight() {
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_INVALID_DIMENSION_EIGHT);
			fail("Se esperaba InvalidDNADimensionException");
		} catch (Exception e) {
			if (e.getClass().equals(InvalidDNADimensionException.class)){
				assertTrue(true);
			}
			System.out.println(e.getClass()  + ": " + e.getMessage());
		}
	}
	
	@Test
	public void testCheckDNAFormatOk(){
		
		try {
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_MUTANT_ONE);
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_MUTANT_TWO);
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_MUTANT_THREE);
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_MUTANT_FOUR);
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_MUTANT_FIVE);
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_MUTANT_SIX);
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_MUTANT_SEVEN);
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_HUMAN_ONE);
			DNAValidations.checkDnaFormat(TestCaseValues.DNA_HUMAN_TWO);
			
			assertTrue(true);
			
		} catch (Exception e) {
			fail("No se esperaban Excepciones. \nTipo Excepcion: " + e.getClass() + "\nMensaje: " + e.getMessage() );
		}
		
	}

}
