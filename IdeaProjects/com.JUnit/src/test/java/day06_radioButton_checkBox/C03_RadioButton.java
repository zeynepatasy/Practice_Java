package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButton {
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
    //https://www.facebook.com adresine gidin
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.facebook.com");
       driver.findElement(By.xpath("//*[text()='Yeni hesap oluştur']")).click();
       WebElement femaleButton= driver.findElement(By.xpath("//input[@value='1']"));
       WebElement maleButton= driver.findElement(By.xpath("//input[@value='2']"));
       WebElement customButton= driver.findElement(By.xpath("//input[@value='-1']"));

       //secili değilse cinsiyet butonunundan size uygun olanu secin
        Thread.sleep(3000);
       if (!femaleButton.isSelected()){
           femaleButton.click();
       }
       Thread.sleep(3000);

       //sadece bir tane seçim yaptıran buttonlardır.
    }
}
