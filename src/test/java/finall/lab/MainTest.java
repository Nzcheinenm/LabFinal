package finall.lab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {

        private WebDriver driver;

        @Test
        public void mainTest() {

                new TestToPageLogin(driver).login("test1", "test1");
                new TestToPageTwo(driver).flightFinder();
                new TestToPageThree(driver).choise();
                new TestToPageFour(driver)
                    .buyFlight()
                    .buyFlightPassangersTwo()
                    .billingAdress()
                    .deliveryAdress()
                    .clickToPurchase();
                new TestToPageFinal(driver).goToHome();
        }


        @Before
        public void beforeMain() {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
                DriverEvent driverHand = new DriverEvent();
                eventDriver.register(driverHand);
                driver = eventDriver;

                driver.get("http://newtours.demoaut.com/");
                driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        }

        @After
        public void afterMain() {
                driver.quit();
        }
}
