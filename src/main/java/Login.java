import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileReader;

public class Login extends BasePage{

    public Login(WebDriver webDriver) {
        super(webDriver);
    }

    WebElement webElementEmail=webDriver.findElement(By.id("n-input-email"));
    WebElement webElementPassword=webDriver.findElement(By.id("n-input-password"));

    //FileReader fileReader=new FileReader("C:\Users\furka\Network.csv");



}
