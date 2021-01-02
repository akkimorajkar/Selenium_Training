import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class WebDriverManagerAndNavigationClass {

    static WebDriver driver; // We Declare the WebDriver as static with ref as driver

    public static void main (String[] args) {

        String webdriver = "edge";

        if (webdriver.equalsIgnoreCase("edge")){

            WebDriverManager.edgedriver().setup(); // This is how the Bonigracia WebDriverManager Maven dependency can be used

           driver = new EdgeDriver();

        } else if (webdriver.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();

             driver = new ChromeDriver();


        }else if (webdriver.equalsIgnoreCase("firefox")){

            WebDriverManager.firefoxdriver().setup();

             driver = new FirefoxDriver();

        }

        driver.get("https://www.amazon.in"); // I was earlier not able to navigate to the url since I was using the driver ref of Class variable and never instantiating the same
        // hence the Null Pointer Exception

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();

        System.out.println(driver.getTitle());

        driver.navigate().forward();

        System.out.println(driver.getTitle());


    }

}
