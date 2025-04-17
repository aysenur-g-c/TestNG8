package Proje;

import Utility.BaseDriver2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elementler {
    public Elementler(){
        PageFactory.initElements(BaseDriver2.driver,this);
    }

    @FindBy(xpath = "//*[@class='zak-button']")
    public WebElement demo;

    @FindBy(xpath = "(//*[@class='elementor-button-text'])[2]")
    public WebElement exploreOpenMRS2;

    @FindBy(xpath = "(//*[@class='elementor-button-text'])[4]")
    public WebElement exploreOpenMRS2Demo;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//*[@id='sessionLocation']/li)[1]")
    public WebElement InpatientWard;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    @FindBy (xpath = "//*[@for='sessionLocation']/span")
    public WebElement error1;

    @FindBy(xpath = "//*[@class='container-fluid']//h4")
    public WebElement successEnterMessage;

    @FindBy(xpath = "//*[@class='icon-user small']")
    public WebElement userIcon;

    @FindBy(xpath = "//*[contains(text(),'My Account')]")
    public WebElement myAccountButton;

}
