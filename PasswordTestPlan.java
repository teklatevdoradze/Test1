import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PasswordTestPlan {
    WebDriver driver;

    @Before
    public void setup()  {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]")).click();
        driver.findElement(By.id("email")).sendKeys("ttekla.tevdoradze@gmail.com");
        driver.findElement(By.id("form_submit")).click();
        driver.quit();
    }
}