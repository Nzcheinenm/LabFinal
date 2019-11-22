package finall.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

        public class TestToPageTwo {


                WebDriver driver;

                TestToPageTwo(WebDriver driver) {
                        PageFactory.initElements(driver,this);
                        this.driver = driver;
                }

                private final static String DEPART_DAY = "2";
                private final static String DEPART_MONTH = "10";
                private final static String DEPART_PLACE = "Acapulco";

                private final static String ARRIV_DAY = "2";
                private final static String ARRIV_MONTH = "4";
                private final static String ARRIV_PLACE = "New York";

                private final static String PASSENGERS = "2";
                private final static String SERVICE_CLASS = "Business"; // Coach / First
                private final static String AIRLINE = "2";

                @FindBy(xpath = ".//input[@value='roundtrip']")
                WebElement roundTrip;

                @FindBy(xpath = ".//input[@value='oneway']")
                WebElement oneWay;

                @FindBy(xpath = ".//select[@name='passCount']/option[" + PASSENGERS + "]")
                WebElement passengers;

                @FindBy(xpath = ".//select[@name='fromPort']/option[@value='" + DEPART_PLACE + "']")
                WebElement departingFrom;

                @FindBy(xpath = ".//select[@name='fromMonth']/option[@value='" + DEPART_MONTH + "']")
                WebElement departingFromMonth;

                @FindBy(xpath = ".//select[@name='fromDay']/option[@value='" + DEPART_DAY + "']")
                WebElement departingFromDay;

                @FindBy(xpath = ".//select[@name='toPort']/option[@value='" + ARRIV_PLACE + "']")
                WebElement arrivingFrom;

                @FindBy(xpath = ".//select[@name='toMonth']/option[@value='" + ARRIV_MONTH + "']")
                WebElement arrivingFromMonth;

                @FindBy(xpath = ".//select[@name='toDay']/option[@value='" + ARRIV_DAY + "']")
                WebElement arrivingFromDay;

                @FindBy(xpath = ".//input[@value='" + SERVICE_CLASS +"']")
                WebElement serviceClass;

                @FindBy(xpath = ".//select[@name='airline']/option[" + AIRLINE + "]")
                WebElement airline;

                @FindBy(xpath = ".//input[@name='findFlights']")
                WebElement findFlights;


                public void flightFinder() {

                        final WebDriverWait wait = new WebDriverWait(driver, 10);

                        wait.until(ExpectedConditions.elementToBeClickable(roundTrip)).click();
                        passengers.click();
                        departingFrom.click();
                        departingFromDay.click();
                        departingFromMonth.click();
                        arrivingFrom.click();
                        arrivingFromDay.click();
                        arrivingFromMonth.click();
                        serviceClass.click();
                        airline.click();
                        wait.until(ExpectedConditions.elementToBeClickable(findFlights)).click();
                }

        }

