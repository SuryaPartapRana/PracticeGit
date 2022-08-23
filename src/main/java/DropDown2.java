import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        Select s1 = new Select(driver.findElement(By.xpath("//select[@id='first']")));
        s1.selectByVisibleText("Iphone");

        Select s2 = new Select(driver.findElement(By.xpath("//select[@id='second']")));
        s2.selectByVisibleText("Pizza");
        s2.selectByVisibleText("Bonda");
    }
}
