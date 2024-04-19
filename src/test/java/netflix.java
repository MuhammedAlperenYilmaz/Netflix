import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class netflix {
    private static final String email_Id = ":r0:"; //okuması kolay olsun diye ve değişiklik yapılamasın diye
    private static final String password_Id = ":r3:";
    private static final String[] Ids = {"onetrust-reject-all-handler","signIn", email_Id, password_Id};
    private static final String email = "test@hotmail.com";
    private static final String password = "123456";

    public static void initializedDriver() {
        WebDriverManager.chromedriver();
        WebDriverManager.chromedriver().setup();
    }

    public static void navigateToSite(WebDriver driver) {
        driver.get("https://www.netflix.com/tr/");
    }

    public static void handleIds(WebDriver driver) throws InterruptedException {
        for (String Id : Ids) {
            WebElement element = driver.findElement(By.id(Id));
            if (Id.equals(email_Id)) {
                enterText(element, email);
            } else if (Id.equals(password_Id)) {
                enterText(element, password_Id);
            } else {
                element.click();
            }
        }
    }

    public static void enterText(WebElement element, String text) throws InterruptedException {
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) {
        initializedDriver();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navigateToSite(driver);
        try {
            handleIds(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }

    }
}