import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase1NewAlertExample {

    WebDriver driver;
    String url= "https://demoqa.com/alerts";

    @BeforeMethod
    public void beforeAlert(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// for everyelement
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
    }

    @Test
    public void testAlertCase() throws InterruptedException {
        driver.navigate().to(url);
        driver.findElement(By.cssSelector("#alertButton")).click();

        Alert alert= driver.switchTo().alert();
        alert.accept();


       driver.findElement(By.cssSelector("#timerAlertButton")).click();
       Thread.sleep(6000);
        alert=driver.switchTo().alert();
        alert.accept();


        driver.findElement(By.cssSelector("#confirmButton")).click();
        alert=driver.switchTo().alert();
       alert.accept();


        driver.findElement(By.cssSelector("#promtButton")).click();
        Alert alert1=driver.switchTo().alert();
        alert1.sendKeys("I did it");
        Thread.sleep(3000);
        alert1.accept();
        Thread.sleep(3000);


    }

    @AfterMethod
    public void close(){
        driver.quit();
    }
}
