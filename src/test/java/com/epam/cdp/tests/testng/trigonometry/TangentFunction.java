package com.epam.cdp.tests.testng.trigonometry;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentFunction extends BaseTest {

  @Test(dataProvider = "dataForTangent", groups = {"trigonometry"})
  public void tangent(double number, double expectedResult) {
    double result = calculator.tg(number);
    Assert.assertEquals(expectedResult, result, "Invalid result of tangents");
    checkTime();
  }

  @DataProvider(name = "dataForTangent")
  public Object[][] dataForTangent() {
    return new Object[][]{
        {0, 0.0},
        {7, 0.87144798},
        {1, 1.55740772},
        {-1, -1.55740772}
    };
  }
}
