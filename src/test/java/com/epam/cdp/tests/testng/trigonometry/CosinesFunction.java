package com.epam.cdp.tests.testng.trigonometry;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

  public class CosinesFunction extends BaseTest {

    @Test(dataProvider = "dataForCosines", groups = {"trigonometry"})
    public void cosines(double number, double expectedResult) {
      double result = calculator.cos(number);
      Assert.assertEquals(expectedResult, result, "Invalid result of cosines");
    }

    @DataProvider(name = "dataForCosines")
    public Object[][] dataForCosines() {
      return new Object[][]{
          {24, 0.42417901},
          {17, -0.27516334},
          {3, -0.9899925},
          {1, 0.54030231}
      };
    }

  }