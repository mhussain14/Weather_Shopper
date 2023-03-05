package Page_Factory_SetUp;

import Browser_SetUp.Browser_SetUp;
import Moisturizers.Moisturizers;
import Moisturizers.Moisturizer_Products;
import Moisturizers.Cart_Items;
import Sunscreen.Hyper_Link;
import Sunscreen.Sunscreen_Products;
import Sunscreen.Sunscreens;
import Moisturizers.Stripe;
import Moisturizers.Payment_Done;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.sql.Driver;


public class PF_SetUp
{
    static WebDriver driver;
    @BeforeTest
    public static void SetUp() throws InterruptedException
    {
        driver = Browser_SetUp.Launch_Browser(driver,"Firefox", "https://weathershopper.pythonanywhere.com/");
        Thread.sleep(1000);
        //Verify_The_Moisturizer();
        System.out.println("Verified Home Screen");
    }
    @Test
    public static void Moisturizer() throws InterruptedException
    {
        Moisturizers mois = PageFactory.initElements(driver, Moisturizers.class);
        mois.VerifyTitle();
        Thread.sleep(1000);
        mois.VerifyTemperature();
        Thread.sleep(1000);
        mois.Verify_H3();
        Thread.sleep(1000);
        mois.Verify_P();
        Thread.sleep(1000);
        mois.click_On_BY_Moisturizers();
    }
    @Test
    public static void Product_Details() throws  InterruptedException
    {
        Moisturizer_Products Mois_Details = PageFactory.initElements(driver, Moisturizer_Products.class);
        Thread.sleep((1000));
        Mois_Details.Page_Name();
        Thread.sleep(1000);
        Mois_Details.Get_Product_Name();
        Thread.sleep(1000);
        Mois_Details.Verify_Price();
        Thread.sleep(1000);
        Mois_Details.Add_TO_Cart();
    }
    @Test
    public static void Check_The_Cart() throws InterruptedException
    {
        Thread.sleep(1000);
        Cart_Items Carts = PageFactory.initElements(driver, Cart_Items.class);
        Carts.Click_On_Cart_Items();
        Thread.sleep(1000);
        Carts.Verify_Text_checkout();
        Thread.sleep(1000);
        Carts.Total_price();
        Thread.sleep(1000);
        Carts.Pay_With_Card();
    }
    @Test
    public static void Pay_Amount() throws InterruptedException
    {
        /*String xpth = "//form[@ class = \"checkoutView\"]";
        driver.switchTo().window(xpth);*/
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@ name = \"stripe_checkout_app\"] ")));
        Thread.sleep(1000);
        Stripe ST = PageFactory.initElements(driver, Stripe.class);
        //ST.Move_IFrame();
        Thread.sleep(1000);
        ST.Email();
        Thread.sleep(1000);
        ST.Card_No();
        Thread.sleep(1000);
        ST.Expiry_Date();
        Thread.sleep(1000);
        ST.CVC();
        Thread.sleep(1000);
        ST.Zip_Code();
        Thread.sleep(1000);
        ST.pay_The_Amount();
        driver.switchTo().defaultContent();
    }
    @Test
    public static  void Payment_Done_Successfully() throws InterruptedException
    {
        Thread.sleep(3000);
        Payment_Done pay_messag = PageFactory.initElements(driver, Payment_Done.class);
        pay_messag.Verify_Success_Message();
        Thread.sleep(1000);
        pay_messag.Payment_Message();
    }
    @Test
    public static void SunScreens() throws InterruptedException
    {
        // GET_Request APITest = PageFactory.initElements(driver, GET_Request.class);
        Thread.sleep(5000);
        Sunscreens suns = PageFactory.initElements(driver, Sunscreens.class);
        suns.Verify_H3();
        Thread.sleep(1000);
        suns.Verify_P();
        Thread.sleep(1000);
        suns.click_On_BY_Sunscreens();
    }
    @Test
    public static void Verify_Link() throws InterruptedException
    {
        Hyper_Link HP = PageFactory.initElements(driver,Hyper_Link.class);
        HP.Verify_Link();
        Thread.sleep(3000);
        HP.Page_Name();
    }
    //@AfterTest
    public static void tearDown()
    {

    }

}
