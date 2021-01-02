import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropDown_With_CheckBox_Handling {

    static WebDriver driver;

    final static String Selec_All_Checkbox_from_DropDown = "all";

    public static void main(String[] args) throws InterruptedException {

        driver = BrowserUtlis.selectDriver("firefox");

        BrowserUtlis.url("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        driver.manage().window().maximize();

        //iD

        By multi_Select = By.id("justAnInputBox");

        //X-path created by Self

        By dropDownItems = By.xpath("//span[@class='comboTreeItemTitle']");

        ElementUtils eu = new ElementUtils(driver);

        eu.doClick(multi_Select);

        Thread.sleep(2000);

        eu.DropDownMultiSelect(dropDownItems, DropDown_With_CheckBox_Handling.Selec_All_Checkbox_from_DropDown); // To Select all the Values from DropDown

        eu.DropDownMultiSelect(dropDownItems,"choice 6 1","choice 2 2","choice 6 2 3"); // To Select Multiple Values from CheckBox DropDown.


    }


}

