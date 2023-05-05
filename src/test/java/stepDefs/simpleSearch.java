package stepDefs;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.googleMain;
import utils.driver;

import java.sql.Driver;

public class simpleSearch {

    googleMain gMain=new googleMain();

    @When("user searches for surhay")
    public void user_searches_for_surhay() {

        driver.getDriver().get("https://www.google.com/");

        gMain.searchBox.sendKeys("surhay"+ Keys.ENTER);

    }

    @When("test fails")
    public void test_fails() {
        Assert.fail();
    }

    @When("user can see surhay on the title")
    public void user_can_see_surhay_on_the_title() {
       Assert.assertTrue( driver.getDriver().getTitle().startsWith("surhay"));
    }


}
