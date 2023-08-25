package com.altpaynet.sobre.appium;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SBRTC_AC_0003 extends Base {

    ExtentSparkReporter spark;
    ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        spark = new ExtentSparkReporter("leaveUsernameAndEmailEmptyLogin.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);

    }

    @AfterSuite
    public void reportTeardown() {
        extent.flush();
    }

    @Test(priority = 3)
    public void sobreLogin() throws MalformedURLException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            WebElement agree = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.id("com.nationlink.mobileapps.sobre:id/btn_agree")));

            if (agree.isDisplayed())

                agree.click();

        } catch (Exception e) {
            System.out.println("Agree button is not displayed");

        }

        try {
            WebElement login = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/btn_login")));

            if (login.isDisplayed())

                login.click();

        } catch (Exception e) {
            System.out.println("Hello " + e.toString());

        }

        try {
            WebElement usernameError = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.xpath(
                                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")));

            if (usernameError.isDisplayed())
                System.out.println("Username error validation message is displayed");
            extent.createTest("Check if username error message validation is displayed")
                    .log(Status.PASS, "Invalid login due to: " + usernameError.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Username error validation message is not displayed");
            extent.createTest("Check if username error message validation is not displayed")
                    .log(Status.FAIL, "Username error message validation is not displayed");
            extent.flush();
        }

        try {
            WebElement passwordError = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.xpath(
                                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")));

            if (passwordError.isDisplayed())
                System.out.println("Password error validation message is displayed");
            extent.createTest("Check if password error message validation is displayed")
                    .log(Status.PASS, "Invalid login due to: " + passwordError.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Password error validation message is not displayed");
            extent.createTest("Check if password error message validation is not displayed")
                    .log(Status.FAIL, "Password error message validation is not displayed");
            extent.flush();
        }

    }

}
