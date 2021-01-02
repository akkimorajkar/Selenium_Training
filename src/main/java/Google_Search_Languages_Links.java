import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_Search_Languages_Links {

    public static WebDriver driver;

    public static void main(String[] args){


        driver = BrowserUtlis.selectDriver("Firefox");
        BrowserUtlis.url("https://www.google.com/");

        //X-path Created

        By google_Search_Languages = By.xpath("//div[@id='gws-output-pages-elements-homepage_additional_languages__als']//a");

        ElementUtils eu = new ElementUtils(driver);

        List <WebElement> languages_Links =  eu.getElements(google_Search_Languages);

        for (WebElement el : languages_Links){

            System.out.println(el.getText());

        }






    }




}
