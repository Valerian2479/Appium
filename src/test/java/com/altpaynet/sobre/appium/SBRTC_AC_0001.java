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

public class SBRTC_AC_0001 extends Base {

        ExtentSparkReporter spark;
        ExtentReports extent;

        @BeforeSuite
        public void reportSetup() {
                spark = new ExtentSparkReporter("SuccessfulLogin.html");
                extent = new ExtentReports();
                extent.attachReporter(spark);

        }

        @AfterSuite
        public void reportTeardown() {
                extent.flush();
        }

        @Test(priority = 1)
        public void sobreLogin() throws MalformedURLException {

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                try {
                        WebElement agree = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/btn_agree")));

                        if (agree.isDisplayed())
                                System.out.println("Agree button is displayed");
                        extent.createTest("Check if Privacy Policy and Terms & Conditions are displayed")
                                        .log(Status.PASS, "Privacy Policy and Terms & Conditions are displayed");
                        extent.flush();
                        agree.click();

                } catch (Exception e) {
                        System.out.println("Agree button is not displayed");
                        extent.createTest("Check if Privacy Policy and Terms & Conditions are not displayed")
                                        .log(Status.FAIL, "Privacy Policy and Terms & Conditions are not displayed");
                        extent.flush();

                }

                // try {
                // WebElement privacyPolicy = wait
                // .until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator(
                // "new UiScrollable(new
                // UiSelector().scrollable(true).instance(0)).scrollIntoView(new
                // UiSelector().text(\"Privacy Policy\").instance(0))")));

                // if (privacyPolicy.isDisplayed())
                // privacyPolicy.click();

                // } catch (Exception e) {
                // System.out.println("Hello" + e.toString());
                // }

                try {
                        WebElement username = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/et_username")));

                        if (username.isDisplayed())
                                extent.createTest("Check if username is displayed and able enter username")
                                                .log(Status.PASS, "Username is displayed, able to enter username");
                        extent.flush();
                        username.sendKeys("yul.yarden");

                } catch (Exception e) {
                        System.out.println("Username is not displayed");
                        extent.createTest("Check if username is not displayed and unable to enter username")
                                        .log(Status.FAIL, "Username is not displayed, unable to enter username");
                        extent.flush();
                }

                try {
                        WebElement password = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/et_password")));

                        if (password.isDisplayed())
                                System.out.println("Password is displayed");
                        extent.createTest("Check if password is displayed and able to enter password")
                                        .log(Status.PASS, "Password is displayed, able to enter password");
                        extent.flush();
                        password.sendKeys("Qwertyad356#$");

                } catch (Exception e) {
                        System.out.println("Password is not displayed");
                        extent.createTest("Check if password is not displayed and unable to enter password")
                                        .log(Status.FAIL, "Username is not displayed, unable to enter password");
                        extent.flush();
                }

                try {
                        WebElement register = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/btn_register")));

                        if (register.isDisplayed())
                                System.out.println("Register button is displayed");
                        extent.createTest("Check if register button is displayed")
                                        .log(Status.PASS, "Register button is displayed");
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Register button is not displayed");
                        extent.createTest("Check if register button is not displayed")
                                        .log(Status.FAIL, "Register button is not displayed");
                        extent.flush();
                }

                try {
                        WebElement forgotPassword = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(By
                                                        .id("com.nationlink.mobileapps.sobre:id/txt_forgot_password")));

                        if (forgotPassword.isDisplayed())
                                System.out.println("Forgot password and Forgot username link is displayed");
                        extent.createTest("Check if forgot password and forgot username link is displayed")
                                        .log(Status.PASS, "forgot password and forgot username link is displayed");
                        extent.flush();
                } catch (Exception e) {
                        System.out.println("Forgot password and Forgot username link is not displayed");
                        extent.createTest("Check if forgot password and forgot username link is not displayed")
                                        .log(Status.FAIL, "forgot password and forgot username link is not displayed");
                }

                try {
                        WebElement login = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/btn_login")));

                        if (login.isDisplayed())
                                System.out.println("Login button is displayed");
                        extent.createTest("Check if login is displayed and functional")
                                        .log(Status.PASS, "Username is displayed, able to click login");
                        extent.flush();
                        login.click();

                } catch (Exception e) {
                        System.out.println("Login button is not displayed");
                        extent.createTest("Check if login is not displayed")
                                        .log(Status.FAIL, "Login button is not displayed");
                        extent.flush();
                }

                try {
                        WebElement infographics = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(By.xpath(
                                                        "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView")));

