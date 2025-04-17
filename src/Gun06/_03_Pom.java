package Gun06;

import org.testng.annotations.Test;

public class _03_Pom {

    @Test
    public void AddressFunctionalityPOM(){

        _03_Elements afp=new _03_Elements();

        afp.addressbook.click();
        afp.newAddress.click();
        afp.firsName.sendKeys("Ayşe");
        afp.lastname.sendKeys("Gök");
        afp.company.sendKeys("Techno Study");
        afp.address1.sendKeys("Çiçek mah.");
        afp.address2.sendKeys("Manolya sk");
        afp.city.sendKeys("Manolyaa sk");
        afp.postCode.sendKeys("12345");



    }
}
