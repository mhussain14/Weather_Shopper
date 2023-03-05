package Browser_SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browser_SetUp
{
    public static WebDriver dr;

    public static WebDriver Launch_Browser(WebDriver driver, String browser_Name, String Url)
    {
        if(browser_Name.equals("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.println("launched Firfoxe Driver");

        }
        else if(browser_Name.equals("chrome"))
        {
            //driver = new ChromeDriver();
        }
        else if(browser_Name.equals("IE"))
        {

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
    public static void Select_Multiple_Product()
    {
        String Before_Xpath = "//body/div[1]/div[3]/div[";
        String After_Xpath = "]/button[1]";

        for (int i =2; i<=5; i++)
        {
            WebElement product = dr.findElement(By.xpath(Before_Xpath +i+ After_Xpath));
            product.click();

        }
    }

}