                        if (infographics.isDisplayed())
                                System.out.println("Infographics is displayed");
                        extent.createTest("Check if infographics is displayed")
                                        .log(Status.PASS, "Infographics is displayed");
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Infographics button is not displayed");
                        extent.createTest("Check if infographics is not displayed")
                                        .log(Status.FAIL, "Infographics is not displayed");
                        extent.flush();
                }

                try {
                        WebElement infoAgree = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/btn_next")));

                        if (infoAgree.isDisplayed())
                                System.out.println("Agree button is displayed");
                        extent.createTest("Check if agree button is displayed")
                                        .log(Status.PASS, "Agree button is displayed");
                        extent.flush();
                        infoAgree.click();

                } catch (Exception e) {
                        System.out.println("Agree button is not displayed");
                        extent.createTest("Check if agree button is not displayed")
                                        .log(Status.FAIL, "Agree button is not displayed");
                        extent.flush();
                }

                try {
                        WebElement card = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/tv_card_number")));

                        if (card.isDisplayed())
                                System.out.print(card.getText());
                        extent.createTest("Check if main card is displayed")
                                        .log(Status.PASS, "Main card is:" + card.getText());
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Main card is not displayed");
                        extent.createTest("Check if main card is not displayed")
                                        .log(Status.FAIL, "Main card is not displayed");
                        extent.flush();
                }

                try {
                        WebElement balance = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/tv_balance")));

                        if (balance.isDisplayed())
                                System.out.print(driver
                                                .findElement(By.id("com.nationlink.mobileapps.sobre:id/tv_balance"))
                                                .getText());
                        extent.createTest("Check if balance is displayed")
                                        .log(Status.PASS, "Balance is:" + balance.getText());
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Balance is not displayed");
                        extent.createTest("Check if balance is not displayed")
                                        .log(Status.FAIL, "Balance is not displayed");
                        extent.flush();

                }

                try {
                        WebElement viewAccount = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(
                                                        By.id("com.nationlink.mobileapps.sobre:id/tv_view_account")));

                        if (viewAccount.isDisplayed())
                                System.out.print(viewAccount.getText());
                        extent.createTest("Check if view account is displayed")
                                        .log(Status.PASS, "View account is:" + viewAccount.getText());
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("View account is not displayed");
                        extent.createTest("Check if view account is not displayed")
                                        .log(Status.FAIL, "View account is not displayed");
                        extent.flush();
                }

                try {
                        WebElement cashIn = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(By.xpath(
                                                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));

                        if (cashIn.isDisplayed())
                                System.out.print(cashIn.getText().contains("Cash In"));
                        extent.createTest("Check if cash in is displayed")
                                        .log(Status.PASS, "Cash in is displayed:" + cashIn.getText());
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Cash in is not displayed");
                        extent.createTest("Check if cash in is not displayed")
                                        .log(Status.FAIL, "Cash in is not displayed");
                        extent.flush();
                }

                try {
                        WebElement sendMoney = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(By.xpath(
                                                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")));

                        if (sendMoney.isDisplayed())
                                System.out.print(sendMoney.getText().contains("Send Money"));
                        extent.createTest("Check if send money is displayed")
                                        .log(Status.PASS, "Send money is displayed:" + sendMoney.getText());
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Check if send money is not displayed");
                        extent.createTest("Check if send money is not displayed")
                                        .log(Status.FAIL, "Send money is not displayed");
                        extent.flush();
                }

                try {
                        WebElement billsPayment = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(By.xpath(
                                                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView")));
                        if (billsPayment.isDisplayed())
                                System.out.print(billsPayment.getText().contains("Bills Payment"));
                        extent.createTest("Check if bills payment is displayed")
                                        .log(Status.PASS, "Bills payment is displayed: " + billsPayment.getText());
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Check if bills payment is not displayed");
                        extent.createTest("Check if bills payment is not displayed")
                                        .log(Status.FAIL, "Bills payment is not displayed");
                        extent.flush();
                }

                try {
                        WebElement topUp = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(By.xpath(
                                                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView")));

                        if (topUp.isDisplayed())
                                System.out.print(topUp.getText().contains("Top Up"));
                        extent.createTest("Check if top up is displayed")
                                        .log(Status.PASS, "Top Up is displayed: " + topUp.getText());
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Top up is not displayed");
                        extent.createTest("Check if top up is not displayed")
                                        .log(Status.FAIL, "Top Up is not displayed");
                        extent.flush();
                }

                try {
                        WebElement transaction = wait.until(ExpectedConditions
                                        .visibilityOfElementLocated(By.xpath(
                                                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView")));

                        if (transaction.isDisplayed())
                                System.out.print(transaction.getText().contains("Transactions"));
                        extent.createTest("Check if transactions is displayed")
                                        .log(Status.PASS, "Transactions module is displayed " + transaction.getText());
                        extent.flush();

                } catch (Exception e) {
                        System.out.println("Transactions is not displayed");
                        extent.createTest("Check if transactions is not displayed")
                                        .log(Status.PASS, "Transactions module is not displayed");
                        extent.flush();
                }

        }

}
