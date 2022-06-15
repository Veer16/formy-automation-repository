import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/SinghV11/Downloads/jars/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();
        WebElement keyPressOption = driver.findElement(By.id("autocomplete"));
        keyPressOption.click();

    }
}
