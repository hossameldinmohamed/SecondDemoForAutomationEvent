package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {

     @FindBy(id = "checkout")
     private WebElement checkout;

     @FindBy(id = "first-name")
     private WebElement firstName;

     @FindBy(id = "last-name")
     private WebElement lastName;


    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement continueButton;
    @FindBy(id = "finish") //continue
    private WebElement finishbutton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void Checkout(String firstName, String lastName, String postalCode) {

        clickElement(checkout);
        enterText(this.firstName, firstName);
        enterText(this.lastName, lastName);
        enterText(this.postalCode, postalCode);
        clickElement(continueButton);
        clickElement(finishbutton);
    }
}
