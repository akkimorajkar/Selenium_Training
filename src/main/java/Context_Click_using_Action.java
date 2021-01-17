import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Context_Click_using_Action {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = BrowserUtlis.selectDriver("firefox");

        BrowserUtlis.url("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        //X-path

        By right_Click_me = By.xpath("//span[text()='right click me']");

        By elements_Of_Right_Click = By.xpath("//li[contains(@class,'context-menu-icon')]");

        ElementUtils eu = new ElementUtils(driver);

        WebElement right_Click_Button = eu.getElement(right_Click_me);

        Actions action = new Actions(driver);

        action.contextClick(right_Click_Button).perform();

        List<WebElement> right_Click_Drop_Dpwn_Elements = eu.getElements(elements_Of_Right_Click);

        for (WebElement ele : right_Click_Drop_Dpwn_Elements) {

            String text = ele.getText();

            System.out.println(text);

            if (text.equalsIgnoreCase("Copy")) {

                ele.click();
                break;

            }

        }

    }
}
