package com.assignment.primenumberlist;

import java.util.List;
import java.util.logging.Logger;

public class GeneratePrimeNumbers {

  public static void main(String[] args) {

	Logger logger = Logger.getLogger(GeneratePrimeNumbers.class.getName());

	service obj = new service();
	List<Integer> randomNumbers = obj.generateRandomElements();
	List<Integer> result = obj.getListOfPrime(randomNumbers);
	logger.info(result.toString());
  }

}
