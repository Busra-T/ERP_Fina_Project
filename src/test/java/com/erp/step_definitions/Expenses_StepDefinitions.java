package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Expenses_StepDefinitions extends BasePage {


    @And("should have access to the below modules")
    public void shouldHaveAccessToTheBelowModules(List<String > modules) {
        List<String >actual=new ArrayList<>();

        for (WebElement each : mainMenu ) {
            actual.add(each.getText());
        }
        Assert.assertEquals(modules,actual);

        // rest of it ==> verification for access by clicking one by one

        for (WebElement eachModule : mainMenu) {
            if(eachModule.getText().equals("Website")){
                continue;
            }
            if(eachModule.getText().equals("Lunch")){
                eachModule.click();
                WebElement pop=Driver.getDriver().findElement(By.xpath("//button[@class='close']"));
                BrowserUtils.waitForClickablility(pop,10);
                pop.click();
                continue;

            }
            BrowserUtils.waitForClickablility(eachModule,20);
            eachModule.click();


        }

    }

}
