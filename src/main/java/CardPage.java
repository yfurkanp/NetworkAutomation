import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardPage extends BasePage {


    By productNameLocator=By.className("product__buttons");

    public CardPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean checkIfProductAdded() {

        return getProduct().size()>0;
    }

    private List<WebElement> getProduct(){
        return findAll(productNameLocator);
    }

}
