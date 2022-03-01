import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase7ToolTip {

    WebDriver driver;
    String url= "https://demoqa.com/tool-tips";

    @BeforeMethod
    public void startToolTip(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
    }

    @Test
    public void testToolTip() throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);

        WebElement ToolTip= driver.findElement(By.id("toolTipButton"));
        Actions TipHover= new Actions(driver);
        TipHover.moveToElement(ToolTip).build().perform();
        Thread.sleep(3000);

        ToolTip= driver.findElement(By.id("toolTipButton"));
        String value= ToolTip.getAttribute("aria-describedby");
        System.out.println(value);
        Assert.assertEquals("buttonToolTip", value);

        Thread.sleep(3000);
       WebElement getElement= driver.findElement(By.xpath("//div[@class='tooltip-inner' and contains(text(), 'You hovered over the Button')]"));
       // WebElement toolTip= driver.findElement(By.xpath("//div[@class='tooltip-inner' and contains(text(), 'You hovered over the Button')]"));
       // Thread.sleep(3000);
        Assert.assertTrue(getElement.isDisplayed());





    }

    @AfterMethod
    public void closeBrowser(){

        driver.close();
    }
}
