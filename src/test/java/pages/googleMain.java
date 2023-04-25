package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.driver;

public class googleMain {

    public googleMain(){
        PageFactory.initElements(driver.getDriver(), this);
    }


    @FindBy(name = "q")
    public
    WebElement searchBox;



}
