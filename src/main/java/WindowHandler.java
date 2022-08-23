import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandler {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/browser-windows");
        for(int i = 0 ; i < 5 ; i++){
            driver.findElement(By.id("tabButton")).click();
        }

        String Parent = driver.getWindowHandle();
        System.out.println(Parent);
        Set<String> Allhandle = driver.getWindowHandles();
        int count = Allhandle.size();
        for(String i : Allhandle){
            count--;
            if (!Parent.equalsIgnoreCase(i) && count == 2){
                driver.switchTo().window(i);
                System.out.println(i);
                System.out.println(i);
                System.out.println(i);
            }
        }

        //driver.switchTo().window(Parent);





    }
}
