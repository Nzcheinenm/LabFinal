package finall.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestToPageFour {


        private WebDriver driver;

        TestToPageFour(WebDriver driver) {
                PageFactory.initElements(driver,this);
                this.driver = driver;
        }


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



        TestToPageFour buyFlight(String firstName, String secondName,String firstName2, String secondName2, String cardNumber) {

                final WebDriverWait wait = new WebDriverWait(driver, 5);

                wait.until(ExpectedConditions.visibilityOf(passangersFirstName)).sendKeys(firstName);
                wait.until(ExpectedConditions.visibilityOf(passangersLastName)).sendKeys(secondName);
                wait.until(ExpectedConditions.visibilityOf(passangersFirstName2)).sendKeys(firstName2);
                wait.until(ExpectedConditions.visibilityOf(passangersLastName2)).sendKeys(secondName2);
                wait.until(ExpectedConditions.visibilityOf(creditCard)).sendKeys(cardNumber);
                wait.until(ExpectedConditions.elementToBeClickable(buyFligths)).click();
                return this;
        }

}
