package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(.,'Oscar')]")
    WebElement homePageLink;
    @FindBy(id = "login_link")
    WebElement loginRegistrationPage;
    @FindBy(xpath = "//div[@class='alertinner wicon']")
    WebElement massageSuccessReg;
    @FindBy(xpath = "//div[contains(text(),'Welcome back')]")
    WebElement massageSuccessLogin;


    @FindBy (id = "id_q")
    WebElement searchField;
    @FindBy (xpath = "//input[@class='btn btn-default']")
    WebElement searchButton;

    @FindBy (xpath = "//h1[contains(.,'Products matching ')]")
    WebElement searchResult;

    @FindBy (id = "logout_link")
    WebElement logout;

    @FindBy (xpath = "//form//p[contains(.,'Found 0 results.')]")
    WebElement formResult;

    public boolean homeLinkIsVisible() {
        return homePageLink.isDisplayed();
    }

    public void openLoginRegForm() {
        should(loginRegistrationPage, 20);
        loginRegistrationPage.click();
    }

    public boolean registerSuccessMassageIsDsplayed() {
         waitUntilElementInVisible(massageSuccessReg,50);
        return massageSuccessReg.isDisplayed();

    }
    public boolean loginSuccessMassageIsDiplayed() {
        //waitUntilElementInVisible(massageSuccessLogin,30);
        return massageSuccessLogin.isDisplayed();

    }

    public void fillFieldSearch(String product) {
     inputText(searchField,product);
    }

    public void clickBTNsearch() {
        searchButton.click();
    }

    public boolean searchResultTextIsDisplayed() {
        waitUntilElementVisible(searchResult,30);
        return searchResult.isDisplayed();
    }

    public void logOut() {
        waitUntilElementVisible(logout,30);
        logout.click();
    }

    public boolean isLogOutPresent() {
        waitUntilElementVisible(logout,30);
        return logout.isDisplayed();
    }

    public boolean formResultIsDisplayed() {
        return formResult.isDisplayed();
    }
}
