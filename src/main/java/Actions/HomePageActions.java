package Actions;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
    public HomePage homePage;
    public WebDriver driver;

    public HomePageActions(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);//doubt
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver.get("https://www.makemytrip.com/hotels");
    }

    public void clickHotel() {
        homePage.clickHotel();
    }



    public void clickOnSearch() {
        homePage.clickOnSearch();
    }


}
