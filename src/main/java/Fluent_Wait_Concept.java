import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Fluent_Wait_Concept {

    static WebDriver driver;

    public static void main (String[] args){

        driver = BrowserUtlis.selectDriver("firefox");

        BrowserUtlis.url("https://classic.crmpro.com/");

        By user_name = By.name("username");
        By password = By.name("password");
        By login_button = By.className("btn");

        ElementUtils eu = new ElementUtils(driver);
/*

        eu.doSendKeys(user_name,"batchautomation");
        eu.doSendKeys(password,"123456@com");
        eu.doClick(login_button);
*/


        FluentWait<WebDriver> webDriverFluentWait = new FluentWait<WebDriver>(driver);
        webDriverFluentWait.withTimeout(Duration.ofSeconds(15));
        webDriverFluentWait.pollingEvery(Duration.ofSeconds(3));
        webDriverFluentWait.ignoring(NoSuchMethodException.class);

        webDriverFluentWait.until(ExpectedConditions.presenceOfElementLocated(user_name)).sendKeys("batchautomation");

        webDriverFluentWait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys("123456@com");

        webDriverFluentWait.until(ExpectedConditions.presenceOfElementLocated(login_button)).click();

    }



}
