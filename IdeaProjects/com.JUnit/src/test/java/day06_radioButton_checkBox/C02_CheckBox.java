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

public class C02_CheckBox {
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
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    WebElement checkBox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
    WebElement checkBox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
    Thread.sleep(3000);
    //checkBox1 seçili değilse ise onay kutusuna tıklayın
  if (!checkBox1.isSelected()){
      checkBox1.click();
  }
    //checkBox2 seçili değilse ise onay kutusuna tıklayın
    Thread.sleep(3000);
if (!checkBox2.isSelected()){
    checkBox2.click();
    Thread.sleep(3000);
}
}

}
