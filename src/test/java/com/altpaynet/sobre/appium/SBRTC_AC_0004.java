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

public class SBRTC_AC_0004 extends Base {

    ExtentSparkReporter spark;
    ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        spark = new ExtentSparkReporter("InvalidUserCredentialsLogin.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);

    }

    @AfterSuite
    public void reportTeardown() {
        extent.flush();
    }

    @Test(priority = 4)
    public void sobreLogin() throws MalformedURLException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            WebElement agree = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.id("com.nationlink.mobileapps.sobre:id/btn_agree")));

            if (agree.isDisplayed())
                agree.click();

        } catch (Exception e) {
            System.out.println("Hello " + e.toString());

        }

        try {
            WebElement username = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/et_username")));

            if (username.isDisplayed())
                username.sendKeys("notvaliduser01");

        } catch (Exception e) {
            System.out.println("Hello " + e.toString());
        }

        try {
            WebElement password = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/et_password")));

            if (password.isDisplayed())
                password.sendKeys("notvalidpass01#$");

        } catch (Exception e) {
            System.out.println("Hello " + e.toString());

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
            WebElement loginError = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/txt_message")));

            if (loginError.isDisplayed())
                System.out.println("Login error validation message is displayed");
            extent.createTest("Check if login error validation message is displayed")
                    .log(Status.PASS, "Login error validation message is displayed: " + loginError.getText());
            extent.flush();
        } catch (Exception e) {

        }

    }

}
