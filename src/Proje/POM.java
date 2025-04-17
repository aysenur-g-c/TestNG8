package Proje;

import Utility.BaseDriver2;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM extends BaseDriver2 {

    @Test (groups = "Smoke Test")
    public void LoginHatalari(){

        Elementler lh=new Elementler();
        myClick(driver.findElement(By.xpath("//*[@class='zak-button']")));
        scrollToElement(driver.findElement(By.xpath("(//*[@class='elementor-button-wrapper'])[2]")));
        MyFunc.Bekle(3);
        myClick(driver.findElement(By.xpath("(//*[@class='elementor-button-wrapper'])[2]")));
        MyFunc.Bekle(5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='elementor-button-wrapper'])[4]")));
        myClick(driver.findElement(By.xpath("(//*[@class='elementor-button-wrapper'])[4]")));
        lh.username.sendKeys("admin");
        lh.password.sendKeys("Admin123");
        lh.loginBtn.click();

//        wait.until(ExpectedConditions.visibilityOf(lh.userIcon));
//        new Actions(driver).moveToElement(lh.userIcon).build().perform();
//
//        Assert.assertTrue(lh.myAccountButton.isDisplayed());

        Assert.assertTrue(lh.error1.isDisplayed()); // ilk error hatası
    }

    @Test (groups = "Smoke Test")
    public void LoginHatalari2(){

        Elementler lh=new Elementler();
        MyFunc.Bekle(5);
      //  wait.until(ExpectedConditions.elementToBeClickable(lh.demo));
        myClick(driver.findElement(By.xpath("//*[@class='zak-button']")));
        scrollToElement(driver.findElement(By.xpath("(//*[@class='elementor-button-wrapper'])[2]")));
        MyFunc.Bekle(3);
        myClick(driver.findElement(By.xpath("(//*[@class='elementor-button-wrapper'])[2]")));
        MyFunc.Bekle(5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='elementor-button-wrapper'])[4]")));
        myClick(driver.findElement(By.xpath("(//*[@class='elementor-button-wrapper'])[4]")));
        lh.username.sendKeys("admin");
        lh.password.sendKeys("Admin123");
        lh.InpatientWard.click();
        lh.loginBtn.click();

        wait.until(ExpectedConditions.visibilityOf(lh.userIcon));
        new Actions(driver).moveToElement(lh.userIcon).build().perform();

        Assert.assertTrue(lh.myAccountButton.isDisplayed());

    }
}
