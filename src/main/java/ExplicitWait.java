import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

    public static WebDriver driver;

    public static void main(String[] args) {

        BrowserUtlis.selectDriver("firefox");

        BrowserUtlis.url("https://www.facebook.com/");

        By email = By.id("email");

        ElementUtils eu = new ElementUtils(driver);

        WebElement email_Text_Box = eu.exp_Wait(10, email); // it will be applied to specit WebElement and hence can be used in customizable way.

        email_Text_Box.sendKeys("admin@1234");


        /*WebDriverWait wait = new WebDriverWait(driver, 10);

        if (wait.until(ExpectedConditions.titleContains("Facebook"))){

            System.out.println("The Title is Correct");

        }

        else {

            System.out.println("The Title is inCorrect");


        }*/


    }

}
