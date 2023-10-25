package core;

import driver.DriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@Slf4j
public class BaseRunner {

    private WebDriver webDriver;

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        log.info("Suite starting");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        log.info("Suite ending");
        DriverManager.stopDriver();
    }
}
