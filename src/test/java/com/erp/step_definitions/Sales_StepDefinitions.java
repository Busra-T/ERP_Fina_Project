package com.erp.step_definitions;

import com.erp.pages.SalesPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sales_StepDefinitions {

    SalesPage sales=new SalesPage();


    @When("managers login with valid {string} and {string}")
    public void managersLoginWithValidAnd(String email, String password) {
        sales.login(email,password);
    }

    @Then("see the correct {string}")
    public void seeTheCorrect(String loginName) {
        Assert.assertEquals(loginName,sales.accountHolder.getText());
    }

    @And("click on Sales")
    public void clickOnSales() {
        sales.btn_sales.click();
    }

    @Then("see below columns in the quotations")
    public void seeBelowColumnsInTheQuotations(List<String>columnsName) {
        BrowserUtils.waitForTitleContains("Quotations");

        Assert.assertEquals(columnsName,sales.columnsTexts());
    }
}
