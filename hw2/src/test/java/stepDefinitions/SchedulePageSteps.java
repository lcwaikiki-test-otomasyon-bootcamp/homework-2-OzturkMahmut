package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SchedulePage;
import util.DriverFactory;

public class SchedulePageSteps {

    WebDriver driver = DriverFactory.getDriver();
    SchedulePage schedulePage = new SchedulePage(driver);

    @Then("User should see Schedule Page")
    public void userShouldSeeSchedulePage() {
        schedulePage.checkContainerTitle();
    }


    @When("User clicks Next Round button")
    public void userClicksNextRoundButton() {
        schedulePage.clickNextRoundButton();
    }

    @Then("User should see Next Round hero container")
    public void userShouldSeeNextRoundHeroContainer() {
        schedulePage.checkNextRoundHeroContainer();
    }

    @When("User clicks Next Round hero container")
    public void userClicksNextRoundHeroContainer() {
        schedulePage.clickNextRoundHeroContainer();
    }

    @Then("User should see Race Page")
    public void userShouldSeeRacePage() {
        schedulePage.checkRaceHubTitle();
    }

    @Then("User should see Schedule Info in local time")
    public void userShouldSeeScheduleInfoInLocalTime() {
        schedulePage.checkWeekendTimeTable();
    }
}
