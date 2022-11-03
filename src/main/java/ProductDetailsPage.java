import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ProductDetailsPage extends BasePage {

    By addToCardButtonLocator=By.className("product__button");


    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isProductDetailsPage() {
    return isDisplayed(addToCardButtonLocator );
    }

    public void addToCard() {
        click(addToCardButtonLocator);
    }
}
