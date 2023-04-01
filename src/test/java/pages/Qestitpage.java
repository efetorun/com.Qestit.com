package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Qestitpage {
    public Qestitpage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//img[@class='logoImage logoImage--initial']")
    public WebElement mainTitle;

    @FindBy(xpath = "//span[text()='DE']")
    public WebElement language;

    @FindBy(xpath = "//span[contains(text(),'FR')]")
    public WebElement fransozisch;

    @FindBy(xpath = "//h1[@class='sw-hero__headline color-accent']")
    public WebElement textFransozisch;
}
