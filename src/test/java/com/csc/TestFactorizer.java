package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  @Test
  public void testNumber12() {
    assertEquals(Arrays.asList(2,2,3), factorizer.primeFactors(12));
  }

  @Test
  public void testNumber35() {
    assertEquals(Arrays.asList(5,7), factorizer.primeFactors(35));
  }

  @Test
  public void testNumber48() {
    assertEquals(Arrays.asList(2, 2, 2, 2, 3), factorizer.primeFactors(48));
  }

  @Test
  public void testNumber13() {
    assertEquals(Arrays.asList(13), factorizer.primeFactors(13));
  }

  // Large number case
  @Test
  public void testLargeNumber() {
    assertEquals(Arrays.asList(2, 3, 5, 7), factorizer.primeFactors(210));
  }

  // Number 1 case
  @Test
  public void testSmallNumber() {
    assertEquals(Arrays.asList(), factorizer.primeFactors(1));
  }

  // Portfolio Add-On, isPrime tests
  @Test
  public void testIfNumber36IsPrime() {
    assertEquals(false, factorizer.isPrime(36));
  }

  @Test
  public void testIfNumber12IsPrime() {
    assertEquals(false, factorizer.isPrime(12));
  }

  @Test
  public void testIfNumber17IsPrime() {
    assertEquals(true, factorizer.isPrime(17));
  }

  @Test
  public void testIfNumber1IsPrime() {
    assertEquals(false, factorizer.isPrime(1));
  }

  @Test
  public void testIfNumber0IsPrime() {
    assertEquals(false, factorizer.isPrime(0));
  }
}
