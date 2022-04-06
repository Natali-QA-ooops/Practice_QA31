package tests.user;

import Models.User;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginRegistrationPage;
import tests.TestBase;

public class LoginTests extends TestBase {
    LoginRegistrationPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void initTest() {
        loginPage = PageFactory.initElements(driver, LoginRegistrationPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void loginSuccessTest() {
        homePage.openLoginRegForm();
        Assert.assertTrue(loginPage.loginFormIsDisplayed());
        loginPage.fillLoginForm(User.builder().email("zaitsevaooops2022@gmail.com").password("ZPthgievRi295nu").build());
        loginPage.clickBTNLogIn();
        Assert.assertTrue(homePage.loginSuccessMassageIsDiplayed());
        homePage.logOut();
    }


    @Test   //Registered user can't login with incorrect email and valid password
    public void wrongEmailValidPassTest() {
        homePage.openLoginRegForm();
        Assert.assertTrue(loginPage.loginFormIsDisplayed());
        loginPage.fillLoginForm(User.builder().email("zaitsevaooops2022@gmail").password("ZPthgievRi295nu").build());
        loginPage.clickBTNLogIn();
        Assert.assertTrue(loginPage.allertIsDisplayed());
        Assert.assertTrue(loginPage.massageErrorIsDisplaeyd());
    }


    @Test   //Registered user can't login with incorrect password and valid email
    public void wrongPasswValidEmailTest(){
        homePage.openLoginRegForm();
        Assert.assertTrue(loginPage.loginFormIsDisplayed());
        loginPage.fillLoginForm(User.builder().email("zaitsevaooops2022@gmail").password("ZPthgie").build());
        loginPage.clickBTNLogIn();
        Assert.assertTrue(loginPage.allertIsDisplayed());
        Assert.assertTrue(loginPage.massageErrorIsDisplaeyd());
    }


}
