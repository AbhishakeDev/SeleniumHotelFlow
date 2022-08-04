package Steps;

import Actions.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;

public class HotelSteps extends com.quinbay.qa.training.base.BaseClass {
    public HotelSteps() {
        super();//public BaseClass(){    (here we are calling this base class constructor by super keyword)
        //driverClass = DriverClass.getInstanceOfDriverClass();
        // }
    }

    @Before
    public void setup() {
        driver = super.getDriver();
    }

    @Given("open the homepage")
    public void openTheHomepage() throws InterruptedException, AWTException {
        HomePageActions homeactions = new HomePageActions(driver);
        homeactions.navigateToHomePage();
//        driver.switchTo().frame(3);
//        driver.findElement(By.xpath("//a[contains(@id,'webklipper')]")).click();
//        driver.switchTo().frame(1);
    }

    @When("click on hotel")
    public void clickOnHotel() throws InterruptedException {
        HomePageActions homeactions = new HomePageActions(driver);
        homeactions.clickHotel();
//        Thread.sleep(5000);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(@id,'hsw_search_button')]"))));
    }

    @And("click on search")
    public void clickOnSearch() throws InterruptedException {
        HomePageActions homeactions = new HomePageActions(driver);
        homeactions.clickOnSearch();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(@id,'hsw_search_button')]"))));
    }

    @And("click on a hotel")
    public void clickOnAHotel() throws InterruptedException {
        ResultsPageActions homeActions = new ResultsPageActions();
        homeActions.clickOnHotel();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),\"HARD ROCK HOTEL GOA\")]"))));
    }

    @And("click on book this now")
    public void clickOnBookThisNow() {
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        System.out.println(newTb);
        HotelPageActions actions = new HotelPageActions();
        actions.clickButton();
    }

    @And("fill details")
    public void fillDetails() throws InterruptedException {
        Thread.sleep(2000);
        PaymentPageAction action = new PaymentPageAction();
        action.clickOnFill();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='First Name']"))));
    }

    @And("click pay now")
    public void clickPayNow() {
        PaymentPageAction actions = new PaymentPageAction();
        actions.clickOnPayNow();
    }

    @Then("Assert pay now")
    public void assertPayNow() throws InterruptedException {
        FinalPageActions action = new FinalPageActions();
        action.assertPayNow();
        Thread.sleep(5000);
    }
}
