package com.epam.cdp.tests.testng.basic;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationFunction extends BaseTest {

  @Test(dataProvider = "dataForDoubleMultiplication", groups = {"BasicFunctionsDouble"})
  public void multiplicationDouble(double firstNumber, double secondNumber,double expectedResult) {
    double result = calculator.mult(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedResult, "Invalid result of multiplication");
  }

  @Test(dataProvider = "dataForMultiplication", groups = {"BasicFunctionsLong"})
  public void multiplication(long firstNumber, long secondNumber, long expectedResult) {
    long result = calculator.mult(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedResult,"Invalid result of multiplication");
  }

  @DataProvider(name = "dataForDoubleMultiplication")
  public Object[][] dataForDoubleMultiplication() {
    return new Object[][]{
        {4.3, 3.5, 15.05},
        {5.0, 7.0, 35.0},
        {18, 4, 72},
        {17.31, 14.7, 254.457},
    };
  }

  @DataProvider(name = "dataForMultiplication")
  public Object[][] dataForMultiplicationTest() {
    return new Object[][]{
        {5, 7, 35},
        {4, 3, 12},
        {18, 4, 72},
        {1, 0, 0},
    };
  }


}