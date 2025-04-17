package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseDriver2 {
    public static Logger LogTutma= LogManager.getLogger(); //Logları ekleyeceğim nesneyi başlattım.

    // aşağısını SDET8 den aldık
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void Setup()
    {
        KalanOncekileriKapat();

        LogTutma.info("Log Tutma işlemi Başladı");
        // seleniumdaki static yani başlangıç kısımlar konacak
        driver=new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // 5 sn mühlet: elementi bulma mühleti

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        LogTutma.info("Başlangıç değişkenleri driver, wait, log tanımlandı ve başlatıldı");
        LoginTest();
    }

    public void LoginTest()
    {
        System.out.println("Login Test başladı");
        LogTutma.info("Login Test Başladı");
        driver.get("https://openmrs.org/tr/");
        MyFunc.Bekle(2);

//        WebElement username=driver.findElement(By.id("username"));
//        username.sendKeys("admin");
//
//        WebElement password=driver.findElement(By.id("password"));
//        password.sendKeys("Admin123");
//
//        WebElement loginBtn=driver.findElement(By.id("loginButton"));
//        loginBtn.click();

//        driver.findElement(By.xpath("//*[@id='details-button']")).click();
//        driver.findElement(By.xpath("//*[@id='proceed-link']")).click();

  //      Assert.assertTrue(driver.getTitle().equals("Home"), "Login olunamadı");

        System.out.println("Login Test bitti");
        LogTutma.info("Login Testi tamamlandı");
    }


    @AfterClass
    public void TearDown()
    {
        // seleniumdaki BekleKapat
        MyFunc.Bekle(3);
        driver.quit();  // bütün açılmış windowları kapatır
        LogTutma.info("Driver kapatıldı");

        //if (hata oldu ise)
        LogTutma.warn("Driver kapatılamadı.");
    }

    @BeforeMethod
    public void BeforeMetod()
    {
        LogTutma.info("Metod başladı");

        LogTutma.warn("WARN : Metod başladı, hata oluşmuş olsa idi");
    }

    @AfterMethod
    public void AfterMetod(ITestResult sonuc) // tesin sonuç ve isim bilgisini olduğu değişkeni
    {
        LogTutma.info(sonuc.getName()+",  Metod Bitti"+" Sonuc="+ (sonuc.getStatus()==1 ? "Passed" : "Failed") );

        LogTutma.warn("WARN : Metod bitti, hata oluşmuş olsa idi bu şekilde eklenebilir.Bir if kontrolü ile");
    }

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

    public static void KalanOncekileriKapat() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
            LogTutma.info("✓ Eski chromedriver işlemleri kapatıldı.");
        } catch (Exception e) {
            LogTutma.error("⛔ Eski chromedriver kapatılamadı: " + e.getMessage());
        }
    }

}
