package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _03_Elements {

    public _03_Elements(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy (linkText = "Address Book")
    public WebElement addressbook;

    @FindBy (linkText = "New Address")
    public WebElement newAddress;

    @FindBy (id = "input-firstname")
    public WebElement firsName;

    @FindBy (id = "input-lastname")
    public WebElement lastname;

    @FindBy (id = "input-company")
    public WebElement company;

    @FindBy (id = "input-address-1")
    public WebElement address1;

    @FindBy (id = "input-address-2")
    public WebElement address2;

    @FindBy (id = "input-city")
    public WebElement city;

    @FindBy (id = "input-postcode")
    public WebElement postCode;

    @FindBy (id = "input-country")
    public WebElement webCountry;

    @FindBy (id = "input-zone")
    public WebElement webState;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement continuee;

    @FindBy (linkText = "Edit")
    public List<WebElement> editAll;

    @FindBy (linkText= "Delete")
    public List<WebElement> deleteAll;




}
