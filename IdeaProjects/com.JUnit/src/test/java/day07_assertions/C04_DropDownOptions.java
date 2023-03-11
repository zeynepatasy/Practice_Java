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

public class C04_DropDownOptions {
    /*
    Amazon anasayfaya gidelim
    DropDown menüden books'u secelim
    sectiğimiz option'ı yazdıralım

    2.dropdowndaki tüm opsiyonların toplam sayısının 20 oldugunu test edin
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
        driver.get("https://www.amazon.com");
        WebElement ddm= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Books");
        System.out.println(select.getFirstSelectedOption().getText());

        //secilen option'ın books oldugunu test ettim
         String actualsecilenOptions=select.getFirstSelectedOption().getText();
        String expectedOptions="Books";
        Assert.assertEquals(expectedOptions,actualsecilenOptions);


        List<WebElement>optionList=select.getOptions();
        for (WebElement each:optionList
             ) {
            System.out.println(each.getText());
        }

        int actualopstionSayısı=optionList.size();
        int expectedOptionSayisi=28;

        //toplam options sayısının 28 oldugunuu test ettim
        Assert.assertEquals(expectedOptionSayisi,actualopstionSayısı);

    }

}
