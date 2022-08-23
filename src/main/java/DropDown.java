import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class DropDown {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Actions action = new Actions(driver);
        driver.navigate().to("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("withOptGroup"));
        element.click();
        WebElement option = driver.findElement(By.xpath("//*[contains(text(),'Group 1, option 1')]  "));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click()",option);
        //action.doubleClick(option).perform();
        //driver.findElement(By.xpath("//div[@data-value='523-23-20275']"));

        //Select drop = new Select(driver.findElement(By.id("withOptGroup")));
        //drop.selectByVisibleText("Group 1, option 1");

        WebElement multi = driver.findElement(By.xpath("//*[contains(text(),'Select...')]"));
        multi.click();
        WebElement option2 = driver.findElement(By.xpath("//*[contains(text(),'Green')]  "));
        //option2.sendKeys(Keys.ENTER);
        JavascriptExecutor j2 = (JavascriptExecutor) driver;
        j2.executeScript("arguments[0].click()",option2);

        WebElement option3 = driver.findElement(By.xpath("//*[contains(text(),'Blue')]  "));
        JavascriptExecutor j3 = (JavascriptExecutor) driver;
        j3.executeScript("arguments[0].click()",option3);
        //option3.sendKeys(Keys.ENTER);

    }
}
