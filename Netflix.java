import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
    public static void Ids( WebDriver driver) {
        String[] ids = new String[]{"cookie-disclosure-reject", "signIn", "id_userLoginId", "id_password"};
        for (String id : ids) {
            WebElement element = driver.findElement(By.id(id));
            if (id.equals("id_userLoginId"))
            {
                element.sendKeys("test@windowslive.com");
            } 
            else if (id.equals("id_password")) 
            {
                element.sendKeys("tester123456");
            }
            WebElement elements = driver.findElement(By.id(id));
            elements.click();
        }
    }
    public static  void xPath(WebDriver driver) {
        WebElement xpath=driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']"));
        xpath.click();
    }
    
        public static void main (String[]args){
            WebDriverManager.chromedriver();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.netflix.com/tr/");
            Ids(driver);
            xPath(driver);
        }
}