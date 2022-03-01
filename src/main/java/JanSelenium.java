import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.logging.FileHandler;

public class JanSelenium {

    WebDriver driver;
    String URL = "https://www.google.ca/";

    @BeforeMethod
    public void setup() throws Exception{

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\theko\\Desktop\\Firefox driver\\geckodriver.exe");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

    @Test
    public void testSomething() throws InterruptedException {
        driver.get(URL);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void teardown(){
        driver.close();
        

    }



}
