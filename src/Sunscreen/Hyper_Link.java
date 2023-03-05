package Sunscreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hyper_Link
{
    @FindBy(xpath="//div[@ class =\"row justify-content-center top-space-50\"]//p[1]//a[1]")
    static WebElement Verify_Hyper_Link;
    @FindBy(xpath="//div[@ class = \"row col-md-12\"]//div[2]//a[1]//h1[1]")
    static WebElement P_Name;

    public static void Verify_Link()
    {
      Verify_Hyper_Link.click();
    }
    public static void Page_Name()
    {
      System.out.println("This is the page name : "+P_Name.getText());
    }

}
