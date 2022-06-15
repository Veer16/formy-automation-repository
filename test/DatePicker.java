import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/SinghV11/Downloads/jars/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("1/1/2922");
        dateField.sendKeys(Keys.RETURN);
    }
}
