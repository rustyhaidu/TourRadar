package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

public class FilterTest extends BaseTest {


    @BeforeMethod
    public void setUpHomePage() {

        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void tourMonthAndCountry() throws Exception {

        /*//WebElement input = driver.findElement(By.cssSelector("body"));
        WebElement input = homePage.getWhereToInputPlaceHolder();
        // input.clear();
        input.sendKeys("Romania");*/
        WebElement input = driver.findElement(By.xpath("//div[@class='sch']/input[@placeholder='Where do you want to go?']"));

        input.sendKeys("Romania");
        Thread.sleep(1000);
        String enteredText = input.getText();

        boolean isCountryContained = false;
        if (enteredText.contains("Romania")){
            isCountryContained = true;
        }
       Assert.assertTrue(isCountryContained);

        input.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        List<WebElement> listDropDown = driver.findElements(By.xpath("//ul[@class='autocomplete-list']/li[@class='autocomplete-item']"));
        String firstElementText = listDropDown.get(0).getText();

        boolean firstElementContainsCountry = false;
        if (firstElementText.contains("Romania")){
            firstElementContainsCountry = true;
        }
        System.out.println(firstElementText);
        Assert.assertTrue(firstElementContainsCountry,
                "Verify that the Country was entered in the input field");

        listDropDown.get(0).click();

        List<WebElement> months = driver.findElements(By.xpath("//div[@class='months']/div"));
        months.get(11).click();

        WebElement webElement = driver.findElement(By.linkText("Search"));
        webElement.click();

        Thread.sleep(1000);

        WebElement webElement1 = driver.findElement(By.xpath("//div[@class='c']/div[@class='stat']/h2"));

        String tripsFound = webElement1.getText();
        System.out.println(tripsFound);
        boolean containsCountry = false;
        if (tripsFound.contains("Romania")) {
            containsCountry = true;
        }

        Assert.assertTrue(containsCountry);
    }
}
