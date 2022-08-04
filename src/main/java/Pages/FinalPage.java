package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalPage {
    @FindBy(xpath = "//span[contains(text(),'pay now')]")
    WebElement pay;

    public void assertPayNow() {
        assert pay.getText().equalsIgnoreCase("pay now");
    }

}
