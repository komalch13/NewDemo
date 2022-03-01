import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase3Iframes {

    WebDriver driver;
    String url= "https://demoqa.com/frames";

@BeforeMethod
    public void getIframes(){

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
   driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);

}

@Test
    public void testIframe() throws InterruptedException {

    driver.get(url);

    WebElement iframe = driver.findElement(By.id("frame1"));
    driver.switchTo().frame(iframe);
    WebElement checkTabElement = driver.findElement(By.id("sampleHeading"));
    Assert.assertTrue(checkTabElement.isDisplayed());
    driver.switchTo().defaultContent();// you have to go back to defaultcontent else you will be remain in the third party window/frame
    Thread.sleep(3000);

}
@AfterMethod
    public void closeTest(){
    driver.close();

}

}
