package Moisturizers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart_Items
{
    @FindBy(xpath = "//nav[@ class = \"navbar navbar-expand-sm sticky-top\"]// button[@ class = \"thin-text nav-link\"]")
    static WebElement CartITems;
    @FindBy(xpath = "//div[@ class = \"row top-space-30\"]//button[@ type = \"submit\"]")
    static WebElement Pay_With_card;
    @FindBy(xpath = "//div[@ class = 'container top-space-50']//h2")
    static WebElement Verify_Test;
    @FindBy(xpath = "//div[@ class = 'container top-space-50']//p[@ class = \"justify-content-center h4 top-space-20\"]")
    static WebElement Total_Price;


    public  static void Click_On_Cart_Items()
    {
        CartITems.click();
    }
    public  static void Verify_Text_checkout()
    {
        if(Verify_Test.getText().equals("The Best Moisturizers in the World!"))
        {
            System.out.println("Verified : "+Verify_Test.getText());
        }
        else {
            System.out.println("Not Found");
        }
        System.out.println("Verified Text : "+Verify_Test.getText());
    }
    public  static void Total_price()
    {
        System.out.println("Total Price For all items : "+Total_Price.getText());
    }
    public static void Pay_With_Card()
    {
        Pay_With_card.click();
    }
}
