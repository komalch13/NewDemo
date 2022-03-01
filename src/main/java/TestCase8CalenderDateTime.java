import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TestCase8CalenderDateTime {

    WebDriver driver;
    String url="https://demoqa.com/date-picker";

    @BeforeMethod
    public void MethodBeforeTest(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        driver=  new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\theko\\OneDrive\\Desktop\\chrome20Jan\\chromedriver.exe");
        //   driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @Test
    public void TestMethod() throws InterruptedException {

        LocalDateTime datetime= LocalDateTime.now();// LocalDateTime is class stored in variable datetime
        String day= String.valueOf(datetime.getDayOfMonth() +5);
        String month= String.valueOf(datetime.getMonth());
        String year= String.valueOf(datetime.getYear()+1); //+1 because we want future date


        String formattedMonth= month.substring(0,1) + month.substring(1).toLowerCase();
        // substring is to extract month, extract character 1 that means it will get 1st character from the mon like January, it will get 1st charact J
        // monthe.substring will concat with month and break tghe first letter
        // there are 2 overloading methods here, one takes start character which is 0 and end character which is 1 and other month.substring takes 1st character and will go till the end automatically. when giving single character will take 1 and go till the end
        //but when you give 2 character then first is start and second is end eh here its 0,1.
        driver.get(url);
        Thread.sleep(3000);
        //driver.navigate().refresh();
        //LocalDateTime local=LocalDateTime.now();
        WebElement textBox= driver.findElement(By.id("datePickerMonthYearInput"));
        textBox.click();
        Thread.sleep(3000);

        WebElement Elementmonth= driver.findElement(By.className("react-datepicker__month-select"));
       WebElement Elementyear= driver.findElement(By.className("react-datepicker__year-select"));
        Select selectmonth= new Select(Elementmonth); // select is a class
        Select selectyear= new Select(Elementyear);

      //  selectmonth.selectByVisibleText("May");
        selectmonth.selectByVisibleText(formattedMonth);
       //selsectyear.selectByVisibleText("2024");
        selectyear.selectByVisibleText(year);
        Thread.sleep(3000);
        clickDayOfTheMonth(day);
        Thread.sleep(3000);

        Thread.sleep(3000);
        clickDayOfTheMonth("13");
        Thread.sleep(3000);

    }

    public void clickDayOfTheMonth(String day){
        List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day') and not(contains(@class, 'outside'))]"));
        for(int i=0; i< elements.size(); i++)
            if(elements.get(i).getText().equalsIgnoreCase(day)){
                elements.get(i).click();
                break;
            }
    }

    @AfterMethod
    public void closeAll(){
        driver.close();
    }
}

