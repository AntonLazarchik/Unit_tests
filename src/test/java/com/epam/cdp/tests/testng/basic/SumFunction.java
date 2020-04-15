package com.epam.cdp.tests.testng.basic;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumFunction extends BaseTest {

  @Test(dataProvider = "valuesForSum", groups = {"BasicFunctionsLong"})
  public void sum(long firstNumber, long secondNumber, long expectedValue){
    long result = calculator.sum(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
  }

  @Test(dataProvider = "valuesForSumDouble", groups = {"BasicFunctionsDouble"})
  public void sumDouble(double a, double b, double expectedValue) {
    double result = calculator.sum(a, b);
    Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
  }

  @DataProvider(name = "valuesForSum")
  public Object[][] valuesForSum() {
    return new Object[][] {
        {10, 23, 33},
        {10, -1, 9},
        {0, 0, 0},
        {-1, 10, 9}
    };
  }

  @DataProvider(name = "valuesForSumDouble")
  public Object[][] valuesForSumDouble() {
    return new Object[][] {
        {10.5, 23.5, 34},
        {10.0, -1.0, 9.0},
        {0, 0, 0},
        {-1.0, -10.0, -11.0}
    };
  }
}