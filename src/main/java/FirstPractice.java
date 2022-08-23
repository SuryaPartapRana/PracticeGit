import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPractice {
    public static void macCleanHack(WebElement element) {
        while(!element.getAttribute("value").equals("")){
            element.sendKeys(Keys.BACK_SPACE);
        }

    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/automation-practice-form");

        WebElement element = driver.findElement(By.id("firstName"));
        element.sendKeys("Surya");

        WebElement lname = driver.findElement(By.id("lastName"));
        lname.sendKeys("Rana");

        WebElement mail = driver.findElement(By.id("userEmail"));
        mail.sendKeys("partapsurya2001@gmail.com");

        WebElement element5 = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]"));
        element5.click();



        //WebElement date = driver.findElement(By.id("dateOfBirthInput"));
        //macCleanHack(date);
        //date.sendKeys(Keys.chord(Keys.CONTROL, "a" + Keys.DELETE));
        //date.clear();
        //date.sendKeys("27 Dec 2001");
        //JavascriptExecutor j = (JavascriptExecutor) driver;
        //j.executeScript("arguments[0].click();", check);

        //dateOfBirthInput



        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        jsExecutor.executeScript("document.getElementById('dateOfBirthInput').value='27 Dec 2001'");

        WebElement number = driver.findElement(By.id("userNumber"));
        number.sendKeys("1111111111");

        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Maths");
        subject.sendKeys(Keys.ENTER);
        subject.sendKeys("English");
        subject.sendKeys(Keys.ENTER);


        WebElement check = driver.findElement(By.id("hobbies-checkbox-1"));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click();", check);

        WebElement check2 = driver.findElement(By.id("hobbies-checkbox-2"));
        JavascriptExecutor j2 = (JavascriptExecutor) driver;
        j2.executeScript("arguments[0].click();", check2);


        //WebElement element6 = driver.findElement(By.id("hobbies-checkbox-1"));
        //element6.click();


        WebElement Address = driver.findElement(By.id("currentAddress"));
        Address.sendKeys("House No. 38 sector 40 chandigarh");



        WebElement products = driver.findElement(By.id("react-select-3-input"));
        products.sendKeys("Uttar Pradesh");
        products.sendKeys(Keys.ENTER);



        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Agra");
        city.sendKeys(Keys.ENTER);



        //driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);


    }
}
