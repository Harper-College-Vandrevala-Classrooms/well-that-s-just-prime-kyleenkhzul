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
  public void testOne() {
    assertEquals(Arrays.asList(2,2,3), factorizer.primeFactors(12));
  }

  @Test
  public void testTwo() {
    assertEquals(Arrays.asList(5,7), factorizer.primeFactors(35));
  }

  @Test
  public void testThree() {
    assertEquals(Arrays.asList(2, 2, 2, 2, 3), factorizer.primeFactors(48));
  }

  @Test
  public void testFour() {
    assertEquals(Arrays.asList(13), factorizer.primeFactors(13));
  }

  // Large number case
  @Test
  public void testFive() {
    assertEquals(Arrays.asList(2, 3, 5, 7), factorizer.primeFactors(210));
  }

  // Number 1 case
  @Test
  public void testSix() {
    assertEquals(Arrays.asList(), factorizer.primeFactors(1));
  }

  // Negative number case
  @Test
  public void testSeven() {
    assertEquals(Arrays.asList(), factorizer.primeFactors(-10));
  }
}
