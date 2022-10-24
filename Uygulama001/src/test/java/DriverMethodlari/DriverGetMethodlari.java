package DriverMethodlari;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1- yazdigimiz url gider
        driver.get("https://www.amazon.com");

        //2- sayfa title:Amazon.com. Spend less. Smile more. (Sayfanin basligi doner)
       System.out.println("sayfa title:" + driver.getTitle());

        //3- sayfa url:https://www.amazon.com/ (Sayfanın Url'i döner)
        System.out.println("sayfa url:" + driver.getCurrentUrl());

        //4- Sayfanın kaynak kodları
        //System.out.println("Kaynak kod:" + driver.getPageSource());

        //5- Pencerenin UNIQUE hash kodunu döner.(Tek bir sayfanın hash kodu)
        System.out.println("Kaynak kod:" + driver.getWindowHandle());

        //6- Driver çalışırken birden fazla sayfa açmış ise hepsinin hash kodlarını getirir.
        System.out.println("Kaynak kod:" + driver.getWindowHandles());





    }
}
