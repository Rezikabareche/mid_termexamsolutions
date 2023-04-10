package math.problems;

import java.util.Scanner;

public class PrimeNumber {

	public  PrimeNumber( int maxNumber) {
		Scanner scanner = new Scanner( System.in );
		System.out.println("Enter max number: ");

		String input = scanner.nextLine();
		 maxNumber = Integer.parseInt(input);

		System.out.println("List of the prime number between 1 - " + maxNumber);

		for (int num = 2; num <= maxNumber; num++) {
			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime == true)
				System.out.println(num);

		}
	}

	public static void main(String[] args) {
      PrimeNumber max=new PrimeNumber(1000000);





		}
			}







