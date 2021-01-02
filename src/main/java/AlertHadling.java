import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class AlertHadling {

    public static WebDriver driver;

    public static void main (String[] args) throws InterruptedException {


        driver =  BrowserUtlis.selectDriver("firefox");

        BrowserUtlis.url("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().maximize();


        //Class

        By sign_In_Button = By.className("signinbtn");

        ElementUtils eu = new ElementUtils(driver);

        eu.doClick(sign_In_Button);

        Alert alert = driver.switchTo().alert();

        Thread.sleep(2000);

        alert.accept();

        driver.switchTo().defaultContent(); // to get back on tha page fromm Alert window

    }

}
