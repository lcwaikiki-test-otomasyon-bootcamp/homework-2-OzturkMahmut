package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class SchedulePage {


    By containerTitle = By.cssSelector(".f1-black--xxl.no-margin");
    By nextRoundButton = By.cssSelector(".cta-text-container");
    By nextRoundHeroContainer = By.cssSelector(".col-12.event-hero-wrapper");
    By raceHubTitle = By.cssSelector(".f1-bold--l.f1-uppercase.race-hub--title");
    By weekendTimeTable = By.cssSelector(".f1-race-hub--timetable-listings");
    By ad = By.cssSelector("div .sailthru-overlay-close");

    WebDriver driver;
    ElementHelper helper;

    public SchedulePage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkContainerTitle() {
        helper.presenceElement(containerTitle);
    }

    public void clickNextRoundButton() {
        try { //if pop-up add comes up, close it
            driver.findElement(ad);
            helper.click(ad);
        } catch (NoSuchElementException ignored) {
        }
        helper.click(nextRoundButton);
    }

    public void checkNextRoundHeroContainer() {
        helper.presenceElement(nextRoundHeroContainer);
    }


    public void clickNextRoundHeroContainer() {
        try { //if pop-up add comes up, close it
            driver.findElement(ad);
            helper.click(ad);
        } catch (NoSuchElementException ignored) {
        }
        helper.click(nextRoundHeroContainer);
    }

    public void checkRaceHubTitle() {
        helper.presenceElement(raceHubTitle);
    }

    public void checkWeekendTimeTable() {
        helper.presenceElements(weekendTimeTable);
    }
}
