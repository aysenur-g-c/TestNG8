package Proje;

import Utility.BaseDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginHatalari extends BaseDriver2 {

    @Test (groups = "Smoke Test")
    public void LoginHatalari(){
        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("admin");
    }

}
