import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.*;

public class BaseTest {


    public void beforeTest(){
        System.out.println("Before test");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("After test");
    }

}
