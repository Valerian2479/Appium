package com.altpaynet.sobre.appium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportBase {

    ExtentSparkReporter spark;
    ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        spark = new ExtentSparkReporter("Spark.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);

    }

    @AfterSuite
    public void reportTeardown() {
        extent.flush();
    }

}
