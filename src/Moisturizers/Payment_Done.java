package Moisturizers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_Done
{
    @FindBy(xpath = "//div[@ class = \"row justify-content-center\"]//h2")
    static WebElement Message_Done ;
    @FindBy(xpath="//div[@ class = \"row justify-content-center top-space-50\"]//p[@ class = \"text-justify\"]")
    static WebElement Payment_Done;

    public static void Verify_Success_Message()
    {
        if(Message_Done.getText().equals("PAYMENT SUCCESS"))
        {
            System.out.println("Verified : "+Message_Done.getText());
        }
        else {
            System.out.println("Not Found");
        }
        System.out.println("Verified : "+Message_Done.getText());
    }
    public static void Payment_Message()
    {
        System.out.println(Payment_Done.getText());
    }
}
