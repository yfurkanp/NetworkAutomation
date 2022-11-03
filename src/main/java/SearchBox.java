import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("search");

    //button locator

    public SearchBox(WebDriver webDriver) {
        super(webDriver);
    }

    public void search(String text) {

        type(searchBoxLocator,text);

        WebElement search=webDriver.findElement(By.id("search"));
        search.sendKeys(Keys.ENTER);





    }
}
