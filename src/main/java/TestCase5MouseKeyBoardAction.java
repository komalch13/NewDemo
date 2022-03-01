import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase5MouseKeyBoardAction {

    WebDriver driver;
    String url="https://demoqa.com/menu";

    @BeforeMethod
    public void testMouseAction(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);

    }

    @Test
    public void testMenuAction() throws InterruptedException {
        driver.get(url);
        WebElement Menu= driver.findElement(By.linkText("Main Item 2"));
       // Menu.click();


        Actions performactionclass = new Actions(driver);  // Action is a class that will perform action.
        performactionclass.moveToElement(Menu).build().perform();
        Thread.sleep(2000);

        WebElement goToSubList= driver.findElement(By.partialLinkText("SUB SUB LIST »"));
        performactionclass.moveToElement(goToSubList).build().perform();
        Thread.sleep(3000);

    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demoqa.com/dragabble");
        WebElement drag= driver.findElement(By.id("draggableExample-tab-axisRestriction"));
        drag.click();

        WebElement xAxis= driver.findElement(By.id("restrictedX"));
        WebElement yAxis= driver.findElement(By.id("restrictedY"));

        Actions performAction=new Actions(driver);
        //performAction.dragAndDrop(xAxis,yAxis).build().perform();
        performAction= performAction.clickAndHold(xAxis);
        performAction= performAction.moveToElement(yAxis);
        performAction=performAction.release();
        performAction.build().perform();
        Thread.sleep(3000);


    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();


    }
}
