package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Assertions {

    @Test
    public void equalsOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

        //AEM OBA
        //Actual(oluşan), Expected(Beklenen), Hata açıklama mesajı
        Assert.assertEquals(s1,s2,"Oluşanla beklenen aynı değil");
    }

    @Test
    public void NotEqualsOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

        Assert.assertNotEquals(s1,s2,"Oluşanla beklenen aynı değil");
    }

    @Test
    public void TrueOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

        Assert.assertTrue(s1.equals(s2),"Oluşanla beklenen aynı değil");
    }

    @Test
    public void NullOrnek(){
        String s1=null;

        Assert.assertNull(s1,"Beklenen değer null değil");
    }

    @Test
    public void FalseOrnek(){
        int s1=5;
        int s2=5;

        Assert.assertFalse(s1==s2,"Oluşanla beklenen eşit");
    }

    @Test
    public void DirectFail(){
        int a=56;

        if (a > 10)
            Assert.fail();    //Assert.assertTrue(a<=10,"a 10 dan büyük");
    }
}
