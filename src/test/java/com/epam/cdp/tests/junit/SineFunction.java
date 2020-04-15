package com.epam.cdp.tests.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SineFunction extends BaseTest {


  private double firstNumber;
  private double expectedResult;

  public SineFunction(double firstNumber, double expectedResult){
    this.firstNumber = firstNumber;
    this.expectedResult = expectedResult;
  }

  @Parameterized.Parameters
  public static Collection primeNumbers() {
    return Arrays.asList(new Object[][]{
        {3, 0.1411200080598672},
        {0, 0.0},
        {-1, -0.8414709848078965},
        {1, 0.8414709848078965}
    });
  }

  @Test
  public void sine() {
    double result = calculator.sin(firstNumber);
    Assert.assertEquals(result,expectedResult);
  }

}