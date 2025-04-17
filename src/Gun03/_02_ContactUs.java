package Gun03;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class _02_ContactUs extends BaseDriver {
 /*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra url deki success yazısını doğrulayınız.
 */
    @Test
    public void Test(){

        WebElement contactUsBtn=driver.findElement(By.linkText("Contact Us"));
        contactUsBtn.click();

        WebElement enquiryArea=driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys("Merhaba testing dünyası");

        WebElement submitBtn=driver.findElement(By.cssSelector("[type='submit']"));
        submitBtn.click();

        System.out.println("önce url="+driver.getCurrentUrl());
        wait.until(ExpectedConditions.urlContains("success")); // wait kullanmasını biliyoruz
        System.out.println("sonra url="+driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
