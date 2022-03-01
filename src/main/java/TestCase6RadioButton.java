import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase6RadioButton {

    WebDriver driver;
    String url= "https://demoqa.com/radio-button";

    @BeforeMethod
    public void UseThisFirst(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);

    }

    @Test

    public void checkRadioClick() throws InterruptedException {


        driver.get(url);
        Thread.sleep(3000);
        //testRadioButton("Yes");
        clickRadioButton("yes");

        Thread.sleep(3000);
        //testRadioButton("Impressive");
        clickRadioButton("impressive");



    }

    public void clickRadioButton(String option){
        WebElement radioButton=null;

        if(option.equalsIgnoreCase("yes")){
            radioButton=driver.findElement(By.xpath("//label[@for = 'yesRadio']"));

        }else if(option.equalsIgnoreCase("Impressive")){
            radioButton=driver.findElement(By.xpath("//label[@for = 'impressiveRadio']"));

        }
        radioButton.click();

        //public void testRadioButton(String option){

       // WebElement radioButton= driver.findElement(By.xpath("//label[@for=' " + option + " Radio']"));
         // WebElement radioButton=driver.findElement(By.xpath("//label[@for = '" + option +" Radio']"));
        // radioButton.click();
      //  radioButton.click();
        // form generic string "option" bcz if there are many radio buttons thne you just need  to write the options
        // on pagefactory method you can not create string but here in page object model you can create string and use it in different way

    }

    @AfterMethod
    public void closeAll(){
        driver.close();
    }


}
