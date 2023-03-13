package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage{


   /* @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> mainMenu;
*/

    @FindBy(xpath ="(//li[@style='display: block;'])[13]\n" )
    public WebElement more;

    @FindBy(xpath ="//li[@id='menu_more_container']" )
    public WebElement moreClick;

    @FindBy(xpath = "//li[@style='display: block;']//span[@class='oe_menu_text']")
    public List<WebElement>mainMenu;



}

