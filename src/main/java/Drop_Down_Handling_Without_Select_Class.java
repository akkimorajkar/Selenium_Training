import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Drop_Down_Handling_Without_Select_Class {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = BrowserUtlis.selectDriver("FireFox Headless");
        BrowserUtlis.url("https://www.orangehrm.com/orangehrm-30-day-trial/");

        driver.manage().window().maximize();

        //x-Path

        By state = By.xpath("//select[@id='Form_submitForm_State']/option");

        By industry_Drop_Down = By.xpath("//select[@id='Form_submitForm_Industry']/option");

        By country =  By.xpath("//*[@id='Form_submitForm_Country']");



        ElementUtils eu = new ElementUtils(driver);

        eu.dropDownSelectionWithoutSelect(industry_Drop_Down,"Government - Local"); // getElements method of Driver

        eu.dropDownSelectionWithoutSelect(country,"India");

        Thread.sleep(3000);

        eu.dropDownSelectionWithoutSelect(state,"Maharashtra"); // getElements method of Driver





    }



}
