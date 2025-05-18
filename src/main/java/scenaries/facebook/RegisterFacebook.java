package scenaries.facebook;

import entities.facebook.ValidationSignIn;
import org.openqa.selenium.WebDriver;
import resources.utils.GlobalResources;

public class RegisterFacebook {

    public static WebDriver driver;

    public RegisterFacebook(WebDriver _driver) {
        driver = _driver;
    }

    public void SignInFacebookConfirm(ValidationSignIn validationSignIn) { //Al hacer lo de public static WebDriver ya no sería necesario pedir el driver

        GlobalResources globalResources = new GlobalResources(driver);

        String buttonRegister = "//*[@data-testid='open-registration-form-button' and @href='/r.php?entry_point=login']";
        String inputName = "//*[@name='firstname']";
        String inputLastName = "//*[@name='lastname']";
        String selectGender = "//*[@value='2' and @id='sex' and @name='sex']";
        String inputEmail = "//*[@name='reg_email__']";
        String inputPassword = "//*[@name='reg_passwd__']";

        globalResources.Click(buttonRegister);
        globalResources.Write(inputName,validationSignIn.firstName);
        globalResources.Write(inputLastName, validationSignIn.lastName);
        globalResources.Click(selectGender);
        globalResources.Write(inputEmail, validationSignIn.email);
        globalResources.Write(inputPassword, validationSignIn.password);

    }
}
