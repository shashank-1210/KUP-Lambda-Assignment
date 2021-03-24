package com.assignment.primenumberlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class service {

  public List<Integer> generateRandomElements() {

	Random random = new Random();
	List<Integer> randomList = new ArrayList<>();

	for (int counter = 0; counter < 99; counter++) {
	  randomList.add(random.nextInt(1000));
	}
	return randomList;
  }

  public boolean isNumberPrime(int number) {

	return IntStream
		.rangeClosed(2, number / 2)
		.noneMatch(counter -> number % counter == 0);
  }

  public List<Integer> getListOfPrime(List<Integer> randomList) {
	return randomList
		.stream()
		.filter(this::isNumberPrime)
		.collect(Collectors.toList());

  }

}
