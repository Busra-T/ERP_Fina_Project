package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class RepairsPage extends BasePage{


    @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']")
    public WebElement btn_repairs;

    public List<WebElement> columnsRepairs= Driver.getDriver().findElements(By.xpath("//th[@class='o_column_sortable']"));


    public List<String> actualColumns(){

        List<String> columnsTexts=new ArrayList<>();
        List<WebElement>columns = Driver.getDriver().findElements(By.xpath("//th[@class='o_column_sortable']"));


        for (WebElement each : columns) {
            columnsTexts.add(each.getText());
        }
        return columnsTexts;
    }



}
