package BasicFrameworkPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunction {


    String url= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
    public WebDriver driver;

    @FindBy(xpath= "//input[@id= 'txtUsername']")
    WebElement login;

    @FindBy(xpath = "//input[@name= 'txtPassword']")
            WebElement password;

    @FindBy(xpath = "//input[@id= 'btnLogin']")
    WebElement hitSubmit;



    public LoginFunction(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);

    }

    public LoginFunction launchWebsite(){
        driver.get(url);
        return this;
    }

    public void enterUsername(String username){
        login.sendKeys(username);
    }

    public void enterPassword(String passwordenter){
        password.sendKeys(passwordenter);
    }

    public void enterlogin(){
        hitSubmit.click();
    }
}
