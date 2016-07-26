package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefox {

    public WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
