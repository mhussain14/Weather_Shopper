package Sunscreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sunscreens
{
    @FindBy(xpath="//body//div[3]//div[2]//h3")
    static WebElement Verify_h3;
    @FindBy(xpath = "//body//div[3]//div[2]//p[@ class = \"text-justify\"]")
    static WebElement Verify_P;
    @FindBy(xpath = "//body//div[3]//button[text() = \"Buy sunscreens\"]")
    static WebElement Clicks_Sunscreen;

    public static void Verify_H3()
    {
        if(Verify_h3.getText().equals("Sunscreens"))
        {
            System.out.println("Verified : "+Verify_h3.getText());
        }
        else {
            System.out.println("Not Found");
        }
        System.out.println(Verify_h3.getText());
    }
    public static void Verify_P()
    {
        if(Verify_P.getText().equals("Treat your skin right. Don't leave your home without your favorite sunscreen. Say goodbye to sunburns."))
        {
            System.out.println("Verified : "+Verify_P.getText());
        }
        else {
            System.out.println("Not Found");
        }
        System.out.println(Verify_P.getText());
    }
    public static void click_On_BY_Sunscreens()
    {
        Clicks_Sunscreen.getSize();
        Clicks_Sunscreen.click();
    }
}
