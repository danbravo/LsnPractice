package tests;

import core.BrowserFactory;
import mobilePages.IndexPage;
import mobilePages.ProfilePage;
import org.testng.annotations.Test;

public class SomeTest extends BrowserFactory {
    IndexPage indexPage = new IndexPage();
    ProfilePage profilePage = new ProfilePage();

//    @Parameters({"email", "pass"})
    @Test
    public void uploadPhotoTest() throws InterruptedException {
        get("http://m.kismia.com/");
        indexPage.logIn("danbravo1@mail.ru", "2342925dan");

        int beforePhotosCount = profilePage.getPhotosCount();
        System.out.println(beforePhotosCount);
        profilePage.clickAddPhotoButton();
        profilePage.uploadPhoto("D:\\rogatyy-los.jpg");
        int afterPhotosCount = profilePage.getPhotosCount();
        System.out.println(afterPhotosCount);
        Thread.sleep(4000);
    }
}
