import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseVsQuit {

public static void main (String[] args){

    System.setProperty("webdriver.edge.driver", "C:\\Users\\Virtual_Assasin\\Downloads\\edgedriver_win64\\msedgedriver.exe");

    WebDriver driver = new EdgeDriver(); // Launch MicrosoftEdge

    driver.get("https://www.google.com"); // got to url

    String title = driver.getTitle(); // get the Title of the page

    System.out.println(title);

    driver.close(); // The Session is Closed. Session iD Should be changed

    driver = new EdgeDriver(); // New Session is launched and new session iD Would be created.

    System.out.println(driver.getTitle());


    }

}
