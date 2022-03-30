package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setDriver(){

        driver = new ChromeDriver();
        //driver.navigate().to("http://selenium1py.pythonanywhere.com/en-gb/");
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
