package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C05_DropDownOptions2 {
    /*
    1.https://the-internet.herokuapp.com/dropdown adresine gidin
    2.Index kullanarak Option(secenek)1 'i secin ve yazdırın
    3.Value kullanarak Option2 ' yi secin ve yazdırın
    4.Tüm dropdown değerleri-value- leri yazdırın
    5.Dropdown nun boyutunu bulun,Dropdown da 4 öğe varsa True, değilse false yazdırın
     */
    WebDriver driver;
    @Before
    public  void setUp(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        //driver.close();
    }
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement ddm= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(ddm);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

       List<WebElement>actualOptionList= select.getOptions();
        for (WebElement each:actualOptionList
             ) {
            System.out.println(each.getText());
        }
            int ddmBoyut=actualOptionList.size();
        if (ddmBoyut==4){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
