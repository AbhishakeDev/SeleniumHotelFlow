package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    @FindBy(xpath = "//a[contains(@href,'https://www.makemytrip.com/hotels/')]")
    WebElement hotels;

    @FindBy(xpath = "//button[@class=\"primaryBtn font24 latoBold widgetSearchBtn\"]")
    WebElement Search;


    public void clickOnSearch() {
        Search.click();
    }



    public void clickHotel() {
        hotels.click();
    }

}
