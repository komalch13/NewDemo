import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserOpening {

    WebDriver driver;
    String URL= "https://www.google.ca/";

    @BeforeMethod
    public void setbrowser()throws Exception{
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\theko\\Desktop\\Firefox driver\\geckodriver.exe");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openWindow() throws InterruptedException {

       // driver.get(URL);
        driver.navigate().to(URL);
        Thread.sleep(3000);
        String title= driver.getTitle();
        System.out.println("Tile is:" + title);
        Assert.assertEquals("Google", title);

        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURl is:" + currentURL);
        Assert.assertTrue(currentURL.contains("google.ca"));

        String pageSource= driver.getPageSource();
        System.out.println("pageSource is: " + pageSource);
        Thread.sleep(3000);

    }

    @AfterMethod
    public void closeWindow(){
        driver.close();

    }
}
