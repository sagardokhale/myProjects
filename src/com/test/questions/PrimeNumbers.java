package com.test.questions;

class PrimeNumbers{

	public static void printPrimes(int number) {

		for (int i = 1; i <= number; i++) {
			int count = 0;
			for (int j = i; j > 1; j--) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 1) {
				System.out.print(i + " ");
			}

		}

	}

	public static void main(String[] args) {
		PrimeNumbers.printPrimes(10);

	}

}