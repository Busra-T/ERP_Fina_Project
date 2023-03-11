package com.erp.step_definitions;

import com.erp.pages.RepairsPage;
import com.erp.pages.SalesPage;
import com.erp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RepairsPage_StepDefinitions extends RepairsPage {
    @Then("click on Repairs")
    public void clickOnRepairs() {
        btn_repairs.click();
    }

    @And("see below columns in the repairs orders")
    public void seeBelowColumnsInTheRepairsOrders(List<String>repairsColumns) {

        Assert.assertEquals(repairsColumns,actualColumns());
    }
}
