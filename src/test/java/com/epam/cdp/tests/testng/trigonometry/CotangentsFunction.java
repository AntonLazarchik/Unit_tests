package com.epam.cdp.tests.testng.trigonometry;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.NaN;

public class CotangentsFunction extends BaseTest {

  @Test(dataProvider = "dataForCotangent", groups = {"trigonometry"})
  public void cotangent(double number, double expectedResult) {
    double result = calculator.ctg(number);
    Assert.assertEquals(expectedResult, result,"Invalid result of cotangent");
  }

  @DataProvider(name = "dataForCotangent")
  public Object[][] dataForCotangent() {
    return new Object[][]{
        {0, NaN},
        {7, 1.1475},
        {1, 0.6421},
        {-1, -0.64209262}
    };
  }

}


