import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateOfBirthCheck {
    public static boolean check(WebElement element){
        String textInside = element.getAttribute("value");
        if(!textInside.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/automation-practice-form");

//        WebElement element3 = driver.findElement(By.xpath("//input[@value = \"12 Aug 2022\"]"));
//        if(check(element3)){
//            element3.clear();
//        }





    }
}
