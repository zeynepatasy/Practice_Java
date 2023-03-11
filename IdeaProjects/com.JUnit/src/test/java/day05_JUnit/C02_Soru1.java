package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_Soru1 {
    public static void main(String[] args) {
        //signin butonuna tıkla
        //login alanına "username" yazdır
        //password alanına "password" yazdır
        //sign in butonuna tıklayın
        //Pay Bills sayfasına gidin
        //amount kısmına yatırmak istedğiniz herhangi bir miktar giriniz
        //tarih kısmına "2020-09-10" yazdırın
        //pay butonuna tıklayın
        //"The  payment was successfully submitted" mesajının çıktıgını kontrol edin
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://zero.webappsecurity.com sayfasına git
        driver.get("https://zero.webappsecurity.com");
        // güvenlik var..
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().back();


    }
}
