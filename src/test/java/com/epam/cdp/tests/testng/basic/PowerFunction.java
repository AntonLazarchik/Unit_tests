package com.epam.cdp.tests.testng.basic;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowerFunction extends BaseTest {

  @Test(dataProvider = "dataForPowerTest", groups = {"BasicFunctionsDouble"})
  public void power(double number, double degree, double expectedResult) {
    double result = calculator.pow(number, degree);
    Assert.assertEquals(expectedResult, result, "Invalid result of power");

  }

  @DataProvider(name = "dataForPowerTest")
  public Object[][] dataForPowerTest() {
    return new Object[][]{
        {52, 3, 140608},
        {0, 0, 1},
        {-5, 3, -125},
        {4, 1.9, 13.92}
    };
  }


}