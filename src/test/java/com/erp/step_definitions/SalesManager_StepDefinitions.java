package com.erp.step_definitions;

import com.erp.pages.SalesManagerPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SalesManager_StepDefinitions {

    SalesManagerPage sm=new SalesManagerPage();

    @And("should have access to the all below modules")
    public void shouldHaveAccessToTheAllBelowModules(List<String>modules) {

        List<String > actual=new ArrayList<>();

        if(sm.moreClick.isDisplayed()||sm.moreClick.isEnabled()){
            sm.moreClick.click();
        }

        for (WebElement each : sm.mainMenu ) {
            actual.add(each.getText());
        }
        Assert.assertEquals(modules,actual);

        // rest of it ==> verification for access by clicking one by one

        for (WebElement eachModule : sm.mainMenu) {


            if(sm.moreClick.isDisplayed()||sm.moreClick.isEnabled()){
                sm.moreClick.click();
            }

            BrowserUtils.waitForClickablility(eachModule,20);
            eachModule.click();


        }

    }
}

