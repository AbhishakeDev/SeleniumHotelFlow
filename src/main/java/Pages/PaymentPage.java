package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement fname;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lname;
    @FindBy(xpath = "//input[@placeholder='Email ID']")
    WebElement email;
    @FindBy(xpath = "//input[@placeholder='Contact Number']")
    WebElement num;
    @FindBy(xpath = "//span[contains(text(),'Enter GST Details')]")
    WebElement gst;
    @FindBy(xpath = "//a[contains(text(),'Pay Now')]")
    WebElement paynow;

    public void clickOnFName() {
        fname.sendKeys("ABC");
    }

    public void clickOnLName() {
        lname.sendKeys("ABCD");
    }

    public void clickOnEmail() {
        email.sendKeys("abhishekt.1181@gmail.com");
    }

    public void clickOnNum() {
        num.sendKeys("9182517812");
    }

    public void clickOnGst() {
        if (gst.isSelected()) {
            gst.click();
        }
    }

    public void clickOnPay() {
        paynow.click();
    }

}
