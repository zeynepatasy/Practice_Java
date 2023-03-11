package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Assertions {
    /*
    1.amazon anasayfasına gidin
    2.farklı test methodları olustururak asağıdakı görevleri yapın
    3.Url'in amazon içerdiğini test edin
    4.title'ın facebook içermedğini test edin
    5.sol üst köşede amazon logosunun göründüğünü test edin
    */
    static WebDriver  driver; //Class levelde olusturduk. Bütün methodlarda kullanmak için.
    @BeforeClass
    public static void setUp(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        String arananKelime="amazon";
        String actualUrl= driver.getCurrentUrl();
        //Assert.assertTrue(actualUrl.contains("amazon"));

       Assert.assertTrue("Url testi PASSED",driver.getCurrentUrl().contains("amazon"));
    }
    @Test
    public void test02(){
        String istenmeyenKelime="facebook";
        String actualTitle= driver.getTitle();
       // Assert.assertFalse(actualTitle.contains(istenmeyenKelime));
        Assert.assertFalse("Title testi PASSED",driver.getTitle().contains("facebook"));
    }
    @Test
    public  void test03(){
        WebElement logoElementi= driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue("Logo testi PASSED",logoElementi.isDisplayed());
    }
}
