package finall.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class TestToPageOne {


        private WebDriver driver;

        TestToPageOne(WebDriver driver) {
                PageFactory.initElements(driver,this);
                this.driver = driver;
        }


        @FindBy(xpath = ".//input[@name='userName']")
        private
        WebElement userName;

        @FindBy(xpath = ".//input[@name='password']")
        private
        WebElement password;

        @FindBy(xpath = ".//input[@name='login']")
        private
        WebElement signIn;


        TestToPageOne login(final String login, final String passwordLog) {

                final WebDriverWait wait = new WebDriverWait(driver, 5);

                wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(login);
                password.sendKeys(passwordLog);
                wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
                return this;
        }


}
