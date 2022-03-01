package BasicFrameworkPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {

   public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //System.setProperty("Webdriver.gecko.driver", "C:\\Users\\theko\\Desktop\\Firefox driver\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\theko\\Desktop\\Firefox driver\\geckodriver.exe");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }

    @AfterMethod

    public void tearDown(){

        driver.close();
    }

}
