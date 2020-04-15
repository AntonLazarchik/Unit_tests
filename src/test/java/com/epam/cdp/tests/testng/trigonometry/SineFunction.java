package com.epam.cdp.tests.testng.trigonometry;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SineFunction extends BaseTest {

  @Test(dataProvider = "dataForSine", groups = {"trigonometry"})
  public void sine(double number, double expectedResult) {
    double result = calculator.sin(number);
    Assert.assertEquals(expectedResult, result, "Invalid result of sinus");

  }

  @DataProvider(name = "dataForSine")
  public Object[][] dataForSinus() {
    return new Object[][]{
        {3, 0.1411200080598672},
        {0, 0.0},
        {-1, -0.8414709848078965},
        {1, 0.8414709848078965}
    };
  }
}