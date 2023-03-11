package com.erp.step_definitions;

import com.erp.pages.SalesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sales_StepDefinitions extends SalesPage {


    @When("managers login with valid {string} and {string}")
    public void managersLoginWithValidAnd(String email, String password) {
        login(email,password);
    }

    @Then("see the correct {string}")
    public void seeTheCorrect(String loginName) {
        Assert.assertEquals(loginName,accountHolder.getText());
    }

    @And("click on Sales")
    public void clickOnSales() {
        btn_sales.click();
    }

    @Then("see below columns in the quotations")
    public void seeBelowColumnsInTheQuotations(List<String>columnsName) {
        for (WebElement each : columns) {
            Assert.assertTrue(columnsName.contains(each.getText()));
        }
    }
}
