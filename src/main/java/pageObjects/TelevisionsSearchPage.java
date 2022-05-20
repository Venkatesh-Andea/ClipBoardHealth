package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;

public class TelevisionsSearchPage {

    private static final By searchtextbox =By.id("twotabsearchtextbox");
    private static final By samsung_filter = By.xpath("//Span[text()='Samsung']");
    private static final By  sortBy_dropdown = By.id("s-result-sort-select");
    private static final By sortBy_dropdown_values = By.cssSelector("#s-result-sort-select option");

    @FindBy(id = "s-result-sort-select")
    private WebElement sortBy;

    /**
     * click on Samasung checkbox to filer the results
     */
    public void filterSamsungCheckBox() {

        $(samsung_filter).parent().find(By.cssSelector(".a-icon-checkbox")).scrollIntoView(true).click();
    }

    /**
     * click on sort by dropdown
     */
    public void clickSortByDropdown() {

            Select dropdown = new Select(sortBy);
        dropdown.selectByVisibleText("Price: High to Low");

    }



}
