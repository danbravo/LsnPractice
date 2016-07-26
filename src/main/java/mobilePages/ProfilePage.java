package mobilePages;

import core.MethodsFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class ProfilePage extends MethodsFactory{
    private By addPhotoBtn = By.cssSelector(".add_photo");
    private By photoInput = By.cssSelector("#upload_file_input");
    private By bullets = By.cssSelector(".bullets li");

    public int getPhotosCount() {
        return driver().findElements(bullets).size();
    }

    @Step
    public void clickAddPhotoButton() {
        click(addPhotoBtn);
    }

    @Step
    public void uploadPhoto(String filePath) {
        driver().findElement(photoInput).sendKeys(filePath);
    }
}
