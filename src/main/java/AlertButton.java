import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class AlertButton{
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        /*WebElement element = driver.findElement(By.id("alertButton"));
        element.click();
        Alert simple = driver.switchTo().alert();
        simple.accept();*/
//        WebElement element = driver.findElement(By.id("promtButton"));
//        JavascriptExecutor j = (JavascriptExecutor) driver;
//        j.executeScript("arguments[0].click()",element);
//        Alert simple = driver.switchTo().alert();
//        simple.sendKeys("Hello");
//        simple.accept();

//        WebElement element = driver.findElement(By.id("confirmButton"));
//        JavascriptExecutor j = (JavascriptExecutor) driver;
//        j.executeScript("arguments[0].click()",element);
//        Alert simple = driver.switchTo().alert();
//        simple.dismiss();

        try {
            WebElement element = driver.findElement(By.id("confirmButton"));
            JavascriptExecutor j = (JavascriptExecutor) driver;
            j.executeScript("arguments[0].click()",element);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert simple = driver.switchTo().alert();
            simple.dismiss();
        }
        catch (Exception e){

        }






    }
}
