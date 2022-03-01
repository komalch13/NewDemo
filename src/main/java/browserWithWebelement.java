import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class browserWithWebelement {

    WebDriver driver;
    String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

    @BeforeMethod
    public void browserOpen()throws Exception{

        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\theko\\Desktop\\Firefox driver\\geckodriver.exe");
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
       // driver= new ChromeDriver();
        driver= new ChromeDriver();
        //driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testagain() throws InterruptedException {

        driver.get(URL);
        Thread.sleep(3000);
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.click();
        username.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement userpassword= driver.findElement(By.id("txtPassword"));
        userpassword.click();
        userpassword.sendKeys("admin123");
        Thread.sleep(2000);

        WebElement clicksubmit= driver.findElement(By.id("btnLogin"));
        clicksubmit.click();
        Thread.sleep(3000);


        String tiltle= driver.getTitle();
        System.out.println("Tiltle is:" + tiltle);
        Assert.assertEquals("OrangeHRM", "OrangeHRM", "is not right title");

        String currentUrl= driver.getCurrentUrl();
        Thread.sleep(2000);
        System.out.println(" currentUrl is: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("orangehrmlive"));
        Thread.sleep(2000);

        WebElement Welcomemessage= driver.findElement(By.id("welcome"));
        String WelcomeText= Welcomemessage.getText();
        Assert.assertTrue(Welcomemessage.isDisplayed());
        System.out.println("WelcomeText is : " + WelcomeText);
        Thread.sleep(2000);
         String pagesource= driver.getPageSource();
        System.out.println ( " pagesource is : " + pagesource);


    }

    @AfterMethod
    public void closeall(){
        driver.close();
    }
}
