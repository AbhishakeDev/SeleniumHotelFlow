package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPage {
    @FindBy(xpath = "//button[contains(text(),'BOOK THIS NOW')]")
    WebElement BookButton;

    public void clickBookButton() {
        BookButton.click();
    }

}
