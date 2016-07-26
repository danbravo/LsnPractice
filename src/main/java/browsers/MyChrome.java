package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChrome {

    public WebDriver getDriver() {
        return new ChromeDriver();
    }
}
