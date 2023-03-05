package Moisturizers;

import Browser_SetUp.Browser_SetUp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Moisturizers extends Browser_SetUp
{
    @FindBy(xpath = "//body//div//h2")
    static WebElement GetTitle ;
    @FindBy(xpath="//body//div[2]//span[@id = \"temperature\"]")
    static WebElement Temp;
    @FindBy(xpath="//body//div[3]//div[1]//h3")
    static WebElement Verify_h3;
    @FindBy(xpath = "//body//div[3]//p[@ class = \"text-justify\"]")
    static WebElement Verify_P;
    @FindBy(xpath = "//body//div[3]//button[text() = \"Buy moisturizers\"]")
    static WebElement Clicks_Moisture;

    public static void VerifyTitle()
    {
        if(GetTitle.getText().equals("Current temperature"))
        {
            System.out.println("Verified : "+GetTitle.getText());
        }
        else {
            System.out.println("Not Found");
        }
    }
    public static void VerifyTemperature()
    {
        System.out.println(Temp.getText());
    }
    public static void Verify_H3()
    {
        if(Verify_h3.getText().equals("Moisturizers"))
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
        if(Verify_P.getText().equals("Don't let cold weather ruin your skin. Use your favourite moisturizer and keep your skin stay young."))
        {
            System.out.println("Verified : "+Verify_P.getText());
        }
        else {
            System.out.println("Not Found");
        }
        System.out.println(Verify_P.getText());
    }
    public static void click_On_BY_Moisturizers()
    {
        Clicks_Moisture.getSize();
        Clicks_Moisture.click();
    }
}
