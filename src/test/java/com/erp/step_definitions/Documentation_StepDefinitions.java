package com.erp.step_definitions;

import com.erp.pages.DocumentationPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Documentation_StepDefinitions {

    DocumentationPage page=new DocumentationPage();
    @Then("clicks on {string} name")
    public void clicksOnName(String loginName) {
        page.accountHolder.click();
    }

    @And("clicks on Documentation")
    public void clicksOnDocumentation() {
        page.btn_documentation.click();
    }

    @And("user launches to a new window and see Odoo Documentation message")
    public void userLaunchesToANewWindowAndSeeOdooDocumentationMessage() {

        BrowserUtils.switchWindowAndVerify("documentation","Odoo Documentation");

        Assert.assertEquals(page.msg_odoo.getText(),"Odoo Documentation");
    }

    @Then("user sees below document topics are listed")
    public void userSeesBelowDocumentTopicsAreListed(List<String>topics) {

        List<String>actualTopics=new ArrayList<>();

        for (WebElement each : page.docTopics) {
            actualTopics.add(each.getText());
        }
        Assert.assertEquals(actualTopics,topics);

    }
}
