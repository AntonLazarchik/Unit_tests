package com.epam.cdp.tests.testng.unary;

import com.epam.cdp.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeNumber extends BaseTest {

  @Test(dataProvider = "dataForNegativeNumbers")
  public void numberIsNegative(long number, boolean expectedResult){
    boolean result = calculator.isNegative(number);
    Assert.assertEquals(expectedResult, result);
  }

  @DataProvider(name = "dataForNegativeNumbers")
  public Object[][] dataForNegativeNumbers(){
    return new Object[][]{
        {-9, true},
        {0, false},
        {-4, true},
        {8, false}
    };
  }
}

