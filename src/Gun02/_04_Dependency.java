package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Dependency {

    @Test
    public void startCar (){
        System.out.println("startCar");
        Assert.fail();
    }

    @Test (dependsOnMethods = {"startCar"}) // startcar a bağlı olarak çalış. o başarılı çalışırsa çalış
    public void driveCar (){System.out.println("driveCar");}

    @Test (dependsOnMethods = {"driveCar"})
    public void parkCar (){System.out.println("parkCar");}

    @Test (dependsOnMethods = {"parkCar"}, alwaysRun = true) // hatalı olsa da her türlü çalış
    public void stopCar (){System.out.println("stopCar");}

//Dependency (bağımlılık):Bir testin diğer bir testin sonucuna veya
//belirli bir duruma bağlı olduğu durumları ifade eder.
//Örneğin, bir testin çalışabilmesi için önce başka bir testin başarılı
//bir şekilde tamamlanması gerekebilir. Bu tür senaryolarda TestNG'nin Dependency özelliği devreye girer.


}
