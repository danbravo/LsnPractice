package core;

import browsers.ChromeMobile;
import browsers.MyChrome;
import browsers.MyFirefox;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

public class BrowserFactory extends MethodsFactory {

    @BeforeTest
    @Parameters({"browser"})
    public void setUp(@Optional("CH") String browser) {
        switch (browser) {
            case "CH": driver = new MyChrome().getDriver(); break;
            case "FF": driver = new MyFirefox().getDriver(); break;
            case "MOBILE": driver = new ChromeMobile().getDriver(); break;
            default: driver = new MyChrome().getDriver(); break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        DRIVER.set(driver);
    }

    @AfterTest
    public void tearDown() {
        driver().close();
        driver().quit();
    }
}
