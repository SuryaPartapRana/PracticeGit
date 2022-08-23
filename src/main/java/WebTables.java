import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
    /*public static String gettext(int i , int j){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/webtables");
        String s = "div["+i+"]";
        String s2 = "div["+j+"]";
        String ans =  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/"+s+"/div/"+s2)).getText();
        return ans;
    }*/
    public static void main(String[] args){
        //String output  = gettext(2,2);
        //System.out.println(output);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/webtables");

        WebElement edit = driver.findElement(By.id("edit-record-1"));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click()",edit);

        WebElement fname = driver.findElement(By.id("firstName"));
        fname.clear();
        fname.sendKeys("Surya Partap");

        driver.findElement(By.id("submit")).click();

        //WebElement name1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]"));
        //JavascriptExecutor j = (JavascriptExecutor) driver;
        //((JavascriptExecutor) driver).executeScript("arguments[0].innerHTML = arguments[1]", name1, "Surya");

    }
}
