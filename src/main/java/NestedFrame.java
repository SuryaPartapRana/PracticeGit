import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/nestedframes");
        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.tagName("p")).getText());
    }
}
