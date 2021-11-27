import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeTest {

    WebDriver driver = WebDriverSingleton.getInstance();

    @BeforeTest
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterTest
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}