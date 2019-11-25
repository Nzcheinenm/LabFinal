package finall.lab;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

class TestToPageFour {


        private WebDriver driver;

        TestToPageFour(WebDriver driver) {
                PageFactory.initElements(driver,this);
                this.driver = driver;
        }

        private final static String COUNTRY = "RUSSIA";

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

        @FindBy(xpath = ".//input[@name='billCity']")
        private
        WebElement billingCity;

        @FindBy(xpath = ".//input[@name='billState']")
        private
        WebElement billingState;

        @FindBy(xpath = ".//input[@name='billZip']")
        private
        WebElement billingCode;

        @FindBy(xpath = ".//select[@name='billCountry']//option[contains(text(),'" + COUNTRY + "')]")
        private
        WebElement billingCountry;


        @FindBy(xpath = ".//input[@name='delAddress1']")
        private
        WebElement deliveryAdress;

        @FindBy(xpath = ".//input[@name='delCity']")
        private
        WebElement deliveryCity;

        @FindBy(xpath = ".//input[@name='delState']")
        private
        WebElement deliveryState;

        @FindBy(xpath = ".//input[@name='delZip']")
        private
        WebElement deliveryCode;

        @FindBy(xpath = ".//select[@name='delCountry']//option[contains(text(),'" + COUNTRY + "')]")
        private
        WebElement deliveryCountry;


        TestToPageFour buyFlight(String firstName, String secondName , String cardNumber) {

                final WebDriverWait wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOf(passangersFirstName)).sendKeys(firstName);
                wait.until(ExpectedConditions.visibilityOf(passangersLastName)).sendKeys(secondName);
                wait.until(ExpectedConditions.visibilityOf(creditCard)).sendKeys(cardNumber);
                wait.until(ExpectedConditions.visibilityOf(nameCard)).sendKeys(firstName);
                return this;
        }

        TestToPageFour buyFlightPassangersTwo(final String firstName, final String secondName) {

                final WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOf(passangersFirstName2)).sendKeys(firstName);
                wait.until(ExpectedConditions.visibilityOf(passangersLastName2)).sendKeys(secondName);
                return this;
        }

        TestToPageFour billingAdress(final String adress, final String city, final String state, final String code) {
                final WebDriverWait wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOf(billingAdress)).clear();
                wait.until(ExpectedConditions.visibilityOf(billingAdress)).sendKeys(adress);
                wait.until(ExpectedConditions.visibilityOf(billingCity)).clear();
                wait.until(ExpectedConditions.visibilityOf(billingCity)).sendKeys(city);
                wait.until(ExpectedConditions.visibilityOf(billingState)).clear();
                wait.until(ExpectedConditions.visibilityOf(billingState)).sendKeys(state);
                wait.until(ExpectedConditions.visibilityOf(billingCode)).clear();
                wait.until(ExpectedConditions.visibilityOf(billingCode)).sendKeys(code);
                wait.until(ExpectedConditions.elementToBeClickable(billingCountry)).click();
                return this;
        }

        TestToPageFour deliveryAdress(String adress, String city, String state, String code) {

                final WebDriverWait wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOf(deliveryAdress)).clear();
                wait.until(ExpectedConditions.visibilityOf(deliveryAdress)).sendKeys(adress);
                wait.until(ExpectedConditions.visibilityOf(deliveryCity)).clear();
                wait.until(ExpectedConditions.visibilityOf(deliveryCity)).sendKeys(city);
                wait.until(ExpectedConditions.visibilityOf(deliveryState)).clear();
                wait.until(ExpectedConditions.visibilityOf(deliveryState)).sendKeys(state);
                wait.until(ExpectedConditions.visibilityOf(deliveryCode)).clear();
                wait.until(ExpectedConditions.visibilityOf(deliveryCode)).sendKeys(code);
                wait.until(ExpectedConditions.elementToBeClickable(deliveryCountry)).click();
                return this;
        }

        void clickToPurchase() {

                try {
                        final WebDriverWait wait = new WebDriverWait(driver, 10);
                        wait.until(ExpectedConditions.elementToBeClickable(buyFligths)).click();
                        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                        alert.accept();
                        System.out.println("Всплывающее окно закрыто");
                } catch (Throwable e) {
                        System.err.println("Вспывающее окно в ожидании. " + e.getMessage());
                } finally {
                        buyFligths.click();
                }
        }



}
