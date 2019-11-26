package finall.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс для финальной страницы.
 */
class TestToPageFinal {


        /**
         * Инициализация драйвера.
         */
        private WebDriver driver;
        @FindBy(xpath = ".//tbody//td[@align]//a[contains(@href, 'welcome')]")
        private
        WebElement backToHome;

        TestToPageFinal(final WebDriver driverMethod) {
                PageFactory.initElements(driverMethod, this);
                this.driver = driverMethod;
        }

        void goToHome() {

                final WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions
                    .elementToBeClickable(backToHome)).click();

        }

}
