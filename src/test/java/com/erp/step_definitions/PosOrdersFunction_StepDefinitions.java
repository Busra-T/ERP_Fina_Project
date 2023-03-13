package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.PosOrdersPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PosOrdersFunction_StepDefinitions extends BasePage {

    PosOrdersPage page=new PosOrdersPage();
    @When("user logged in as POS manager")
    public void userLoggedInAsPOSManager() {
        login("posmanager19@info.com","posmanager");
    }

    @And("user clicks on Point of Sale")
    public void userClicksOnPointOfSale() {
        BrowserUtils.waitForClickablility(page.opt_POS,3);
        page.opt_POS.click();
    }

    @Then("user clicks on orders")
    public void userClicksOnOrders() {
        BrowserUtils.waitForClickablility(page.opt_orders,4);
        page.opt_orders.click();
    }

    @Then("user clicks Order Ref checkbox")
    public void userClicksOrderRefCheckbox() {
        page.cbox_orderRef.click();
    }

    @Then("user sees all orders are checked")
    public void userSeesAllOrdersAreChecked() {

        for (WebElement each : page.checks) {
            Assert.assertTrue(each.isSelected());
        }
        //Assert.assertTrue(page.checks.size()==60);
        Assert.assertTrue(page.checks.size()==10);

    }

    @Then("user sees the Action dropdown")
    public void userSeesTheActionDropdown() {
        Assert.assertTrue(page.dropdown_action.isDisplayed());
    }

    @And("user clicks on Action dropdown")
    public void userClicksOnActionDropdown() {
        page.dropdown_action.click();
    }

    @Then("user sees the below options")
    public void userSeesTheBelowOptions(List<String>actionOpts) {

        Assert.assertEquals(actionOpts,page.actionOptTexts());


    }
}
