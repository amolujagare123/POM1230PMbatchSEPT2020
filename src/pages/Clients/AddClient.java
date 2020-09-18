package pages.Clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    @FindBy(id="client_name")
    WebElement txtClient ;

    @FindBy (id="client_surname") WebElement txtSurname ;

   // @FindBy (id="select2-client_language-container") WebElement txtLanguage ;

    @FindBy (id="client_address_1") WebElement txtAdd1 ;

    @FindBy (id="client_address_2") WebElement txtAdd2 ;

    @FindBy (id="client_city") WebElement txtCity ;


    public AddClient(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void setTxtClient(String client)
    {
        txtClient.sendKeys(client);
    }
    public void setTxtSurname(String surname)
    {
        txtSurname.sendKeys(surname);
    }
    public void setTxtAdd1(String add1)
    {
        txtAdd1.sendKeys(add1);
    }

    public void setTxtAdd2(String add2)
    {
        txtAdd2.sendKeys(add2);
    }
    public void setTxtCity(String city)
    {
        txtCity.sendKeys(city);
    }


    /*@FindBy (id="client_state") WebElement element ;

    @FindBy (id="client_zip") WebElement element ;

    @FindBy (id="select2-client_country-container") WebElement element ;

    @FindBy (id="select2-client_gender-container") WebElement element ;

    @FindBy (id="client_birthdate") WebElement element ;

    @FindBy (id="client_phone") WebElement element ;

    @FindBy (id="client_fax") WebElement element ;

    @FindBy (id="client_mobile") WebElement element ;

    @FindBy (id="client_email") WebElement element ;

    @FindBy (id="client_web") WebElement element ;

    @FindBy (id="client_vat_id") WebElement element ;

    @FindBy (id="client_vat_id") WebElement element ;*/




}
