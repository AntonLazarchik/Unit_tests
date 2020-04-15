package com.epam.cdp.tests.testng.basic;


import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.NaN;

public class SquareFunction extends BaseTest {

  @Test(dataProvider = "dataForSquare", groups = {"BasicFunctionsDouble"})
  public void square(double number, double expectedResult) {
    double result = calculator.sqrt(number);
    Assert.assertEquals(expectedResult, result, "Invalid result of square");
  }

  @DataProvider(name = "dataForSquare")
  public Object[][] dataForSquare() {
    return new Object[][]{
        {0, 0},
        {16, 4},
        {-4, NaN},
        {9.0, 3.0}
    };
  }
}