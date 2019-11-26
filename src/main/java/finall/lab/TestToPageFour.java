package finall.lab;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс для формы покупки.
 */
class TestToPageFour {

        /**
         * Имя пассажира покупающего.
         */
        private static final String FIRST_NAME = "Ivan";
        /**
         * Фамилия пассажира покупающего.
         */
        private static final String LAST_NAME = "Ivanov";
        /**
         * Номер карты пассажира покупающего.
         */
        private static final String CARD_NUMBER = "3400993454993400";

        /**
         * Имя второго пассажира.
         */
        private static final String FIRST_NAME_PASS = "Tanya";
        /**
         * Фамилия второго пассажира.
         */
        private static final String LAST_NAME_PASS = "Ivanova";

        /**
         * Адрес плательщика.
         */
        private static final String ADRESS_BILL = "Kudryavceva, 56";
        private static final String ADRESS_BILL_2 = "3k";
        private static final String CITY_BILL = "Ryazan";
        private static final String STATE_BILL = "Ryazan state";
        private static final String CODE_BILL = "390000";
        private static final String COUNTRY_BIL = "RUSSIA";

        /**
         * Адрес отправки.
         */
        private static final String ADRESS_DEL = "Leninckogo, 26";
        private static final String ADRESS_DEL_2 = "45";
        private static final String CITY_DEL = "Ryazan";
        private static final String STATE_DEL = "Ryazan state";
        private static final String CODE_DEL = "390000";
        private static final String COUNTRY_DEL = "RUSSIA";

        /**
         * Инициализация драйвера.
         */
        private WebDriver driver;

        @FindBy(xpath = ".//input[@name='passFirst0']")
        private
        WebElement passangersFirstName;
        @FindBy(xpath = ".//input[@name='passLast0']")
        private
        WebElement passangersLastName;
        @FindBy(xpath = ".//input[@name='passFirst1']")
        private
        WebElement passangersFirstName2;
        @FindBy(xpath = ".//input[@name='passLast1']")
        private
        WebElement passangersLastName2;
        @FindBy(xpath = ".//input[@name='creditnumber']")
        private
        WebElement creditCard;
        @FindBy(xpath = ".//input[@name='buyFlights']")
        private
        WebElement buyFligths;
        @FindBy(xpath = ".//input[@name='cc_frst_name']")
        private
        WebElement nameCard;
        @FindBy(xpath = ".//input[@name='billAddress1']")
        private
        WebElement billingAdress;
        @FindBy(xpath = ".//input[@name='billAddress2']")
        private
        WebElement billingAdress2;
        @FindBy(xpath = ".//input[@name='billCity']")
        private
        WebElement billingCity;
        @FindBy(xpath = ".//input[@name='billState']")
        private
        WebElement billingState;
        @FindBy(xpath = ".//input[@name='billZip']")
        private
        WebElement billingCode;
        @FindBy(xpath = ".//select[@name='billCountry']"
            + "//option[contains(text(),'" + COUNTRY_BIL + "')]")
        private
        WebElement billingCountry;
        @FindBy(xpath = ".//input[@name='delAddress1']")
        private
        WebElement deliveryAdress;
        @FindBy(xpath = ".//input[@name='delAddress2']")
        private
        WebElement deliveryAdress2;
        @FindBy(xpath = ".//input[@name='delCity']")
        private
        WebElement deliveryCity;
        @FindBy(xpath = ".//input[@name='delState']")
        private
        WebElement deliveryState;
        @FindBy(xpath = ".//input[@name='delZip']")
        private
        WebElement deliveryCode;
        @FindBy(xpath = ".//select[@name='delCountry']"
            + "//option[contains(text(),'" + COUNTRY_DEL + "')]")
        private
        WebElement deliveryCountry;

        TestToPageFour(final WebDriver driverMethod) {
                PageFactory.initElements(driverMethod, this);
                this.driver = driverMethod;
        }

        private WebElement waitingForVisibly(final WebElement element) {
                final WebDriverWait wait = new WebDriverWait(driver, 10);
                return wait.until(ExpectedConditions.visibilityOf(element));
        }

        private WebElement waitingForClick(final WebElement element) {
                final WebDriverWait wait =
                    new WebDriverWait(driver, 10);
                return wait.until(ExpectedConditions
                    .elementToBeClickable(element));
        }

        TestToPageFour buyFlight() {

                waitingForVisibly(passangersFirstName).sendKeys(FIRST_NAME);
                waitingForVisibly(passangersLastName).sendKeys(LAST_NAME);
                waitingForVisibly(creditCard).sendKeys(CARD_NUMBER);
                waitingForVisibly(nameCard).sendKeys(FIRST_NAME);
                return this;
        }

        TestToPageFour buyFlightPassangersTwo() {

                waitingForVisibly(passangersFirstName2)
                    .sendKeys(FIRST_NAME_PASS);
                waitingForVisibly(passangersLastName2)
                    .sendKeys(LAST_NAME_PASS);
                return this;
        }

        TestToPageFour billingAdress() {

                waitingForVisibly(billingAdress).clear();
                waitingForVisibly(billingAdress).sendKeys(ADRESS_BILL);
                waitingForVisibly(billingAdress2).clear();
                waitingForVisibly(billingAdress2).sendKeys(ADRESS_BILL_2);
                waitingForVisibly(billingCity).clear();
                waitingForVisibly(billingCity).sendKeys(CITY_BILL);
                waitingForVisibly(billingState).clear();
                waitingForVisibly(billingState).sendKeys(STATE_BILL);
                waitingForVisibly(billingCode).clear();
                waitingForVisibly(billingCode).sendKeys(CODE_BILL);
                waitingForClick(billingCountry).click();
                return this;
        }

        TestToPageFour deliveryAdress() {

                waitingForVisibly(deliveryAdress).clear();
                waitingForVisibly(deliveryAdress).sendKeys(ADRESS_DEL);
                waitingForVisibly(deliveryAdress2).clear();
                waitingForVisibly(deliveryAdress2).sendKeys(ADRESS_DEL_2);
                waitingForVisibly(deliveryCity).clear();
                waitingForVisibly(deliveryCity).sendKeys(CITY_DEL);
                waitingForVisibly(deliveryState).clear();
                waitingForVisibly(deliveryState).sendKeys(STATE_DEL);
                waitingForVisibly(deliveryCode).clear();
                waitingForVisibly(deliveryCode).sendKeys(CODE_DEL);
                waitingForClick(deliveryCountry).click();
                return this;
        }

        void clickToPurchase() {
                try {
                        final WebDriverWait wait =
                            new WebDriverWait(driver, 10);
                        wait.until(ExpectedConditions
                            .elementToBeClickable(buyFligths)).click();
                        Alert alert = wait
                            .until(ExpectedConditions.alertIsPresent());
                        alert.accept();
                        System.out.println("Всплывающее "
                            + "окно закрыто");
                } catch (Throwable e) {
                        System.err.println("Вспывающее "
                            + "окно в ожидании. "
                            + e.getMessage());
                } finally {
                        buyFligths.click();
                }
        }
}
