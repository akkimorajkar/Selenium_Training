import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static WebDriver driver;

    public static void main (String[] args){

        driver = BrowserUtlis.selectDriver("firefox");


        BrowserUtlis.url("https://www.facebook.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By email = By.id("email");

        By pass = By.id("pass");

        ElementUtils eu = new ElementUtils(driver);

        eu.doSendKeys(email,"morajkar");

        eu.doSendKeys(pass, "Akshay");



    }



}
