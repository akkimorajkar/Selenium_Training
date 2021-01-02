import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

    static WebDriver driver;

    public static void main (String[] args){

        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions fo = new FirefoxOptions(); // To start Browser in Headless mode u need to use FirefoxOptions(Fo) Class

        fo.addArguments("--headless"); // in the method addArguments of Class Fo u need to give pass this String excatly same

        driver = new FirefoxDriver(fo); // Now FireFoxDriver is Called with on argument Constructor

        driver.get("https://www.amazon.in");

        System.out.println(driver.getTitle());




    }

}
