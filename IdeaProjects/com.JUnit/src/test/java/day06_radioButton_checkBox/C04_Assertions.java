package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Assertions {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test01(){
        //eğer test methoodumuzda bit teset yapmadıysak test çalıştıktan sonra
        //hiçbir prroblemle karsılasılmadıysa raporlamak için test passed yazar
        //EĞER testleri if ile yaparsak test failed olsa bile kodlar problemsiz çalıştığı için
        //ekranın alt kısmında test passed yazacaktır.
        driver.navigate().to("https://www.amazon.com");

      /*  if (driver.getCurrentUrl().equals("https://www.facebook.com")){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url test FAILED");
        }*/
        String expectedUrl="https://www.facebook.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals("Url beklenenden farklı",expectedUrl,actualUrl);

        /*Assert ile yaptığımız testlerde assertion  failed olursa,
        Java kodların çalışmasını durdurur ve Assert class'i bizi hata konusunda bilgilendirir

            org.junit.ComparisonFailure: Url beklenenden farklı
            Expected :https://www.facebook.com/
            Actual   :https://www.amazon.com/
         */
    }
}
