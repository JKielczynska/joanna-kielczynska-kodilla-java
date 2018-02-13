package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_BIRTHDAY_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_BIRTHDAY_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_BIRTHDAY_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement birthdayDayCombo = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
        Select selectBirthdayDay = new Select(birthdayDayCombo);
        selectBirthdayDay.selectByValue("3");

        WebElement birthdayMonthCombo = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH));
        Select selectBirthdayMonth = new Select(birthdayMonthCombo);
        selectBirthdayMonth.selectByValue("11");

        WebElement birthdayDayYear = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR));
        Select selectBirthdayYear = new Select(birthdayDayYear);
        selectBirthdayYear.selectByValue("1989");


    }
}
