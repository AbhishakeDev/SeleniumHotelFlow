package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

//Singleton Implementation so that all threads of the program uses the same instance of this driver class.


public class DriverClass {
    private static DriverClass driverClass;
    private WebDriver driver;

//    Options for Opening  Brave
//
//     System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
//    ChromeOptions options = new ChromeOptions();
//            options.setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");
//    driver = new ChromeDriver(options);



//    Options for Safari Browser

//WebDriver driver = new SafariDriver();



//    Options for opening for firefox

//    System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/chromedriver");
//            WebDriver driver = new FirefoxDriver();



//  options for opening edge browser

//    System.setProperty("webdriver.edge.driver","src/main/resources/driver/msedgedriver");
//    driver=new EdgeDriver();

    private DriverClass() {
//        String browser = System.getProperty("current.driver");
//        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");
//            options.addArguments("incognito");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/chromedriver");
//            WebDriver driver = new FirefoxDriver();
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        }
    }

    public static DriverClass getInstanceOfDriverClass() {
//        if(driverClass==null){
//            driverClass = new Driver();
//        }
        return new DriverClass();
    }

    public WebDriver getDriver() {
        return driver;
    }
}