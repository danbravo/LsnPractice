package tests;

import core.BrowserFactory;
import org.testng.annotations.Test;

public class ParallelTestTry extends BrowserFactory{

    @Test
    public void tryIt() throws InterruptedException {
        get("https://kismia.com/");
        Thread.sleep(4000);
    }
}
