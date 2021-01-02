import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select_Class {

    public static WebDriver driver;


    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = BrowserUtlis.selectDriver("FireFox Headless");

        BrowserUtlis.url("https://www.orangehrm.com/orangehrm-30-day-trial/");

        //X-path

        By country = By.xpath("//*[@id=\'Form_submitForm_Country\']");

        //iD

        By no_Of_employees = By.id("Form_submitForm_NoOfEmployees");
        By industry = By.id("Form_submitForm_Industry");


        ElementUtils eu = new ElementUtils(driver);

        eu.dropDownList(country, "India");  // List All The Elements of the DropDpwn on Console

        Thread.sleep(5000);

        eu.dropDown(country, "Greece");

        eu.dropDown(no_Of_employees, "0 - 10");
        eu.dropDown(industry,"Business Services/Consultancy");


    }



}
