package com.erp.step_definitions;

import com.erp.pages.CalendarPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calendar_StepDefinitions {

    CalendarPage page=new CalendarPage();
    @And("User should click on Calendar page")
    public void userShouldClickOnCalendarPage() {
        page.calendar.click();
    }

    @Then("User should verify calendar time list starting from {string} til {string}, and is increased by one hour")
    public void userShouldVerifyCalendarTimeListStartingFromTilAndIsIncreasedByOneHour(String beginning, String end, List<String> hours) {

        BrowserUtils.waitForPageToLoad(20);
        List<String> actualHours=new ArrayList<>();

        for (WebElement each :page.times) {
            actualHours.add(each.getText());
        }

        Assert.assertEquals(hours,actualHours);

        //rest of it ==> verification of increasing 1 hour

        List<Integer>hourList=new ArrayList<>();

        for (String each : actualHours) {
            int newHours=Integer.valueOf(each.substring(0,each.length()-3));
            hourList.add(newHours);
        }

        for (int i = 0; i < hourList.size()-1; i++) {
            Assert.assertTrue((hourList.get(i)+1)==hourList.get(i+1));
        }
        List<Integer>expectedHourList=new ArrayList<>();


        for (int i = 0; i < 24; i++) {
            expectedHourList.add(i);
        }
        Assert.assertEquals(hourList,expectedHourList);

    }
}
