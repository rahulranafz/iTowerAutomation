package steps;

import page.LoginPage;

/**
 * Created by rahulrana on 18-04-2018.
 */
public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    public void loginWithValidCredentials(){
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
    }
}
