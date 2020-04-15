package com.epam.cdp.tests.testng.basic;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionFunction extends BaseTest {
  String error = "Invalid result of division";

  @Test(dataProvider = "dataForDivision", groups = {"BasicFunctionsLong"})
  public void division(long firstNumber, long secondNumber, long expectedResult) {
    long result = calculator.div(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedResult, error);
  }

  @Test(dataProvider = "dataForDivisionException", expectedExceptions = NumberFormatException.class)
  public void divisionException(long firstNumber, long secondNumber, long expectedResult) {
    long result = calculator.div(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedResult, error);
  }

  @Test(dataProvider = "dataForDoubleDivision", groups = {"BasicFunctionsDouble"})
  public void divisionDouble(double firstNumber, double secondNumber, double expectedResult) {
    double result = calculator.div(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedResult, error);
  }

  @DataProvider(name = "dataForDivision")
  public Object[][] dataForDivision() {
    return new Object[][]{
        {1, 1, 1},
        {15, 3, 5},
        {8000000, 250, 32000},
        {10, 5, 2}
    };
  }

  @DataProvider(name = "dataForDoubleDivision")
  public Object[][] dataForDoubleDivision() {
    return new Object[][]{
        {13.0, 5.2, 2.5},
        {0.8, 0.2, 4},
        {0.2, 1.0, 0.2},
        {968.2, 0.5, 1936.4}
    };
  }

  @DataProvider(name = "dataForDivisionException")
  public Object[][] dataForDivisionException() {
    return new Object[][]{
        {50, 0, 10}
    };
  }
}