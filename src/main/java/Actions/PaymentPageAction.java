package Actions;

import Pages.PaymentPage;

public class PaymentPageAction {
    PaymentPage actions=new PaymentPage();
    public void clickOnFill() {
        actions.clickOnFName();
        actions.clickOnLName();
        actions.clickOnEmail();
        actions.clickOnNum();
        actions.clickOnGst();
    }

    public void clickOnPayNow() {
        actions.clickOnPay();
    }


}
