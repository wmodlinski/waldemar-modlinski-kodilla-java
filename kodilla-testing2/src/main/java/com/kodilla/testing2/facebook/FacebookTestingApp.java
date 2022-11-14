package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public static final String XPATH_COOKIE_ACCEPT = "//div[contains(@class, \"_9xo5\")]/button";
    public static final String XPATH_CREATE_ACC_BUTTON = "//div[contains(@class, \"_6ltg\")][2]/a";
    public static final String XPATH_NAME = "//div[contains(@class,\"_5dbb\")]/input";
    public static final String XPATH_SURNAME = "//div[contains(@class,\"_5dbb\")]/div/input";
    public static final String XPATH_EMAIL = "//input[contains(@name,\"reg_email__\")]";
    public static final String XPATH_EMAIL_CONFIRMATION = "//input[contains(@name,\"reg_email_confirmation__\")]";
    public static final String XPATH_PASSWORD = "//input[contains(@name,\"reg_passwd__\")]";
    public static final String XPATH_DAY = "//select[contains(@id,\"day\")]";
    public static final String XPATH_MONTH = "//select[contains(@id,\"month\")]";
    public static final String XPATH_YEAR = "//select[contains(@id,\"year\")]";
    public static final String XPATH_SEX = "//input[contains(@name,\"sex\") and contains(@value,\"2\")]";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement cookieAcceptButton = driver.findElement(By.xpath(XPATH_COOKIE_ACCEPT));
        cookieAcceptButton.click();

        WebElement createNewAccountButton = driver.findElement(By.xpath(XPATH_CREATE_ACC_BUTTON));
        createNewAccountButton.click();

        TimeUnit.SECONDS.sleep(1);

        WebElement nameInput = driver.findElement(By.xpath(XPATH_NAME));
        nameInput.sendKeys("Waldek");

        WebElement surnameInput = driver.findElement(By.xpath(XPATH_SURNAME));
        surnameInput.sendKeys("Modlinski");

        WebElement emailInput = driver.findElement(By.xpath(XPATH_EMAIL));
        emailInput.sendKeys("adres@mail.pl");

        TimeUnit.SECONDS.sleep(1);

        driver.findElement(By.xpath(XPATH_EMAIL_CONFIRMATION))
                .sendKeys("adres@mail.pl");

        driver.findElement(By.xpath(XPATH_PASSWORD))
                .sendKeys("Password#24");

        WebElement dayElement = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(dayElement);
        selectDay.selectByValue("24");

        WebElement monthElement = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByIndex(4);

        WebElement yearElement = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(yearElement);
        selectYear.selectByValue("1989");

        driver.findElement(By.xpath(XPATH_SEX)).click();

    }
}