package stepDefs;

import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.googleMain;
import utils.driver;

public class simpleSearch {

    googleMain gMain=new googleMain();

    @When("user searches for surhay")
    public void user_searches_for_surhay() {

        driver.getDriver().get("https://www.google.com/");

        gMain.searchBox.sendKeys("surhay"+ Keys.ENTER);

    }

}
