package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailInput;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement passwordInput;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public WebElement loginButton;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement alertPopUp;

    @FindBy(how = How.CLASS_NAME, using = "account")
    public WebElement userInfomationLink;

    @FindBy(how = How.CLASS_NAME, using = "logout")
    public WebElement signOutLink;
    public SignInPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
