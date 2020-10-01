package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

   /* WebDriver driver;


    WebElement txtUserName1 = driver.findElement(By.id("email"));*/

    //using page factory

    @FindBy (id="email")
    public WebElement txtUserName;

    @FindBy (id="password")
    WebElement txtPassword;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement btnLogin;

    @FindBy (xpath="//a[contains(text(),'I forgot my password')]")
    WebElement lnkForgotPass;

    @FindBy (xpath="//div[@id='login']//h1")
    public WebElement headerLogin ;

    @FindBy (xpath="//label[@for='email']")
    public WebElement lblEmail ;

    @FindBy (xpath="//label[@for='password']")
    WebElement lblPass ;


    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickForgotPass()
    {
        lnkForgotPass.click();
    }
    
    public void setTxtUserName(String username)
    {
        txtUserName.sendKeys(username);
    }

    public void  setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickLoginButton()
    {
        btnLogin.click();
    }



}
