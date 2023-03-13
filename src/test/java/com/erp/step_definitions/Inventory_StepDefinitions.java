package com.erp.step_definitions;

import com.erp.pages.InventoryPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Inventory_StepDefinitions {

InventoryPage inv=new InventoryPage();

    @And("should have access to below modules")
    public void shouldHaveAccessToBelowModules(List<String >modules) {
        if(inv.moreClick.isEnabled()){
            inv.moreClick.click();
        }

        List<String >actual=new ArrayList<>();

        for (WebElement each : inv.mainMenu) {
            actual.add(each.getText());
            }
        Assert.assertEquals(modules,actual);
        }

    }

