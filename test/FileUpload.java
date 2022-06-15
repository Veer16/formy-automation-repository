import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","C:/Users/SinghV11/Downloads/jars/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("Test_Plan_Guru99 (1).pdf");
}
}
