import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_1 {
    WebDriver driver;
    @BeforeTest
    public void first() {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverSingleton.getInstance();

    }
    @Test
    public void first2() {
        driver.manage().window().setSize(new Dimension(1000, 1000));
        driver.get("https://store.steampowered.com/about/");
    }

        // не работает
        //String m = driver.findElement (By.xpath ("//div[@id=\"about_greeting\"]/div[3]/div[2]/text()")).getText();
        //System.out.println(m);
        //int i = Integer.parseInt (m);


// now //div[@id="about_greeting"]/div[3]/div[2]/text()
// onl //div[@id="about_greeting"]/div[3]/div[1]/text()

    @AfterTest
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
