package FilterPrime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String []args) {
		
	   PrimeNumber p= new PrimeNumber();
	
	   List<Integer> randomNumber=p.generateList();
	   
	   System.out.println(p.getPrime(randomNumber));
		
		
	}
	
	
	////This method will return list of random prime numbers
	public List<Integer> getPrime(List<Integer> randomList)
	
	{
		List<Integer> prime = randomList.stream().filter(k->isPrime(k)).collect(Collectors.toList());
		return prime;
	}
	
	////Method to check whether number is prime number or not.
	public static boolean isPrime(int number) {
		
		    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
		}
		
		
	
	////Method to generate list of random numbers between 1 to 999
		public static List<Integer> generateList()
		{

			Random random= new Random();
			
			List<Integer> randomList= new ArrayList<Integer>();
			
			for(int i=0;i<99;i++)
			{
				randomList.add(random.nextInt(1000));
			}
			
			return randomList;
		}
	
	
}








