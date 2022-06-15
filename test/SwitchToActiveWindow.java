import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/SinghV11/Downloads/jars/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTab = driver.findElement(By.id("new-tab-button"));
        newTab.click();

        String originalHandle = driver.getWindowHandle();
        System.out.println("origninal Handle" + originalHandle);
        for (String handle1: driver.getWindowHandles()){
             driver.switchTo().window(handle1);
             System.out.println("Handle 1 " + handle1);
        }
        driver.switchTo().window(originalHandle);
    }
}
