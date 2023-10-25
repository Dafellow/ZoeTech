package driver;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Slf4j
public class DriverManager {

    private static WebDriver webDriver;

    private DriverManager(){}

    public static WebDriver getWebDriver(){
        if(webDriver == null){
            log.info("Setting up new Web Driver");
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    public static void waitForElement(By byElement){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
    }

    public static void stopDriver(){
        log.info("Web Driver stopped");
        webDriver.quit();
    }
}
