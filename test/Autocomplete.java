import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Autocomplete {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:/Users/SinghV11/Downloads/jars/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("155 Park Blvd, Palo Alto, CA");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement autoCompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
//        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();
//        driver.quit();
    }
}
