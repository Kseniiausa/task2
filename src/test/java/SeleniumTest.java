import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SeleniumTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = WebDriverSingleton.getInstance();
        driver.manage().window().setSize(new Dimension(1000, 1000));

        driver.get("https://www.youtube.com/watch?v=8vWTgyoG0nc");
        driver.close();
        driver.quit();
    }

}
