package tests.home_page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;

public class HomePageTests extends TestBase {

    @BeforeMethod
    public void initTest(){

    }


    @Test
    public void test1(){
        System.out.println("This is static ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
