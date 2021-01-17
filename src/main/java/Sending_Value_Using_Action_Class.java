import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sending_Value_Using_Action_Class {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

       driver = BrowserUtlis.selectDriver("firefox");

       BrowserUtlis.url("https://www.facebook.com/");

       Thread.sleep(2000);

       //iD

        By pwd = By.id("pass");

        By email = By.id("email");

        ElementUtils eu = new ElementUtils(driver);

        eu.actionSendKeys(pwd,"Akshay");
        eu.actionSendKeys(email,"admin@1234.com");

    }

}
