package finall.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class TestToPageThree {


        private final static String NUMBER_DEPART = "361";
        private final static String NUMBER_RETURN = "631";
        private WebDriver driver;
        @FindBy(xpath = ".//td[@class='frame_action_xrows']//input[contains(@value, '$" + NUMBER_DEPART + "')]")
        private
        WebElement depart;
        @FindBy(xpath = ".//td[@class='frame_action_xrows']//input[contains(@value, '$" + NUMBER_RETURN + "')]")
        private
        WebElement returnPart;
        @FindBy(xpath = ".//input[@name='reserveFlights']")
        private
        WebElement continuePart;

        TestToPageThree(WebDriver driver) {
                PageFactory.initElements(driver, this);
                this.driver = driver;
        }

        void choise() {
                final WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.visibilityOf(depart)).click();
                wait.until(ExpectedConditions.elementToBeClickable(returnPart)).click();
                wait.until(ExpectedConditions.elementToBeClickable(continuePart)).click();
        }
}
