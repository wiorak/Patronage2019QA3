package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.AccountCreationPage;
import com.Intive.Patronage.tests.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class AccountCreationSteps extends DriverFactory {

    private SignInPage signInPage = new SignInPage(driver);
    private AccountCreationPage accountCreationPage = new AccountCreationPage(driver);


    @And("^I input the CREATE AN ACCOUNT Email (.*)$")
    public void iInputTheCREATEANACCOUNTEmailAddress(String email) {
        signInPage.createEmailAddress.sendKeys(email);
    }

    @And("^I click on CREATE AN ACCOUNT button$")
    public void iClickOnCREATEANACCOUNTButton() {
        signInPage.createAnAccountButton.click();
    }

    @Then("^I see Registration Form$")
    public void iSeeRegistrationForm() {
        Assert.assertTrue(accountCreationPage.accountCreationForm.isDisplayed());
    }
}
