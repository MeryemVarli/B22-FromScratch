package com.luma.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CreateAccountPage {

    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


 @FindBy(css = "#firstname")
    WebElement firstname;

@FindBy(css = "#lastname")
    WebElement lastname;

@FindBy(css = "#email_address")
    WebElement email;

@FindBy(css = "#password")
    WebElement password;

@FindBy(css = "#password-confirmation")
    WebElement passwordConfirm;

@FindBy(xpath = "//button[.='Create an Account']")
    WebElement createAccountBtn;

@FindBy(xpath = "//div[@data-ui-id='message-success']")
    WebElement successMessage;


public void enterNameAndLastName(String name,String lastname){

    BrowserUtils.sendKeys(this.firstname,driver,name);
    BrowserUtils.sendKeys(this.lastname,driver,lastname);
}


public void enterEmailPasswordAndConfirmPassword(String email,String password,String confirmPassword){

    BrowserUtils.sendKeys(this.email,driver,email);
    BrowserUtils.sendKeys(this.password,driver,password);
    BrowserUtils.sendKeys(this.passwordConfirm,driver,confirmPassword);
}


public void clickOnCreateAccBtnAndValidateMessage(String successMessage){
    BrowserUtils.click(this.createAccountBtn,driver);

    Assert.assertEquals(successMessage,BrowserUtils.getText(this.successMessage)); //did very short way!!

}



}
