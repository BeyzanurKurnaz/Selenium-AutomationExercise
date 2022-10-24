package JUnitAssertions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutomationExercise {
    //JUnit Assert methodlari ile örnektir.

    @Test
    public void Test01(){
        //1- Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3- Verify that home page is visible successfully
        WebElement logoElement = driver.findElement(By.xpath("//img[@src = '/static/images/home/logo.png']"));
        Assert.assertTrue(logoElement.isDisplayed()); //Logo elementinin geldiğini kontrol eder.

        //4- Click on 'Signup / Login' button
        WebElement SignUpElement = driver.findElement(By.xpath("//a[@href = '/login']"));
        SignUpElement.click();

        //5- Verify 'Login to your account' is visible
        WebElement loginYaziElementi= driver.findElement(By.xpath("//h2[text()='Login to your account']")); //text olarak elementi alır.
        Assert.assertTrue(loginYaziElementi.isDisplayed());


        //6- Enter correct email adress and password
        WebElement email = driver.findElement(By.xpath("//input[@name ='email' and @data-qa = 'login-email']"));
        email.sendKeys("beyzakurnaz57@hotmail.com");
        WebElement pass = driver.findElement(By.xpath("//input[@name ='password' and @data-qa = 'login-password']"));
        pass.sendKeys("Beyza123.");

        //7- Click 'Login' button
        WebElement LoginButton = driver.findElement(By.xpath("//button[@class='btn btn-default' and @data-qa='login-button']"));
        LoginButton.click();

        //8- Verify that 'Logged in as username' is visible
        WebElement LoggedInAsText= driver.findElement(By.xpath("//a[text()=' Logged in as ']")); //text olarak elementi alır.
        Assert.assertTrue(LoggedInAsText.isDisplayed());

        //9- Click 'Logout' button
        WebElement LogoutText= driver.findElement(By.xpath("//a[text()=' Logout']"));
        LogoutText.click();

        //10- Verify that user is navigated to login page
        String expectedResult = "https://automationexercise.com/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);

        //11- Close driver
        driver.close();
    }
}
