package WebElementMethodlari;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;


//JUNIT KULLANILMAYAN TEST ORNEGI
public class BestBuy {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // sayfam tam ekran olsun
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //15 saniye beklesin

        //https://bestbuy.com adresine gidin.
        driver.get("https://bestbuy.com");

        //sayfada kaç adet button tag'i bulunduğunu yazdirin.
        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        System.out.println(buttonList.size());


        //sayfadaki her bir button üzerindeki yazilari yazdirin.
        for (WebElement each:buttonList)
        {
            System.out.println(each.getText());
        }

    }
}
