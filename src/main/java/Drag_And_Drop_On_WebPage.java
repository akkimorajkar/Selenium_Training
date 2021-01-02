import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_On_WebPage {

    public static WebDriver driver;

    public static void main (String[] args) throws InterruptedException {

        driver = BrowserUtlis.selectDriver("FireFox");

        BrowserUtlis.url("https://jqueryui.com/resources/demos/droppable/default.html");

        // Class

        By draggable = By.className("ui-draggable");
        By droppable = By.className("ui-droppable");

        ElementUtils eu = new ElementUtils(driver);

        WebElement toBedragged = eu.getElement(draggable);

        WebElement tobeDroppedOn = eu.getElement(droppable);

        Actions action = new Actions(driver);

        Thread.sleep(3000);

        action.dragAndDrop(toBedragged,tobeDroppedOn).build().perform();// When more than One Action we need to have Build 


    }

}
