package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateSelectionDemo {

    @Test
    public void mytest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");

        WebElement iframe = driver.findElement(By.xpath("//iframe"));

        driver.switchTo().frame(iframe);

      //  driver.findElement(By.id("datepicker")).click();

     //   driver.findElement(By.id("datepicker")).sendKeys("07/12/2019");

        WebElement datePicker = driver.findElement(By.id("datepicker"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String myDate ="03/08/2020";

        js.executeScript("arguments[0].setAttribute('value','"+myDate+"')",datePicker);
    }
}
