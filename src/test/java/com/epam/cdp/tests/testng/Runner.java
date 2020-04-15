package com.epam.cdp.tests.testng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.epam.cdp.listeners.Listener;

public class Runner {

  public static void main(String[] args) {
    TestNG testNg = new TestNG();
    new Listener();

    XmlSuite suite = new XmlSuite();
    suite.setSuiteFiles(Collections.singletonList("./src/test/resources/testng.xml"));

    suite.setParallel(XmlSuite.ParallelMode.METHODS);
    suite.setThreadCount(2);

    List<XmlSuite> suites = new ArrayList<XmlSuite>();
    suites.add(suite);

    testNg.setXmlSuites(suites);
    testNg.run();
  }
}