package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Qestitpage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QestitStepdefinitions {
Qestitpage qestitpage = new Qestitpage();
Actions actions=new Actions(Driver.getDriver());
    @Given ("Benutzer geht zu url")
    public void benutzer_geht_zu_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("Bestätigt, dass die Url zugänglich ist")
    public void bestätigt_dass_die_url_zugänglich_ist() {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qestit.com/de/";
        assertEquals(expectedUrl,actualUrl);
        Driver.quitDriver();

    }
    @Given("Bestätigt, dass mainTitle die WebSeite erneuet")
    public void bestätigt_dass_main_title_die_web_seite_erneuet() {
    qestitpage.mainTitle.click();
    String expectedTitle="Hi, we are Qestit! - QESTIT - quality assurance, software testing, consulting and outsourcing";
    String actualTitle=Driver.getDriver().getTitle();
    assertEquals(expectedTitle,actualTitle);
    }
    @Then("Benutzer quit Driver")
    public void benutzer_quit_driver() {
    Driver.quitDriver();
    }
    @Given("Bestätigt, dass Sprache der Webseite geändert werden kann")
    public void bestätigt_dass_sprache_der_webseite_geändert_werden_kann() throws InterruptedException {
    actions.moveToElement(qestitpage.language).perform();
    Thread.sleep(2000);
    qestitpage.fransozisch.click();
    Thread.sleep(2000);
    assertTrue(qestitpage.textFransozisch.isDisplayed());
    }


}
