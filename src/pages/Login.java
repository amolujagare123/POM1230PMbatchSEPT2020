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
    WebElement txtUserName;

    @FindBy (id="password")
    WebElement txtPassword;

    @FindBy (xpath="//button[@type='submit']")
    WebElement btnLogin;

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
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
