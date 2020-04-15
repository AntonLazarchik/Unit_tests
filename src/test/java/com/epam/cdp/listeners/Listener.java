package com.epam.cdp.listeners;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Listener implements ITestListener {

  public void onTestStart(ITestResult result) {
    System.out.println("on Test Start: " + result.getName());
  }

  public void onTestSuccess(ITestResult result) {
    System.out.println("on Test Success: " + result.getName());
  }

  public void onTestFailure(ITestResult result){
    saveScreenshots();
  }

  public void onTestSkipped(ITestResult result) {
  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
  }

  public void onStart(ITestContext context) {
  }

  public void onFinish(ITestContext context)  {
  }

  private void log(String methodName) {
    System.out.println(methodName);
  }

  private void log(IClass testClass) {
    System.out.println(testClass);
  }

  public void saveScreenshots() {
    try {
      Date date = new Date();
      BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
      ImageIO.write(image, "png", new File(".//target/screenshots/" + date.getTime() + ".png"));
    } catch (AWTException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
