package mobilePages;

import core.MethodsFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class IndexPage extends MethodsFactory{
    String url = "http://m.kismia.com/";
    private By emailFld = By.name("email");
    private By passFld = By.name("password");
    private By submitBtn = By.cssSelector("[type='submit']");

    @Step
    public void typeEmail(String email) {
        type(emailFld, email);
    }

    @Step
    public void typePass(String pass) {
        type(passFld, pass);
    }

    @Step
    public void clickSubmit() {
        driver().findElement(submitBtn).click();
    }

    @Step
    public void logIn(String email, String pass) {
        typeEmail(email);
        typePass(pass);
        clickSubmit();
    }
}
