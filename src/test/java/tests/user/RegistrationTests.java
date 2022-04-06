package tests.user;

import Models.User;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginRegistrationPage;
import tests.TestBase;

public class RegistrationTests extends TestBase {

    HomePage homePage;
    LoginRegistrationPage loginPage;
    //String email = generateRandomEmail(9);
    //String email = "tortuga_yohoho@gmail.com";
    //String password = "uyt123498";


    @BeforeMethod
    public void initTest() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginRegistrationPage.class);
    }

    @Test
    public void registrationPositiveTest() {
        homePage.openLoginRegForm();
        Assert.assertTrue(loginPage.loginRegisteredFormIsDisplayed());
        loginPage.fillRegisteredForm(User.builder().email("veliadorfa41@gmail.com").password("veli98766").confirmPassw("veli98766").build());
//        loginPage.fillEmail(User.builder().email("velliadorfa@gmail.com").build());
//        loginPage.fillPass(User.builder().password("veli12356").build());
//        loginPage.fillConfirmPassw(password);
        loginPage.clickBTNRagister();
        Assert.assertTrue(homePage.registerSuccessMassageIsDsplayed());


    }

}
