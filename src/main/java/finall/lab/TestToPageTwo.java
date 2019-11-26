package finall.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс для страницы подбора билетов.
 */
class TestToPageTwo {

        /**
         * Количество человек.
         */
        private static final String PASSENGERS = "2";
        /**
         * День отправления.
         */
        private static final String DEPART_DAY = "2";
        /**
         * Месяц отправления.
         */
        private static final String DEPART_MONTH = "10";
        /**
         * Город отправления.
         */
        private static final String DEPART_PLACE = "Paris";
        /**
         * День обратного отправления.
         */
        private static final String ARRIV_DAY = "2";
        /**
         * Месяц обратного отправления.
         */
        private static final String ARRIV_MONTH = "4";
        /**
         * Город обратного отправления.
         */
        private static final String ARRIV_PLACE = "New York";
        /**
         * Класс билета.
         */
        private static final String SERVICE_CLASS = "Business"; // Coach / First
        /**
         * Авиалинии.
         */
        private static final String AIRLINE = "2";

        /**
         * Инициализация драйвера.
         */
        private WebDriver driver;

        @FindBy(xpath = ".//input[@value='roundtrip']")
        private
        WebElement roundTrip;
        @FindBy(xpath = ".//input[@value='oneway']")
        private
        WebElement oneWay;
        @FindBy(xpath = ".//select[@name='passCount']/option["
            + PASSENGERS + "]")
        private
        WebElement passengers;
        @FindBy(xpath = ".//select[@name='fromPort']/option[@value='"
            + DEPART_PLACE + "']")
        private
        WebElement departingFrom;
        @FindBy(xpath = ".//select[@name='fromMonth']/option[@value='"
            + DEPART_MONTH + "']")
        private
        WebElement departingFromMonth;
        @FindBy(xpath = ".//select[@name='fromDay']/option[@value='"
            + DEPART_DAY + "']")
        private
        WebElement departingFromDay;
        @FindBy(xpath = ".//select[@name='toPort']/option[@value='"
            + ARRIV_PLACE + "']")
        private
        WebElement arrivingFrom;
        @FindBy(xpath = ".//select[@name='toMonth']/option[@value='"
            + ARRIV_MONTH + "']")
        private
        WebElement arrivingFromMonth;
        @FindBy(xpath = ".//select[@name='toDay']/option[@value='"
            + ARRIV_DAY + "']")
        private
        WebElement arrivingFromDay;
        @FindBy(xpath = ".//input[@value='" + SERVICE_CLASS + "']")
        private
        WebElement serviceClass;
        @FindBy(xpath = ".//select[@name='airline']/option[" + AIRLINE + "]")
        private
        WebElement airline;
        @FindBy(xpath = ".//input[@name='findFlights']")
        private
        WebElement findFlights;

        TestToPageTwo(final WebDriver driverMethod) {
                PageFactory.initElements(driverMethod, this);
                this.driver = driverMethod;
        }
        private WebElement waiting(final WebElement element) {
                final WebDriverWait wait = new WebDriverWait(driver,
                    10);
                return wait.until(ExpectedConditions
                    .elementToBeClickable(element));
        }

        void flightFinder() {

                waiting(roundTrip).click();
                waiting(passengers).click();
                waiting(departingFrom).click();
                waiting(departingFromDay).click();
                waiting(departingFromMonth).click();
                waiting(arrivingFrom).click();
                waiting(arrivingFromDay).click();
                waiting(arrivingFromMonth).click();
                waiting(serviceClass).click();
                waiting(airline).click();
                waiting(findFlights).click();
        }

}

