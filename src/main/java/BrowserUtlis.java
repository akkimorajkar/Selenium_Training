import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserUtlis {

     static WebDriver driver;

     public static WebDriver selectDriver(String drivername){

          driver = null;



          if (drivername.equalsIgnoreCase("firefox")){

               WebDriverManager.firefoxdriver().setup();

               driver = new FirefoxDriver();



          } else if (drivername.equalsIgnoreCase("edge")){


               WebDriverManager.edgedriver().setup();

               driver = new EdgeDriver();




          } else if (drivername.equalsIgnoreCase("chrome")){

               WebDriverManager.chromedriver().setup();

               driver = new ChromeDriver();



          } else if(drivername.equalsIgnoreCase("FireFox Headless"))
          {
               WebDriverManager.firefoxdriver().setup();

               /*FirefoxOptions fo = new FirefoxOptions();

               fo.addArguments("--headless");*/

               driver = new FirefoxDriver();



          }

          return driver;


     }

     public static void url(String url){

          driver.get(url);

     }






}
