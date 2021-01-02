import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google_Search {

    public static WebDriver driver;


    public static void main (String[] args) throws InterruptedException {

       driver =  BrowserUtlis.selectDriver("firefox");

        BrowserUtlis.url("https://www.google.com/");

        driver.manage().window().maximize();

        //Class

        By search_Bar = By.className("gLFyf");

        //Created X-Path

        By Suggestion_List_Drop_Down = By.xpath("//ul[@class='erkvQe']//span");

        ElementUtils eu = new ElementUtils(driver);

        //Below Method present in ElementsUtils Class

        eu.googleSearch(search_Bar,Suggestion_List_Drop_Down,"Happy New Year","Happy New Year 2021" );

       // eu.dropDownSelectionWithoutSelect(google_Suggestion,"tutorial");











    }


}
