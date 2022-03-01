import BasicFrameworkPractice.BaseClass;
import BasicFrameworkPractice.DashboardFunction;
import BasicFrameworkPractice.LoginFunction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestFunction extends BaseClass {



    @Test
    public void testlogin() throws InterruptedException {

        LoginFunction lg= new LoginFunction(driver);
        lg.launchWebsite();
        Thread.sleep(3000);
        lg.enterUsername("Admin");
        lg.enterPassword("admin123");
        Thread.sleep(3000);
        lg.enterlogin();
        Thread.sleep(3000);
        DashboardFunction df= new DashboardFunction(driver);
        df.getWelcomeMessage();
        Thread.sleep(2000);


    }

}
