import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ElementUtils  {

    WebDriver driver;

    public ElementUtils(WebDriver driver) {

        this.driver = driver;

    }

    public List<WebElement> getElements(By locator){

        return driver.findElements(locator);
    }

    public WebElement getElement(By locator){

        return driver.findElement(locator);

    }

    public void doSendKeys(By locator , String value){

        getElement(locator).sendKeys(value);


    }

    public void actionSendKeys(By Locator, String value) {

        WebElement element = getElement(Locator);

        Actions action = new Actions(driver);

        action.sendKeys(element, value).perform();

    }


        public void doClick(By locator){

        getElement(locator).click();


    }

    public String getText(By locator){  //Get_Text Util

        return getElement(locator).getText();

    }

    public void dropDown(By locator, String value){

        Select sel = new Select(getElement(locator));

        sel.selectByValue(value);

    }

    public void dropDownList(By locator, String selectIndustry){

        Select sel1 = new Select(getElement(locator));
        //return sel1.getOptions();

        List<WebElement> optionsList = sel1.getOptions();

        for (int i = 0 ; i <= optionsList.size()-1; i++){

            String value = optionsList.get(i).getAttribute("value");

            if (value.equalsIgnoreCase(selectIndustry)){

                optionsList.get(i).click();

                break;

            }

            System.out.println(value);

        }




    }

    public void dropDownSelectionWithoutSelect(By locator,String valueToSelect){

        List<WebElement> industries = getElements(locator);

        for (int i = 0; i <= industries.size() - 1; i++) {

            String text = industries.get(i).getText();

            System.out.println(text);

            if (text.equalsIgnoreCase(valueToSelect)) {

                industries.get(i).click();


            }


        }
    }

    public void googleSearch(By googleSearchbar , By google_suggest_DropDown , String whatUWantToGoogle, String exactValue) throws InterruptedException {

        doSendKeys(googleSearchbar,whatUWantToGoogle);

        Thread.sleep(4000);

        List<WebElement> google_Suggest = getElements(google_suggest_DropDown);

        System.out.println(google_Suggest.size());

        for (WebElement ele : google_Suggest) {

            String text = ele.getText();

            if (text.equalsIgnoreCase(exactValue)) {
                ele.click();

                break;
            }

        }
    }

    // Below Method is used to Select Single,Multiple, All Values from DropDown CheckBox
    //@param Locator
    //@param Value...

    public void DropDownMultiSelect(By dropDownItemsLocator, String... valueToBeSelected) {

        List<WebElement> dropDown_Elements = driver.findElements(dropDownItemsLocator);

        for (int i = 0; i <= dropDown_Elements.size() - 1; i++) {

            String text = dropDown_Elements.get(i).getText();

            System.out.println(text);


            if (!valueToBeSelected[0].equalsIgnoreCase("all")) {


                for (int j = 0; j <= valueToBeSelected.length - 1; j++) {


                    if (text.equalsIgnoreCase(valueToBeSelected[j])) {

                        dropDown_Elements.get(i).click();

                        break;

                    }


                }
            }

            else {

                dropDown_Elements.get(i).click();

            }


        }
    }


/*     Wait UTils */

    public WebElement exp_Wait(int wait_Seconds, By locator){

        WebDriverWait wait = new WebDriverWait(driver,wait_Seconds);

        WebElement newElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return newElement;


    }
}

     /*Create Webelement + actions (sendKeys,click,get text)
     //*1st way of Locating Elements by Laymen way

     //driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Akshay");

     //driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Morajkar");  *

    *2 way Locating Elements*/



     /* WebElement firstname = driver.findElement(By.id("Form_submitForm_FirstName"));

     WebElement lastname = driver.findElement(By.id("Form_submitForm_LastName"));

     WebElement submit = driver.findElement(By.id("Form_submitForm_action_request"));

     firstname.sendKeys("Akshay");
     lastname.sendKeys("Morajkar");
     submit.click(); *

    * 3 way of Locating elements



     WebElement firstname =  driver.findElement(name);
     WebElement lastname = driver.findElement(surname);
     WebElement submit  = driver.findElement(button);

     firstname.sendKeys("Akshay");
     lastname.sendKeys("Morajkar");
     submit.click();

     /** 4th Approach

     getElement(name).sendKeys("Akshay");

     getElement(surname).sendKeys("Morajkar");

     //Thread.sleep(3000);

     getElement(button).click(); *


    /*List<WebElement> link_list = ele.getElements(tag);

        System.out.println(link_list.size());

        for (int i = 0 ; i<= link_list.size()-1 ; i++){

        String text = link_list.get(i).getText();
        String attribute = link_list.get(i).getAttribute("href");

        if (!text.isEmpty()){

            System.out.println(i+ "---->" + text);
            System.out.println(attribute);

        }*/


