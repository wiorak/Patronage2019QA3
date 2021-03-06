package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.MainPage;
import com.Intive.Patronage.tests.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInSteps extends DriverFactory {
    private MainPage mainPage = new MainPage(driver);
    private SignInPage signInPage = new SignInPage(driver);

    @Given("^I open AutomationPractice website$")
    public void iOpenAutomationPracticeWebsite() {
        mainPage.openAutomationPracticePage();
    }

    @When("^I click on SING IN link$")
    public void iClickOnSingInLink() {
        mainPage.signInLink.isDisplayed();
        mainPage.signInLink.click();
    }

    @And("^I input the Email address (.*)$")
    public void iGivesTheEmailAddress(String email) {
        signInPage.emailInput.isDisplayed();
        signInPage.emailInput.sendKeys(email);
    }

    @And("^I input the Password (.*)$")
    public void iGivesThePassword(String password) {
        signInPage.passwordInput.isDisplayed();
        signInPage.passwordInput.sendKeys(password);

    }

    @And("^I click on Sign in button$")
    public void iClickOnSignInButton() {
        signInPage.loginButton.isDisplayed();
        signInPage.loginButton.click();
    }

    @Then("^I can see User Information$")
    public void iCanSeeAlertMessage() {
        Assert.assertTrue(signInPage.userInfomationLink.isDisplayed());
    }

    @Then("^I can see login error$")
    public void iCanSeeLoginError() {
        Assert.assertTrue(signInPage.alertPopUp.isDisplayed());
    }

    @And("^I click on SIGN OUT link$")
    public void iClickOnSINGOUTLink() {
        signInPage.signOutLink.click();
    }

    @Then("^I see SIGN IN link$")
    public void iSeeSIGNINLink() {
        Assert.assertTrue(mainPage.signInLink.isDisplayed());
    }
}

