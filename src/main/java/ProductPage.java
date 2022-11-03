import org.openqa.selenium.*;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {

    By shippingOptionLocator= By.className("resultInfo__title");
    By productNameLocator=By.id("pagedListContainer");

    By randomSizeLocator=By.className("product__sizeList");

    Random random=new Random();


    JavascriptExecutor scroll=(JavascriptExecutor)webDriver;


    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    //public void scroll(){
      //  scroll.executeScript("window.scroll(0,12000)");
        //webDriver.findElement(By.linkText("Daha fazla göster")).click();
    //}


    public boolean isOnProductPage() {
     return  isDisplayed(shippingOptionLocator);
    }


    public List<WebElement> getAllSize(){
        return findAll(randomSizeLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement>  getAllProducts(){
        return findAll(productNameLocator);
    }






}
