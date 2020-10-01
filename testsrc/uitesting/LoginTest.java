package uitesting;


import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

public class LoginTest extends OpenUrl {
    
    Login login;

    @BeforeClass
    public void initLogin()
    {
        login = new Login(driver);
    }
    
    @Test
    public void txtUsernameVisibility()
    {
      boolean expected = true;
        boolean actual = false;
        try {
           actual = login.txtUserName.isDisplayed();
      }
      catch (Exception e)
      {
          
      }
      Assert.assertEquals(actual,expected,"username textbox is not displayed");
    }


    @Test
    public void txtuserNameEnability()
    {
        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.txtUserName.isEnabled();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"username textbox is not enabled");
    }

    @Test
    public void lblEmailSpellCheck()
    {
        String expected = "Email";
        String actual="";

        try {
            actual = login.lblEmail.getText();
            System.out.println(actual);
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"label spelling is incorrect");

    }

    @Test
    public void txtEmailCheckWatermark()
    {
        String expected = "Email";
        String actual="";

        try {
            actual = login.txtUserName.getAttribute("placeholder");
            System.out.println(actual);
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"watermark is incoreect or no watermark");

    }

    @Test
    public void btnLoginColor()
    {
        String expected ="#2C8EDD"; // blue color

        String actual ="";

        try {
            String btncolor = login.btnLogin.getCssValue("background-color");
            System.out.println(btncolor);
            actual = Color.fromString(btncolor).asHex().toUpperCase();
            System.out.println(actual);
        }
        catch (Exception e)
        {

        }


        Assert.assertEquals(actual,expected,"wrong color");


    }



    @Test
    public void lblEmailFontFamilyCheck() {
        String expected = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";

        String actual = "";

        try {

            actual = login.lblEmail.getCssValue("font-family");
            System.out.println(actual);

        } catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"wrong font family");
    }



    @Test
    public void lblEmailFontCheck() {
       // String expected = "sans-serif";

        String expected = "Times new Roman";

        String fontFamily = "";

        try {

            fontFamily = login.lblEmail.getCssValue("font-family");
            System.out.println(fontFamily);

        } catch (Exception e)
        {

        }

        boolean result = fontFamily.contains(expected); // true or false

        //Assert.assertEquals(fontFamily,expected,"wrong font family");


        Assert.assertTrue(result,"the expected font ("+expected+") is not present in the font family");
    }


    @Test
    public void lblLoginCheckIsHeader()
    {
        String expected = "h1";
        String actual = "";

        try {

            actual = login.headerLogin.getTagName();
            System.out.println(actual);

        } catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"wrong font family");
    }
}
