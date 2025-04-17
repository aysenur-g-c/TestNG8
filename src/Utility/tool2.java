package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver2.driver;

public class tool2 {
    public static void mySendKeys(WebElement e, String  text)
    {
        BaseDriver2.wait.until(ExpectedConditions.visibilityOf(e));
        scrollToElement(e);
        e.clear();
        e.sendKeys(text);
    }

    public static void myClick(WebElement e)
    {
        BaseDriver2.wait.until(ExpectedConditions.elementToBeClickable(e));
        scrollToElement(e);
        e.click();
    }

    //elemente kadar scroll yap
    public static void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
