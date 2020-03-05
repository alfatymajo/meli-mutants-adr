package com.meli.mutants.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.meli.mutants.home.ServiceHome;

public class ServiceHomeTest {

	@Test
	public void testIsMutantTrue() {
		assertEquals(true,ServiceHome.isMutant(TestCaseValues.DNA_MUTANT_ONE));
		assertEquals(true,ServiceHome.isMutant(TestCaseValues.DNA_MUTANT_TWO));
		assertEquals(true,ServiceHome.isMutant(TestCaseValues.DNA_MUTANT_THREE));
		assertEquals(true,ServiceHome.isMutant(TestCaseValues.DNA_MUTANT_FOUR));
		assertEquals(true,ServiceHome.isMutant(TestCaseValues.DNA_MUTANT_FIVE));
		assertEquals(true,ServiceHome.isMutant(TestCaseValues.DNA_MUTANT_SIX));
		assertEquals(true,ServiceHome.isMutant(TestCaseValues.DNA_MUTANT_SEVEN));

		
	}
	
	@Test
	public void testIsMutantFalse() {
		assertEquals(false,ServiceHome.isMutant(TestCaseValues.DNA_HUMAN_ONE));
		assertEquals(false,ServiceHome.isMutant(TestCaseValues.DNA_HUMAN_TWO));
	}

}
