package com.gittigidiyor.base;

import com.gittigidiyor.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class BasePage extends Constants {
    WebDriver driver = null;
    WebDriverWait wait = null;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,60);

    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public List<WebElement> listElements(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElements(by);
    }

    public void randomClick(By by){
        Random random = new Random();
        listElements(by).get(random.nextInt(listElements(by).size())).click();

    }
    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }
    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();

    }
    public void hoverElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }
    public void clear(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        findElement(by).clear();
    }



}
