package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DocumentationPage extends BasePage {


    @FindBy(linkText = "Documentation")
    public WebElement btn_documentation;

    @FindBy(tagName = "h1")
    public WebElement msg_odoo;

    @FindBy(tagName = "h2")
    public List<WebElement> docTopics;

    
}
