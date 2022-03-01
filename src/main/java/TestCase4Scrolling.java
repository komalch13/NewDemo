import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase4Scrolling {

    WebDriver driver;
    String url= "https://demoqa.com/";

    @BeforeMethod
    public void Scroll(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        driver=  new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void TestScrolling() throws InterruptedException {

        driver.get(url);
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);

        jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        Thread.sleep(3000);

        WebElement ScrollInTheMiddle= driver.findElement(By.xpath("//h5[contains(text(), 'Alerts, Frame & Windows')]"));
        jse.executeScript("arguments[0].scrollIntoView(true);", ScrollInTheMiddle);

        Thread.sleep(3000);

       // WebElement scrollInMiddle= driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
        //jse.executeScript("arguments[0].scrollIntoView(true);", scrollInMiddle);//if you write true, it will show end of alert box and if you write false, it will show top of alert box


    }

    @AfterMethod
    public void CloseAll(){
        driver.close();
    }
}
