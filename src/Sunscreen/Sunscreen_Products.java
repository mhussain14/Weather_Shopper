package Sunscreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sunscreen_Products
{
    @FindBy(css="div.container> div > h2")
    static WebElement Verify_h2;
    @FindBy(xpath="//div[@ class = \"text-center col-4\"] //p")
    static WebElement Verify_Name;
    @FindBy(xpath = "//body/div[1]/div[3]/div[2]/button[1]")
    static WebElement product_2;
    @FindBy(xpath = "//div[@ class = \"text-center col-4\"] //p[2]")
    static WebElement Verify_Price;
    @FindBy(xpath = "//div[@ class = \"text-center col-4\"] //button[@ class = \"btn btn-primary\"]")
    static WebElement Btn_Add;

    public static void Page_Name()
    {
        if(Verify_h2.getText().equals("Sunscreens"))
        {
            System.out.println("Verified : "+Verify_h2.getText());
        }
        else {
            System.out.println("Not Found");
        }
        System.out.println("Verified : "+Verify_h2.getText());
    }
    public static void Get_Product_Name()
    {
        System.out.println("Verified : "+Verify_Name.getText());
    }
    public static void Verify_Price()
    {
        System.out.println("Verified : "+Verify_Price.getText());
    }
    public static void Add_TO_Cart()
    {
        //Select_Multiple_Product();
        Btn_Add.click();
        product_2.click();
    }
}
