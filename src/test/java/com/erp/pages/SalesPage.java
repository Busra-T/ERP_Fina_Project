package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPage extends BasePage{


    @FindBy(xpath = "//a[@data-menu-xmlid='sale.sale_menu_root']")
    public WebElement btn_sales;

    @FindBy(xpath = "//button[contains(.,'Create')]")
    public WebElement btn_create;








    public List<WebElement> columns= Driver.getDriver().findElements(By.xpath("//th[contains(@class,'o_column_sortable')]"));




}
