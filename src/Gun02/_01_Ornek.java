package Gun02;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Ornek extends BaseDriver {
    // Senaryo
    // 1- Siteye gidiniz
    // 2- Kendinize özel login bilgileri ile giriş yapınız
    // 3- Başarılı giriş yaptığınızı Sayfanın Title ını doğrulayarak Assert ediniz.

    @Test
    public void Test(){

        System.out.println("Login test başladı");
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        MyFunc.Bekle(2);

        WebElement email=driver.findElement(By.xpath("//input[@id='input-email']"));
        email.sendKeys("deniz123@gmail.com");

        WebElement password= driver.findElement(By.xpath("//*[@id='input-password']"));
        password.sendKeys("Deniz.123");

        WebElement login= driver.findElement(By.xpath("//*[@value='Login']"));
        login.click();

        driver.findElement(By.xpath("//*[@id='details-button']")).click();
        driver.findElement(By.xpath("//*[@id='proceed-link']")).click();

        Assert.assertTrue(driver.getTitle().equals("My Account"),"Login olunamadı");

        System.out.println("login test bitti");

    }
}
