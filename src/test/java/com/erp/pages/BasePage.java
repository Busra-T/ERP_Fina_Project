package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement input_email;

    @FindBy(id = "password")
    public WebElement input_password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement btn_login;

    @FindBy(className = "oe_topbar_name")
    public WebElement accountHolder;

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> mainMenu;

    @FindBy(xpath = "(//span[contains(.,'Events')])[1]")
    public WebElement events;

    @FindBy(xpath = "(//span[contains(.,'Website')])[1]")
    public WebElement Website;







  /*  @FindBy()
    public WebElement ;

    @FindBy()
    public WebElement ;

    @FindBy()
    public WebElement ;

    @FindBy()
    public WebElement ; */

    public void login(String email, String password){
        input_email.sendKeys(email);
        input_password.sendKeys(password);
        btn_login.click();
    }

}
