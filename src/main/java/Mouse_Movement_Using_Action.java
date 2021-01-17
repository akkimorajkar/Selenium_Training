import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Mouse_Movement_Using_Action {


    public static WebDriver driver;

    public static void main(String[] ags) throws InterruptedException {

        driver = BrowserUtlis.selectDriver("FireFox");

        BrowserUtlis.url("http://mrbool.com/");

        //Class

        By content = By.className("menulink");

        //LinkText

        By courses = By.partialLinkText("COURSES");

        ElementUtils eu = new ElementUtils(driver);

        WebElement content_Hover = eu.getElement(content);

        Actions action = new Actions(driver); // Action Class

        action.moveToElement(content_Hover).perform();

        // if Only One Action no need for build(). We can have direct perform()
        // for More than one We require build().

        Thread.sleep(2000);

        eu.doClick(courses);


    }

}
