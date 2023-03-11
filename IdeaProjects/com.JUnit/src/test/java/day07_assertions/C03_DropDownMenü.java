package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C03_DropDownMenü {
    /*
    --Amazon'a gidip,
    --Dropdown ' dan books seceneğini secip
    -- Java aratalım
    -- ve arama sonuclarının 500 den fazla oldugunu test edelim
    --arama sonuclarının java içerdiğini test edelim
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
        driver.close();
    }
    @Test
    public void dropDownTest(){
        driver.get("https://www.amazon.com");
        WebElement ddm= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        //select.selectByIndex(5);
       // select.selectByValue("search-alias=stripbooks-intl-ship"); //görünür text orda çıkan alt menüler
        select.selectByVisibleText("Books");//görünür textle aynı olmayabilir
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java" + Keys.ENTER);

        WebElement sonucYazisi=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String arananSözcük="Java";
        String sonucYazısıStr=sonucYazisi.getText();
  Assert.assertTrue(sonucYazısıStr.contains(arananSözcük));

}
}
