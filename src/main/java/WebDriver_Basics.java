import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriver_Basics {

    public static void main (String[] args){

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Virtual_Assasin\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver(); // Launch MicrosoftEdge

        driver.get("https://www.google.com"); // got to url

        String title = driver.getTitle(); // get the Title of the page

        System.out.println(title);

        /*if (title.equalsIgnoreCase("google")){

            System.out.println("Correct title");
        }

        else {

            System.out.println("InCorrect title");

        } */



        driver.quit();

        String url = driver.getCurrentUrl();

        System.out.println(url);



    }

}
