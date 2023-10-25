package pages;

import driver.DriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.DriverManager.getWebDriver;

@Slf4j
public class SchedulePage {

    private final By firstAvailableTime = By.xpath("//div[@data-testid='1-availability']");
    private final By videoConferenceMeetingType = By.xpath("//p[text()='Video Conference']");
    private final By rescheduleButton = By.xpath("//button[text()='reschedule']");
    private final By confirmButton = By.xpath("//button[text()='Confirm']");
    private final By confirmationMessage = By.xpath("//span[text()='Successfully changed the communication type!']");

    public SchedulePage open(String URL){
        log.info("Open Re-Scheduling web page");
        getWebDriver().get(URL);
        return this;
    }

    public SchedulePage clickCalendarDay(String day){
        log.info("Clicking day: " + day);
        By calendarDayOption = By.xpath("//div[@data-testid='calendar-day-" + day + "']");
        DriverManager.waitForElement(calendarDayOption);
        getWebDriver().findElement(calendarDayOption).click();
        return this;
    }

    public SchedulePage clickFirstAvailableTime(){
        log.info("Clicking first available time");
        DriverManager.waitForElement(firstAvailableTime);
        getWebDriver().findElement(firstAvailableTime).click();
        return this;
    }

    public SchedulePage clickVideoConferenceMeetingType(){
        log.info("Clicking Video Conference meeting type");
        DriverManager.waitForElement(videoConferenceMeetingType);
        getWebDriver().findElement(videoConferenceMeetingType).click();
        return this;
    }

    public SchedulePage clickRescheduleButton(){
        log.info("Clicking Reschedule button");
        DriverManager.waitForElement(rescheduleButton);
        getWebDriver().findElement(rescheduleButton).click();
        return this;
    }

    public SchedulePage clickConfirmButton(){
        log.info("Clicking Reschedule button");
        DriverManager.waitForElement(confirmButton);
        getWebDriver().findElement(confirmButton).click();
        return this;
    }

    public WebElement getConfirmationMessage(){
        log.info("Getting confirmation message");
        DriverManager.waitForElement(confirmationMessage);
        return getWebDriver().findElement(confirmationMessage);
    }
}
