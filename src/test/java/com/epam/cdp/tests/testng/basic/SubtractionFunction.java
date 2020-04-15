package com.epam.cdp.tests.testng.basic;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionFunction extends BaseTest {

  @Test(dataProvider = "valuesForDoubleSubtraction", groups = {"BasicFunctionsDouble"})
  public void subtractionDouble(double firstNumber, double secondNumber, double expectedValue) {
    double result = calculator.sub(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
  }

  @Test(dataProvider = "valuesForSubtraction", groups = {"BasicFunctionsLong"})
  public void subtraction(long firstNumber, long secondNumber, long expectedValue) {
    long result = calculator.sub(firstNumber, secondNumber);
    Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
  }

  @DataProvider(name = "valuesForSubtraction")
  public Object[][] valuesForSubtraction() {
    return new Object[][] {
        {-24, -2, -22},
        {10, 9, 1},
        {0, 0, 0},
        {-1, 0, -1}
    };
  }

  @DataProvider(name = "valuesForDoubleSubtraction")
  public static Object[][] dataForDoubleSubtraction() {
    return (new Object[][]{
        {7, -1, 8.0},
        {6, 2, 4.0},
        {15, 5, 10.0},
        {5, 7, -2.0}
    });
  }
}