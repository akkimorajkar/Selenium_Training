import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;

public class OrangeHRM {

    static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserUtlis.selectDriver("FireFox Headless");
        BrowserUtlis.url("https://www.orangehrm.com/orangehrm-30-day-trial/");

        driver.manage().window().maximize();

        //id

        By url = By.id("Form_submitForm_subdomain");
        By firstName = By.id("Form_submitForm_FirstName");
        By lastName = By.id("Form_submitForm_LastName");

        //name

        By email = By.name("Email");
        By jobTitle = By.name("JobTitle");

        //css

        By company_Name = By.cssSelector("#Form_submitForm_CompanyName");

        //x-Path

        By phone = By.xpath("//*[@id=\'Form_submitForm_Contact\']");




        ElementUtils eu = new ElementUtils(driver);

        eu.doSendKeys(url, "www.google.com");
        eu.doSendKeys(firstName, "Akshay");
        eu.doSendKeys(lastName, "Morajkar");
        eu.doSendKeys(email, "admin@1234");
        eu.doSendKeys(jobTitle, "Analyst");
        eu.doSendKeys(company_Name, "Rk Marbles");
        eu.doSendKeys(phone, "9869911186");


    }



}








