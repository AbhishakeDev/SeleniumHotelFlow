package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage {

    @FindBy(xpath = "//span[contains(text(),\"HARD ROCK HOTEL GOA\")]")
    WebElement HotelCard;


    public void clickHotelCard() {
        HotelCard.click();
    }


}
