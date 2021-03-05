package FilterPrime;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

public class PrimeNumberTest {
	
	PrimeNumber p= new PrimeNumber();
	
	
	////calling generateList() method present in our main class
	List<Integer> randomList=p.generateList();
	
	
	//Method to check prime number
	public static boolean isPrime(int number) {
	    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}
	

	@Test
	public void test1() {	

	assert(!randomList.isEmpty());
	
		
	}
/////Negative test case because 45 is not prime number.
	@Test
	public void test2() {	

	assert(!isPrime(45));

	}
	
	
	
	@Test
	public void test3() {	

		assert(isPrime(11));

		}
	
	
	

	
}
