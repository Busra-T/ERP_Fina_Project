package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.MainPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
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
            if(main.moreClick.isEnabled()||main.moreClick.isDisplayed()) {
                main.moreClick.click();
            }
            if(each.getText().equals("Website")){
                continue;
            }
            if(each.getText().equals("Lunch")){
                each.click();
                WebElement pop= Driver.getDriver().findElement(By.xpath("//button[@class='close']"));
                BrowserUtils.waitForClickablility(pop,10);
                pop.click();
                continue;

            }
            BrowserUtils.waitForClickablility(each,20);
            each.click();
            Assert.assertTrue(each.isEnabled());
        }
    }
}
