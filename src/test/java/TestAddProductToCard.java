import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestAddProductToCard extends BaseTest {

        HomePage homePage;
        ProductPage productPage;
        ProductDetailsPage productDetailsPage;
        CardPage cardPage;


        @Test
        @Order(1)
        public void searchProduct(){
            homePage=new HomePage(webDriver);
            homePage.searchBox.search("ceket");
            productPage=new ProductPage(webDriver);
            Assertions.assertTrue(productPage.isOnProductPage(),"not in product page...");
        }

        @Test
        @Order(2)
        public void selectProduct(){
            //productPage.scroll();
            productDetailsPage=new ProductDetailsPage(webDriver);
            productPage.selectProduct(1);
            Assertions.assertTrue(productDetailsPage.isProductDetailsPage(),"not in product page...");
        }

        @Test
        @Order(3)
        public void addToCard(){
            productDetailsPage.addToCard();
            Assertions.assertTrue(homePage.isProductCountUp,"product did not increase");
        }

        @Test
        @Order(4)
        public void goToCard(){
            cardPage=new CardPage(webDriver);
            homePage.goToCard();
            Assertions.assertTrue(cardPage.checkIfProductAdded(),"its not added");
        }





}
