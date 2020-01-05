import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {
    WebDriver driver;
    public boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");

    @BeforeEach
    public void setUp(){
        if(isWindows){
            System.setProperty("webdriver.chrome.driver","resources/win/chromedriver.exe");
        }else{
            System.setProperty("webdriver.chrome.driver","resources/mac/chromedriver");
        }

        driver = new ChromeDriver();
        driver.get("https://amazon.com");
    }

    @Test
    public void search(){

    }

    @Test
    public void addToCart(){

    }

    @AfterEach
    public void terDown(){
        driver.close();
        driver.quit();
    }
}
