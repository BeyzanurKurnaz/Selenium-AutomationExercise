package TestNgOrnek;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgOrnek {
    WebDriver driver;

   @Test
    public void Test01(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com.tr");
}
    @Test(dependsOnMethods = "Test01")
    public void Test02(){
    WebElement searchkutu = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
    searchkutu.sendKeys("Nutella" + Keys.ENTER);

}
    @Test(dependsOnMethods = "Test02" )
    public void Test03(){
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class = 'a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYaziElementi.getText().contains("Nutella"));

    }
}
