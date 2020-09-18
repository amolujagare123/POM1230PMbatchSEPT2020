package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    @FindBy(xpath="//a[contains(text(),'Dashboard')]")
    WebElement dashBoard ;

    @FindBy (xpath="//span[contains(text(),'Clients')]")
    WebElement clients ;

    @FindBy (xpath="//a[contains(text(),'Add Client')]")
    WebElement addClient ;

    @FindBy (xpath="//a[contains(text(),'View Clients')]")
    WebElement viewClient ;

    @FindBy (xpath="//span[contains(text(),'Quotes')]")
    WebElement quotes ;

    @FindBy (xpath="//a[contains(text(),'Create Quote')]")
    WebElement createQuote ;

    @FindBy (xpath="//a[contains(text(),'View Quotes')]")
    WebElement viewQuotes ;

    public  Menu(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickDashboard()
    {
        dashBoard.click();
    }

// ------------- menu clients -------------
    public void clickAddClient()
    {
        clients.click();
        addClient.click();
    }

    public void clikviewClient()
    {
        clients.click();
        viewClient.click();
    }

// ------------- menu Quotes -------------

    public void clickCreateQuotes()
    {
        quotes.click();
        createQuote.click();
    }

    public void clickViewClients()
    {
        quotes.click();
        viewQuotes.click();
    }

}
