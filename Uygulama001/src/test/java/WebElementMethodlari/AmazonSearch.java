package WebElementMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonSearch {
    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.amazon.com.tr adresine yönlenilir.
        driver.get("https://www.amazon.com.tr");

        //Aramaya nutella yazdırılır.
        WebElement searchkutu = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
        searchkutu.sendKeys("Nutella");

        //Enter tuşuna tıklanır.
        searchkutu.submit();


        //Bulunan sonuc yazdırılır.
        WebElement search = driver.findElement(By.xpath("//div[@class = 'a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(search.getText());

        //Ekranı kapat.
        driver.close();

    }
}
