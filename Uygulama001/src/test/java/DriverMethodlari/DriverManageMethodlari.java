package DriverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // sayfam tam ekran olsun
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //15 saniye beklesin

        //driver.manage WINDOW METHODLARI

        // 1- İçinde olduğumuz sayfanın ölçülerini getirir. --> driver.manage().window().getSize();
        System.out.println("Sayfa ölçüsü:" + driver.manage().window().getSize());

        // 2- İçinde olduğumuz sayfanın pozisyonunu getirir --> driver.manage().window().getPosition; (sol alt köşenin ölçülerini verir)
        System.out.println("Pozisyon" + driver.manage().window().getPosition());

        // 3- Bu ölçüleri gördüğümüz gibi pozisyon ölçüsü atamasıda yapabiliriz. (15,15) bir atama yapalım mesela --> .setPosition(new Point(5,5))
        // içinde olduğu sayfanın sol alt kösesini bizim yapacağımız pixel noktasına taşır.
        driver.manage().window().setPosition(new Point(5,5));

        //içinde olduğu sayfanın sol alt köşesi sabit olarak bizim yazacağımız olçülere getirir
        driver.manage().window().setSize(new Dimension(900,600));
        //sayfa ölçüsünü tekrar getirelim
        System.out.println("Pozisyon" + driver.manage().window().getSize());

        // Sayfa büyüklüğü ayarlanacak method
        // 1- driver.manage().window().maximize(); --> içinde olduğu sayfayı maximize yapar
        driver.manage().window().maximize();
        // 2- driver.manage().window().maximize(); --> içinde olduğu sayfayı fulscreen yapar.
        driver.manage().window().fullscreen();


        //Driver manage TIMEOUT METHODLARI

        // 1- driver.manage().timeouts().implicitlyWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

                 /*      wait konusunu ilerde tek basina ele alacagiz
                ancak her class icin yapmamiz gereken bir ayar oldugu icin burada kisaca deginelim
                implicitlyWait : driver'a sayfanin yuklenmesi ve kullanacagimiz webelementlerin bulunmasi icin
                                 bekleyecegi maximum sureyi belirtir.
                                 driver bu sure icerisinde sayfa yuklenir/web element bulunursa
                                 beklemeden calismaya devam eder.
                                 bu sure bittigi halde sayfa yuklenememis/webElement bulunamamissa
                                 exception vererek calismayi durdurur
                Duration.ofSeconds(15) : Duration class'i Selenium-4 ile gelen zaman class'idir
                                         Yani driver'a ne kadar bekleyecegini soyler
                                         Duration.ofSeconds(15) yerine milis,minutes,hours da kullanilabilir
         */

        /* NOT :    Driver'in istedigimiz islemleri yaparken sorunla karsilasmamasi icin
                    driver.manage() method'larindan
                    maximize() ve implicitlyWait() method'larinin her test'te kullanilmasi
                    FAYDALI OLACAKTIR
         */









} }
