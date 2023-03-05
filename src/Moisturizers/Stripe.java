package Moisturizers;

import Browser_SetUp.Browser_SetUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Array;

public class Stripe extends Browser_SetUp
{
    @FindBy(xpath = "//iframe[@ name = \\\"stripe_checkout_app\\\"] \")")
    static WebElement iFrame;
    @FindBy(xpath = "//input[@ type = \"email\"]")
    static WebElement Email;
    @FindBy(xpath = "//input[@ id = \"card_number\"]")
    static WebElement CardNo;
    @FindBy(xpath = "//input[@ id = \"cc-exp\"]")
    static WebElement ExpiryDate;
    @FindBy(xpath = "//input[@ id= \"cc-csc\"]")
    static WebElement CVC;
    @FindBy(xpath = "//input[@ id = \"billing-zip\"]")
    static WebElement Zip_Code;
    @FindBy(xpath = "//button [@ type = \"submit\"]")
    static WebElement Pay_Amount;

    /*public static void Move_IFrame()
    {
        dr.switchTo().frame(iFrame);
    }*/
     public static void Email()
     {
         Email.sendKeys("raza.pcr12@gmail.com");
     }
    public static void Card_No()
    {
        for (int i = 0 ; i<=4; i++)
        {
            CardNo.sendKeys("4242");
        }
      /* CardNo.sendKeys("4242");
       CardNo.sendKeys("4242");
       CardNo.sendKeys("4242");
       CardNo.sendKeys("4242");*/
    }
    public static void Expiry_Date()
    {
        ExpiryDate.sendKeys("05");
        ExpiryDate.sendKeys("25");
    }
    public static void CVC()
    {
        CVC.sendKeys("123");
    }
    public static void Zip_Code()
    {
        Zip_Code.sendKeys("41000");
    }
    public static void pay_The_Amount()
    {
        Pay_Amount.click();
    }

}
