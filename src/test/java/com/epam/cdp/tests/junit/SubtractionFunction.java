package com.epam.cdp.tests.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubtractionFunction extends BaseTest {

  private long firstNumber;
  private long secondNumber;
  private long expectedResult;

  public SubtractionFunction(long firstNumber, long secondNumber, long expectedResult) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.expectedResult = expectedResult;
  }

  @Parameterized.Parameters
  public static Collection primeNumbers() {
    return Arrays.asList(new Object[][]{
        {10, -1, 11},
        {0, 0, 0},
        {-1, 10, -11}
    });
  }

  @Test
  public void subtraction() {
    long result = calculator.sum(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedResult);
  }
}