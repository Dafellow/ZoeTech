package core;

import driver.DriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.SchedulePage;

public class ScheduleRunner extends BaseRunner {
    
    private SchedulePage schedulePage;


    @BeforeTest
    @Parameters({"URL"})
    public void openSchedulePage(String URL){
        schedulePage = new SchedulePage();
        schedulePage.open(URL);
    }

    @Test
    @Parameters({"day"})
    public void rescheduleHappyPath(String day){
        schedulePage
                .clickCalendarDay(day)
                .clickFirstAvailableTime()
                .clickVideoConferenceMeetingType()
                .clickRescheduleButton()
                .clickConfirmButton();
        Assert.assertTrue(schedulePage.getConfirmationMessage().isDisplayed());
    }
}
