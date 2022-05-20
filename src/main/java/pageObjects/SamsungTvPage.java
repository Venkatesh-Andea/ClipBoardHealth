package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SamsungTvPage {

    private static final By about_this_item = By.cssSelector("#featurebullets_feature_div");


    public boolean aboutThisItemisDisplayed(){
       return $(about_this_item).isDisplayed();
    }


    public String getTextfromAboutThisItem(){
      return  $(about_this_item).shouldBe(Condition.visible).getText();
    }

    public void printAboutThisItem(){
      String about_This_Item =  $(about_this_item).shouldBe(Condition.visible).getText();
      System.out.println(about_This_Item);
    }
}
