package com.epam.cdp.tests.testng.unary;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveNumber extends BaseTest {

  @Test(dataProvider = "dataForPositiveNumbers")
  public void numberIsPositive(long number, boolean expectedResult) {
    boolean result = calculator.isPositive(number);
    Assert.assertEquals(expectedResult, result);
  }

  @DataProvider(name = "dataForPositiveNumbers")
  public Object[][] dataForPositiveNumbers() {
    return new Object[][]{
        {9, true},
        {0, false},
        {7, true},
        {-14, false}
    };
  }
}