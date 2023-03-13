package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends BasePage{


    @FindBy(xpath = "(//span[contains(.,'Calendar')])[1]")
    public WebElement calendar;

    @FindBy(xpath = "//span[contains(.,':00')]")
    public List<WebElement> times;
}
