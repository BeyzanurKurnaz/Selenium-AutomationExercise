package WebElementMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookLoginJunit {
    //Assert Methodları kullanılmamış bir örnektir.

    @Test
    public void test02(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // sayfam tam ekran olsun
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //15 saniye beklesin

        //Facebook adresine gidin
        driver.get("https://www.facebook.com/");

        // Eposta girişi yapılır.
        WebElement email = driver.findElement(By.xpath("//input[@id ='email']"));
        email.sendKeys("beyza@hotmail.com");

        // Şifre giriş yapılır.
        WebElement pass = driver.findElement(By.xpath("//input[@id ='pass']"));
        pass.sendKeys("blabla");

        //Giriş yap tıklanır.
        WebElement girisbutton = driver.findElement(By.xpath("//button[@data-testid ='royal_login_button']"));
        girisbutton.click();

        //Uyarı için "Girdiğin şifre yanlış. Şifreni mi Unuttun?" messaqe dönmesi beklenir.
        WebElement SonucYazisi = driver.findElement(By.xpath("//div[@class = '_9ay7']"));

        //Mesajın çıktığını test edin.
        String expectedSonuc = "Girdiğin şifre yanlış. Şifreni mi Unuttun?";
        String actualSonuc = SonucYazisi.getText();
        if(expectedSonuc.equals(actualSonuc))
        {
           System.out.println("Girilemedi Testi pass");
        }
        else
        {
            System.out.println("Girilemedi Testi fail");
        }

        //Ekranı kapatın.
        driver.close();
    }
}
