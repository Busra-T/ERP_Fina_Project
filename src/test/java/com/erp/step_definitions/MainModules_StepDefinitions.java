package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.MainPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class MainModules_StepDefinitions {

    MainPage main=new MainPage();

    @When("POS manager login with valid credentials")
    public void posManagerLoginWithValidCredentials(Map<String,String> credentials) {
     main.login(credentials.get("email"),credentials.get("password"));
    }

    @Then("should have access to the all modules")
    public void shouldHaveAccessToTheAllModules() {

        for (WebElement each : main.mainMenu) {
           // BrowserUtils.waitForClickablility(each,2);
           // each.click(); ==> works but with the bigger screen
            Assert.assertTrue(each.isEnabled());
        }
    }
}
