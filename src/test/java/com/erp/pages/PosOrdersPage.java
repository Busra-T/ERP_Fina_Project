package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PosOrdersPage extends BasePage{

    public PosOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@data-menu-xmlid='point_of_sale.menu_point_root']")
    public WebElement opt_POS;


    @FindBy(xpath = "(//a[contains(.,'Orders')])[6]")
    public WebElement opt_orders ;




    @FindBy(xpath = "(//div[@class=\"btn-group o_dropdown\"])[2]")
    public WebElement action;

    @FindBy(xpath = "//ul//a[contains(.,\"Export\")]")
    public WebElement export;

    @FindBy(xpath = "//ul//a[contains(.,\"Delete\")]")
    public WebElement delete;

    @FindBy(xpath = "//button[contains(.,'Action')]" )
    public WebElement dropdown_action ;

    @FindBy(xpath = "(html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li/a)")
    public List<WebElement>actionOptions;

    public List<String>actionOptTexts(){
        List<String>texts=new ArrayList<>();

        for (WebElement each : actionOptions) {
            texts.add(each.getText());
        }
        return texts;
    }





}
