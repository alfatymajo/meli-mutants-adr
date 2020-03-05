package com.meli.mutants.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.meli.mutants.utils.DNAUtils;

public class DNAUtilsTest {

	@Test
	public void testCheckRowsNoMutantRow() {
		assertEquals(0,DNAUtils.checkRows(TestCaseValues.DNA_WITH_NO_MUTANT_ROW));

	}
	
	@Test
	public void testCheckRowsOneMutantRow() {
		assertEquals(1,DNAUtils.checkRows(TestCaseValues.DNA_WITH_ONE_MUTANT_ROW));
	}
	
	@Test
	public void testCheckRowsTwoMutantRow() {
		assertEquals(2,DNAUtils.checkRows(TestCaseValues.DNA_WITH_TWO_MUTANT_ROW));
	}
	
	@Test
	public void testCheckRowsMoreMutantRow() {
		assertEquals(2,DNAUtils.checkRows(TestCaseValues.DNA_WITH_MORE_MUTANT_ROW));
	}

	@Test
	public void testCheckColumnsNoMutantColumn() {
		assertEquals(0,DNAUtils.checkColumns(TestCaseValues.DNA_WITH_NO_MUTANT_COLUMN));
	}
	
	@Test
	public void testCheckColumnsOneMutantColumn() {
		assertEquals(1,DNAUtils.checkColumns(TestCaseValues.DNA_WITH_ONE_MUTANT_COLUMN));
	}
	
	@Test
	public void testCheckColumnsTwoMutantColumn() {
		assertEquals(2,DNAUtils.checkColumns(TestCaseValues.DNA_WITH_TWO_MUTANT_COLUMN));
	}
	
	@Test
	public void testCheckColumnsMoreMutantColumn() {
		assertEquals(2,DNAUtils.checkColumns(TestCaseValues.DNA_WITH_MORE_MUTANT_COLUMN));
	}

	@Test
	public void testCheckDiagonalMutant() {
		assertEquals(true,DNAUtils.checkDiagonal(TestCaseValues.DNA_MUTANT_DIAGONAL_ONE));
		assertEquals(true,DNAUtils.checkDiagonal(TestCaseValues.DNA_MUTANT_DIAGONAL_TWO));
		assertEquals(true,DNAUtils.checkDiagonal(TestCaseValues.DNA_MUTANT_DIAGONAL_THREE));
		assertEquals(true,DNAUtils.checkDiagonal(TestCaseValues.DNA_MUTANT_DIAGONAL_FOUR));

	}
	
	@Test
	public void testCheckDiagonalNoMutant() {
		assertEquals(false,DNAUtils.checkDiagonal(TestCaseValues.DNA_NO_MUTANT_DIAGONAL_ONE));
		assertEquals(false,DNAUtils.checkDiagonal(TestCaseValues.DNA_NO_MUTANT_DIAGONAL_TWO));
		assertEquals(false,DNAUtils.checkDiagonal(TestCaseValues.DNA_NO_MUTANT_DIAGONAL_THREE));
		assertEquals(false,DNAUtils.checkDiagonal(TestCaseValues.DNA_NO_MUTANT_DIAGONAL_FOUR));
	}

	@Test
	public void testCheckLineMutant() {
		assertEquals(true,DNAUtils.checkLine(TestCaseValues.DNA_MUTANT_LINE_ONE));
		assertEquals(true,DNAUtils.checkLine(TestCaseValues.DNA_MUTANT_LINE_TWO));
		assertEquals(true,DNAUtils.checkLine(TestCaseValues.DNA_MUTANT_LINE_THREE));
		assertEquals(true,DNAUtils.checkLine(TestCaseValues.DNA_MUTANT_LINE_FOUR));		
	}
	
	@Test
	public void testCheckLineNoMutant() {
		assertEquals(false,DNAUtils.checkLine(TestCaseValues.DNA_NO_MUTANT_LINE_ONE));
		assertEquals(false,DNAUtils.checkLine(TestCaseValues.DNA_NO_MUTANT_LINE_TWO));
		assertEquals(false,DNAUtils.checkLine(TestCaseValues.DNA_NO_MUTANT_LINE_THREE));
	}

	@Test
	public void testDNAToUpperCase() {
		
		String[] dnaExpectedOne = DNAUtils.DNAToUpperCase(TestCaseValues.DNA_WITH_LOWERCASE_CHARS_ONE);
		assertArrayEquals(TestCaseValues.DNA_WITH_LOWERCASE_CHARS_TO_UPPER_ONE,dnaExpectedOne);
		
		String[] dnaExpectedTwo = DNAUtils.DNAToUpperCase(TestCaseValues.DNA_WITH_LOWERCASE_CHARS_TWO);
		assertArrayEquals(TestCaseValues.DNA_WITH_LOWERCASE_CHARS_TO_UPPER_TWO,dnaExpectedTwo);
		
		String[] dnaExpectedThree = DNAUtils.DNAToUpperCase(TestCaseValues.DNA_WITH_LOWERCASE_CHARS_THREE);
		assertArrayEquals(TestCaseValues.DNA_WITH_LOWERCASE_CHARS_TO_UPPER_THREE,dnaExpectedThree);
	}

}
