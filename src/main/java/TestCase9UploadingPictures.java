import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase9UploadingPictures {

    WebDriver driver;
    String url= "https://demoqa.com/upload-download";


@BeforeMethod
    public void Scroll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void uploadPic(){


    }

    @AfterMethod
    public void closeBrowser(){
    driver.close();
    }
}
