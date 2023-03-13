package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.RepairsPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RepairOrder_StepDefinitions {
    RepairsPage page=new RepairsPage();

    @Then("should see {string} in title")
    public void shouldSeeInTitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @And("click on top checkbox")
    public void clickOnTopCheckbox() {
        page.cbox_orderRef.click();
    }
}
