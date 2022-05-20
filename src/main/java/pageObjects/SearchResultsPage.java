package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SearchResultsPage {

    private static final By  second_element = By.xpath("//span[@class='rush-component s-latency-cf-section']/div[2]/div[3]");


    /**
     * click on Samasung checkbox to filer the results
     */
    public void clickonSecondresult() {

        $(second_element).shouldBe(Condition.visible).click();
    }

    public void enterhelp() {

       // By.cssSelector(".askSearchInputIngress input").
    }

}
