import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class File_Upload_Type_File {

    public static WebDriver driver;

    public static void main (String[] args){


        driver = BrowserUtlis.selectDriver("FireFox");

        BrowserUtlis.url("https://www.monsterindia.com/seeker/registration");

        driver.manage().window().maximize();

        //iD

        By file_Upload_Button = By.id("file-upload");

        ElementUtils eu = new ElementUtils(driver);

        eu.doSendKeys(file_Upload_Button,"C:\\Users\\Virtual_Assasin\\Downloads\\LIC Premium 10_01_2020.pdf");





    }

}
