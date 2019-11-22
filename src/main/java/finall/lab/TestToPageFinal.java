package finall.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestToPageFinal {


        private WebDriver driver;

        TestToPageFinal(WebDriver driver) {
                PageFactory.initElements(driver,this);
                this.driver = driver;
        }

        @FindBy(xpath = ".//tbody//td[@align]//a[contains(@href, 'welcome')]")
        private
        WebElement backToHome;



        void goToHome() {

                final WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.elementToBeClickable(backToHome)).click();

        }

}
