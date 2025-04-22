package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

     @FindBy(id = "add-to-cart-sauce-labs-backpack")
     private WebElement firstProduct;

     @FindBy(id = "add-to-cart-sauce-labs-bike-light")
     private WebElement SecondProduct;

     @FindBy(id = "shopping_cart_container")
     private WebElement shoppingCart;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void addProductsToCart() {
        clickElement(firstProduct);
        clickElement(SecondProduct);
        clickElement(shoppingCart);
    }
}
