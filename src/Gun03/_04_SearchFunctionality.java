package Gun03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionality extends BaseDriver {
    /*
      Senaryo ;
      1- Siteyi açınız.
      2- mac(xml den gönderilecek) kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung(xml den gönderilecek için de yapınız
    */
    @Test
    @Parameters("searchText")
    public void mac(String aranacakText){

        WebElement search= driver.findElement(By.name("search"));
        search.sendKeys(aranacakText+ Keys.ENTER);

        List<WebElement> captions=driver.findElements(By.xpath("//*[@class='caption']/h4/a")); //  //*[@class='caption']

        for (WebElement e: captions) {
            System.out.println("e.getText() = " + e.getText());
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakText.toLowerCase()));
        }
    }
}
