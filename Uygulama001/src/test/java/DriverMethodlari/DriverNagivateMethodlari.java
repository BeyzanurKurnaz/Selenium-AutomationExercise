package DriverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNagivateMethodlari {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();



        //1- driver.get("https://www.amazon.com"); --> yalnız url'e gider
        driver.get("https://www.amazon.com");

        //2- driver.navigate().to(); --> url'e gider ileri-geri farklı sayfalara yönlendirme gibi işlemlerde yapar (YÖNLENDİRME)
        driver.navigate().to("https://www.facebook.com");

        //3- driver.navigate().to(); --> bir önce ki sayfaya dönüş yapar (GERİ TUŞUNA TIKLAR)
        driver.navigate().back();

        //4- driver.navigate().forward(); --> back ile geldiği sayfaya geri döner (İLERİ TUŞUNA TIKLAR)
        driver.navigate().forward();

        //5- driver.navigate().refresh(); --> sayfa yenileme tuşu (REFRESH TUŞ)
        driver.navigate().refresh();

        //6- driver.close(); -->  (KAPAT)
        driver.close();

        //7- (TÜMÜNÜ KAPAT)
        driver.quit();





    }
}
