import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Drop_Down_Values_In_List {

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriver driver = BrowserUtlis.selectDriver("FireFox Headless");
        BrowserUtlis.url("https://www.orangehrm.com/orangehrm-30-day-trial/");

        //X-Path

        By links = By.tagName("a");

        ElementUtils eu = new ElementUtils(driver);

        List<WebElement> linkList = eu.getElements(links);  // How to get al the Drop_Down Values in a List

        System.out.println(linkList.size());

        for (WebElement e : linkList) {


            if (!e.getText().isEmpty()) {

                System.out.println(e.getText());

                System.out.println(e.getAttribute("href"));

                System.out.println("----------------------------------------------------------------------------------------");

            }

        }

    }
}
