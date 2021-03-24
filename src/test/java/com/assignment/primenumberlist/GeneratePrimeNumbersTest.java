package com.assignment.primenumberlist;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class GeneratePrimeNumbersTest {

  service test = new service();
  List<Integer> randomNumbers = test.generateRandomElements();
  List<Integer> testList = Arrays.asList(4, 5, 3, 56, 21, 90, 567);
  List<Integer> primeNumbers = test.getListOfPrime(testList);

  @Test
  public void testShouldReturnArrayListWhen_generateRandomElements_IsInvoked() {
	assertNotNull(randomNumbers);
  }

  @Test
  public void testShouldReturnTrueWhen_isNumberPrime_IsInvoked() {
	assertTrue(test.isNumberPrime(5));
  }

  @Test
  public void testShouldReturnFalseWhen_isNumberPrime_IsInvoked() {
	assertFalse(test.isNumberPrime(6));
  }

  @Test
  public void testShouldPass_primeNumbers_contain2PrimeNumbers() {
	assertEquals(2, primeNumbers.size());
  }

  @Test
  public void testShouldPass_primeNumbers_contain5and3() {
	assertEquals(Arrays.asList(5, 3), primeNumbers);
  }

}