package com.csc;
import java.util.ArrayList;
import java.util.List;
public class Factorizer {

  /*
   * This method is intended to take a positive int as a parameter and calculates
   * all of the prime number factors of it.
   * @param number
   * @return list of prime num factors 
   */

  public List<Integer> primeFactors(int number) {
    List<Integer> factors = new ArrayList<>();

    // Factors out all 2's using modulo division
    while(number % 2 == 0) {
      factors.add(2);
      number /= 2;
    }

    // Factors out all odds using modulo division
    for(int i = 3; i <= Math.sqrt(number); i+=2) {
      while(number % i == 0) {
        factors.add(i);
        number /= i;
      }
    }

    // If the number is greater than 2, then it is a final prime factor.
    if(number > 2) {
      factors.add(number);
    }

    return factors;
  }

  public boolean isPrime(int number) {
    int initial = number;
    
    // Check for number less than or equal to 1
    if(number <=1) {
      return false;
    }

    // Factors out all 2's using modulo division
    while(number % 2 == 0) {
      number /= 2;
    }

    // Factors out all odds using modulo division
    for(int i = 3; i <= Math.sqrt(number); i+=2) {
      while(number % i == 0) {
        number /= i;
      }
    }
    
    return initial == number;
  }

  public boolean isComposite(int number) {
    if(number != 1 && number != 0 && !isPrime(number)) {
      return true;
    }
    else {
      return false;
    }
  }
}
