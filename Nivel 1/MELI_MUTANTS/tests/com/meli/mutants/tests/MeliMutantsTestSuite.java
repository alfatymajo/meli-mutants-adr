package com.meli.mutants.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * Test suite para correr todos los Test Case del proyecto.
 * @author Alexis Rodriguez - DNI 35.094.185
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ DNAUtilsTest.class, DNAValidationsTest.class, ServiceHomeTest.class })
public class MeliMutantsTestSuite {

}
