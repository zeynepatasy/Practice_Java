package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_BestBuyTest {
    /*

    2.https://www.bestbuy.com/ Adresine gidin farkli test methodları olusturarak asağıdaki testleri yapın

   a.Syfa URL'inin https://www.bestbuy.com/ ' a eşit oldugunu test edin
   b.titleTest--> Sayfa baslığının "Rest" içermedğini test edin
   c.logoTest--> BestBuy logosunun görüntülendiğini test edin
   d.FrancaisLinkTest--> Fransızca linkin görüntülendiğini test edin.
    */
    static WebDriver driver;
    @Before
    public static void setUp(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public static void tearDown(){
        driver.close();
    }
    @Test
    public void testBestBuy(){
        driver.get("https://www.bestbuy.com/");

    }
}
