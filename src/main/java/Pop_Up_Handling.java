import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Pop_Up_Handling {

    static WebDriver driver;

    public static void main(String[] args){

        driver = BrowserUtlis.selectDriver("FireFox");

        BrowserUtlis.url("http://www.popuptest.com/goodpopups.html");

        //LinkText

        By pop_Up_3_Link = By.linkText("Good PopUp #3");

        ElementUtils eu = new ElementUtils(driver);

        eu.doClick(pop_Up_3_Link);

        Set<String> pop_handles_List =  driver.getWindowHandles();

        List<String> pop_Up_Handler = new ArrayList<String>(pop_handles_List);

        for(String st : pop_Up_Handler){

            System.out.println(st);

        }

        String parentWindowiD = pop_Up_Handler.get(0);

        String childWindowiD = pop_Up_Handler.get(1);

        driver.switchTo().window(childWindowiD);

        System.out.println("Child window Title: "+ driver.getTitle());

        driver.close();


        driver.switchTo().window(parentWindowiD);

        System.out.println("Parent  window Title: "+ driver.getTitle());

        driver.close();

    }


}
