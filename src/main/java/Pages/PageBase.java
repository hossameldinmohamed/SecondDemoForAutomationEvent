package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected static WebDriver driver;


    public PageBase(WebDriver driver) {

             this.driver = driver;
             PageFactory.initElements(driver, this);
         }

         public void clickElement(WebElement element) {
             element.click();
         }
         public void enterText(WebElement element, String text) {
             element.clear();
             element.sendKeys(text);
         }
         public String getElementText(WebElement element) {
             return element.getText();
         }



}
