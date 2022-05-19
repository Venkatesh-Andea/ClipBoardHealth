package Amazon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import resources.base;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import java.io.IOException;

public class AmazonUITest extends base{
    private HomePage homepage;

    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initialize() throws IOException
    {
        driver =initializeDriver();
        open(prop.getProperty("url"));

        homepage = page(HomePage.class);
    }

@Test
    public void addMobile() throws InterruptedException {
        homepage.clickHamburgerButton();
        homepage.clickTvAppliancesElectronicsLink();
        Thread.sleep(5000);
        homepage.clickTelevisonsLink();
        driver.close();

}

}
