package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class HomePage {

    By logo = By.cssSelector("[id=primaryNav] .logo");
    By scheduleButton = By.cssSelector(".primary-links .expandable .nav-mainlink[href=\"/en/racing/2022.html\"]");
    By cookiesConsentButton = By.id("truste-consent-button");
    By ad = By.cssSelector("div .sailthru-overlay-close");


    WebDriver driver;
    ElementHelper helper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkLogo() {
        helper.presenceElement(logo);
        driver.findElement(cookiesConsentButton).click();
    }

    public void clickScheduleButton() {
        try {   //if pop-up add comes up, close it
            driver.findElement(ad);
            helper.click(ad);
        } catch (NoSuchElementException ignored) {
        }
        helper.click(scheduleButton);
    }
}





