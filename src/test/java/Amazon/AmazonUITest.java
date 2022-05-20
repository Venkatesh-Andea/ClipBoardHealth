package Amazon;

import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SamsungTvPage;
import pageObjects.SearchResultsPage;
import pageObjects.TelevisionsSearchPage;
import resources.base;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.Matchers.*;

public class AmazonUITest extends base{
    String page_Title = "Samsung 163 cm (65 inches) 4K Ultra HD Smart QLED TV QA65QN90AAKLXL (Black) (2021 Model) : Amazon.in: Electronics";
    String about_This_Item_Text = "Sound: 60 Watts Output | Powerful Speakers with Dolby Digital Plus";
    private HomePage homepage;
    private TelevisionsSearchPage televisionsSearchPage;
    private SearchResultsPage searchResultsPage;
    private SamsungTvPage samsungTvPage;


    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeClass
    public void initialize() throws IOException
    {
        initializeDriver();
        open(prop.getProperty("url"));
        homepage = page(HomePage.class);
        televisionsSearchPage = page(TelevisionsSearchPage.class);
        searchResultsPage = page(SearchResultsPage.class);
        samsungTvPage = page(SamsungTvPage.class);
    }

@Test
    public void filterSamsungTv() throws InterruptedException {
        homepage.clickHamburgerButton();
        homepage.clickTvAppliancesElectronicsLink();
        homepage.clickTelevisonsLink();
        televisionsSearchPage.filterSamsungCheckBox();
        televisionsSearchPage.clickSortByDropdown();
        searchResultsPage.clickonSecondresult();
        switchTo().window(page_Title);
        System.out.println(Selenide.title());
        samsungTvPage.aboutThisItemisDisplayed();
        assertThat("About this item text is not displayed", samsungTvPage.getTextfromAboutThisItem(), containsString(about_This_Item_Text));
        samsungTvPage.printAboutThisItem();

    }


    @AfterClass
    public void teardown() {
        Selenide.closeWebDriver();
    }
}
