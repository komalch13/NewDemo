import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestCase2BrowserWindow {

    WebDriver driver;
    String url= "https://demoqa.com/browser-windows";

    @BeforeMethod
    public void StartTestCase(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @Test
    public void TestSecondCase() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        String currentWindow=driver.getWindowHandle();
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(2000);

        Set<String> setWindow= driver.getWindowHandles();
        List<String> arrayWindow= new ArrayList<>(setWindow);
        driver.switchTo().window(arrayWindow.get(1));

        WebElement checkNewOpenWindow= driver.findElement(By.id("sampleHeading"));
        Assert.assertTrue(checkNewOpenWindow.isDisplayed());
        driver.close();
        driver.switchTo().window(currentWindow);
        driver.switchTo().window(arrayWindow.get(0));

        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.id("tabButton")).isDisplayed());
        Thread.sleep(3000);


    }

    @AfterMethod
    public void ClearAll(){
        driver.quit();
    }

}
