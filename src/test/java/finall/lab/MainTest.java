package finall.lab;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {

        private WebDriver driver;

        @Test
        public void mainTest() {

                new TestToPageOne(driver).login("test1","test1");
                new TestToPageTwo(driver).flightFinder();
                new TestToPageThree(driver).choise();
                new TestToPageFour(driver).buyFlight("Ivan","Ivanov","23232323");
        }


        @Before
        public void beforeMain() {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
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
