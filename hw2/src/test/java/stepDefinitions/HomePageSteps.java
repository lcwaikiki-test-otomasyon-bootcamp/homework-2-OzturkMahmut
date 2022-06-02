package stepDefinitions;

import pages.HomePage;
import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);


    @Given("User is on Home page")
    public void userIsOnHomePage() {
        homePage.checkLogo();
    }


    @When("User clicks Schedule button")
    public void userClicksScheduleButton() {
        homePage.clickScheduleButton();
    }


}
