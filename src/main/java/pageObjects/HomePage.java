package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public WebDriver driver;



    private static final By hamburger= By.id("nav-hamburger-menu");
    private static final By tv_appliances_electronics_link = By.xpath("//*[text()='TV, Appliances, Electronics']");
    private static final By televisions_link    = By.xpath("//*[text()='Televisions']");


    /**
     * click on Hamburger Button
     */
    public void clickHamburgerButton() {

        $(hamburger).shouldBe(Condition.visible).click();
    }

    /**
     * click on Tv Appliances Electronics Link
     */
    public void clickTvAppliancesElectronicsLink() {

        $(tv_appliances_electronics_link).scrollIntoView(true).shouldBe(Condition.visible).click();
    }

    /**
     * click on Tv Appliances Electronics Link
     */
    public void clickTelevisonsLink() {

        $(televisions_link).scrollIntoView(true).shouldBe(Condition.visible).click();
    }
}
