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

import io.appium.java_client.AppiumBy;

public class SBRTC_AC_0006 extends Base {
    ExtentSparkReporter spark;
    ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        spark = new ExtentSparkReporter("SuccessfulLogout.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);

    }

    @AfterSuite
    public void reportTeardown() {
        extent.flush();
    }

    @Test(priority = 6)
    public void sobreLogin() throws MalformedURLException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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
                username.sendKeys("Maureen01");

        } catch (Exception e) {
            System.out.println("Hello " + e.toString());
        }

        try {
            WebElement password = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/et_password")));

            if (password.isDisplayed())
                password.sendKeys("Qwertyad12#$");

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
            WebElement infoAgree = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/btn_next")));

            if (infoAgree.isDisplayed())
                infoAgree.click();

        } catch (Exception e) {
            System.out.println("Hello " + e.toString());
        }

        try {
            WebElement settings = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath(
                            "//android.widget.FrameLayout[@content-desc=\"Settings\"]/android.widget.FrameLayout/android.widget.ImageView")));

            if (settings.isDisplayed())
                System.out.println("Settings is displayed");
            extent.createTest("Check if settings is displayed")
                    .log(Status.PASS, "Settings module is displayed " + settings.getText());
            extent.flush();
            settings.click();

        } catch (Exception e) {
            System.out.println("Settings is not displayed");
            extent.createTest("Check if settings is not displayed")
                    .log(Status.FAIL, "Settings module is not displayed");
            extent.flush();
        }

        try {
            WebElement changeCardPin = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_change_card_pin")));

            if (changeCardPin.isDisplayed())
                System.out.println("Change card PIN is displayed");
            extent.createTest("Check if change card pin is displayed")
                    .log(Status.PASS, "Change card PIN is displayed " + changeCardPin.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Change card PIN is not displayed");
            extent.createTest("Check if change card pin is displayed")
                    .log(Status.FAIL, "Change card PIN is not displayed");
            extent.flush();
        }

        try {
            WebElement changeMPIN = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_change_pin")));

            if (changeMPIN.isDisplayed())
                System.out.println("Change MPIN is displayed");
            extent.createTest("Check if change MPIN is displayed")
                    .log(Status.PASS, "Change MPIN is displayed " + changeMPIN.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Change MPIN is not displayed");
            extent.createTest("Check if change MPIN is not displayed")
                    .log(Status.FAIL, "Change MPIN is not displayed");
            extent.flush();
        }

        try {
            WebElement changePassword = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_change_password")));

            if (changePassword.isDisplayed())
                System.out.println("Change password is displayed");
            extent.createTest("Check if change password is displayed")
                    .log(Status.PASS, "Change password is displayed " + changePassword.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Change password is not displayed");
            extent.createTest("Check if change password is not displayed")
                    .log(Status.FAIL, "Change password is not displayed");
            extent.flush();
        }

        try {
            WebElement changeMobile = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_change_mobile")));

            if (changeMobile.isDisplayed())
                System.out.println("Change mobile number is displayed");
            extent.createTest("Check if change mobile number is displayed")
                    .log(Status.PASS, "Change mobile number is displayed " + changeMobile.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Change mobile number is not displayed");
            extent.createTest("Check if change mobile number is not displayed")
                    .log(Status.FAIL, "Change mobile number is not displayed");
            extent.flush();
        }

        try {
            WebElement biometrics = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_biometrics")));

            if (biometrics.isDisplayed())
                System.out.println("Biometrics is displayed");
            extent.createTest("Check if biometrics is displayed")
                    .log(Status.PASS, "Biometrics is displayed " + biometrics.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Biometrics is not displayed");
            extent.createTest("Check if biometrics is not displayed")
                    .log(Status.FAIL, "Biometrics is not displayed");
            extent.flush();
        }

        try {
            WebElement privacyPolicy = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_privacy")));

            if (privacyPolicy.isDisplayed())
                System.out.println("Privacy Policy is displayed");
            extent.createTest("Check if pricay policy is displayed")
                    .log(Status.PASS, "Privacy policy is displayed " + privacyPolicy.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Privacy policy is not displayed");
            extent.createTest("Check if privacy policy is not displayed")
                    .log(Status.FAIL, "Privacy policy is not displayed");
            extent.flush();
        }

        try {
            WebElement termsAndConditions = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_terms")));

            if (termsAndConditions.isDisplayed())
                System.out.println("Terms and conditions is displayed");
            extent.createTest("Check if terms and conditions is displayed")
                    .log(Status.PASS, "Terms and conditions is displayed " + termsAndConditions.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Terms and conditions is not displayed");
            extent.createTest("Check if terms and conditions is not displayed")
                    .log(Status.FAIL, "Terms and conditions is not displayed");
            extent.flush();
        }

        try {
            WebElement consumerAwarenessProtection = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_consumer_awareness")));

            if (consumerAwarenessProtection.isDisplayed())
                System.out.println("Consumer awareness protection is displayed");
            extent.createTest("Check if consumer awareness protection is displayed")
                    .log(Status.PASS, "Consumer awareness is displayed " + consumerAwarenessProtection.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Consumer awareness protection is not displayed");
            extent.createTest("Check if consumer awareness protection is not displayed")
                    .log(Status.FAIL, "Consumer awareness protection is not displayed");
            extent.flush();
        }

        try {
            WebElement submitTicket = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_submit_ticket")));

            if (submitTicket.isDisplayed())
                System.out.println("Submit ticket is displayed");
            extent.createTest("Check if submit ticket is displayed")
                    .log(Status.PASS, "Submit ticket is displayed " + submitTicket.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Submit ticket is not displayed");
            extent.createTest("Check if submit ticket is not displayed")
                    .log(Status.FAIL, "Submit ticket is not displayed");
            extent.flush();
        }

        try {
            WebElement contactUs = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.id("com.nationlink.mobileapps.sobre:id/layout_contact_support")));

            if (contactUs.isDisplayed())
                System.out.println("Contact Us is displayed");
            extent.createTest("Check if contact us is displayed")
                    .log(Status.PASS, "Contact us is displayed " + contactUs.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Contact Us is not displayed");
            extent.createTest("Check if contact us is not displayed")
                    .log(Status.FAIL, "Contact us is not displayed");
            extent.flush();
        }

        // try {
        // WebElement logout = wait.until(ExpectedConditions
        // .visibilityOfElementLocated(By.id("com.nationlink.mobileapps.sobre:id/btn_logout")));

        // if (logout.isDisplayed())
        // System.out.println("Logout is displayed");
        // extent.createTest("Check if logout is displayed")
        // .log(Status.PASS, "Logout is displayed " + logout.getText());
        // extent.flush();
        // logout.click();

        // } catch (Exception e) {
        // System.out.println("Logout is not displayed");
        // extent.createTest("Check if logout is not displayed")
        // .log(Status.FAIL, "Logout is not displayed ");
        // extent.flush();
        // }

        try {
            WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"LOGOUT\").instance(0))")));
            logout.click();

        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            WebElement logoutModal = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.id("android:id/alertTitle")));

            if (logoutModal.isDisplayed())
                System.out.println("Logout modal is displayed");
            extent.createTest("Check if logout modal is displayed")
                    .log(Status.PASS, "Logout modal is displayed " + logoutModal.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("Logout modal is not displayed");
            extent.createTest("Check if logout modal is not displayed")
                    .log(Status.FAIL, "Logout modal is not displayed ");
            extent.flush();
        }

        try {
            WebElement noButton = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.id("android:id/button2")));

            if (noButton.isDisplayed())
                System.out.println("No button option is displayed");
            extent.createTest("Check if no button option is displayed")
                    .log(Status.PASS, "No button option is displayed " + noButton.getText());
            extent.flush();

        } catch (Exception e) {
            System.out.println("No button option is not displayed");
            extent.createTest("Check if no button option is not displayed")
                    .log(Status.FAIL, "No button option is not displayed ");
            extent.flush();
        }

        try {
            WebElement yesButton = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.id("android:id/button1")));

            if (yesButton.isDisplayed())
                System.out.println("Yes button option is displayed");
            extent.createTest("Check if yes button option is displayed")
                    .log(Status.PASS, "Yes button option is displayed " + yesButton.getText());
            extent.flush();
            yesButton.click();

        } catch (Exception e) {
            System.out.println("Yes button option is not displayed");
            extent.createTest("Check if yes button option is not displayed")
                    .log(Status.FAIL, "Yes button option is not displayed ");
            extent.flush();
        }

    }

}
