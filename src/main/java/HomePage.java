import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public boolean isProductCountUp;
    SearchBox searchBox;
    By cartCountLocator=By.className("header__basket--count");
    By carContainerLocator=By.className("product__buttons");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        searchBox=new SearchBox(webDriver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public Boolean isProductCountUp(){
        return getCardCount()>0;
    }

    public void goToCard() {
        click(carContainerLocator);
    }

    private int getCardCount(){
       String count = find(cartCountLocator).getText();
       return Integer.parseInt(count);
    }
}
