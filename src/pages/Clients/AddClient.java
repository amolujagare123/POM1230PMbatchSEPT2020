package pages.Clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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



    @FindBy (id="client_state") WebElement txtClientName ;

    @FindBy (id="client_zip") WebElement txtZipCode ;

    @FindBy (id="select2-client_country-container") WebElement dropdownCountry ;

    @FindBy (id="select2-client_gender-container") WebElement dropdownGender ;

    @FindBy (id="client_birthdate") WebElement calenderBirthdate ;

    @FindBy (id="client_phone") WebElement txtPhoneNumber ;

    @FindBy (id="client_fax") WebElement txtFaxNumber ;

    @FindBy (id="client_mobile") WebElement txtMobileNumber ;

    @FindBy (id="client_email") WebElement txtEmailAddress ;

    @FindBy (id="client_web") WebElement txtWebAddress ;

    @FindBy (id="client_vat_id") WebElement txtVATID ;

    @FindBy (id="client_tax_code") WebElement txtTaxesCode ;

    public void setTxtState(String state)
    {
    	txtClientName.sendKeys(state);
    }

    public void setTxtZip(String zip)
    {
    	txtZipCode.sendKeys(zip);
    }
    public void setTxtCountry(String country)
    {
    	Select s = new Select(dropdownCountry);
    	s.selectByVisibleText("India");
    	
    }

    public void setTxtGender(String gender)
    {

    	Select s = new Select(dropdownGender);
    	s.selectByIndex(0);
    }

    public void setTxtBirthdate(String birthdate)
    {
    	
    	
    	
    }

    public void setTxtPhone(String phnone)
    {
    	txtPhoneNumber.sendKeys(phnone);
    }

    public void setTxtFax(String fax)
    {
    	txtFaxNumber.sendKeys(fax);
    }

    public void setTxtMobile(String mobile)
    {
    	txtMobileNumber.sendKeys(mobile);
    }

    public void setTxtEmail(String email)
    {
    	txtEmailAddress.sendKeys(email);
    }

    public void setTxtWeb(String web)
    {
    	txtWebAddress.sendKeys(web);
    }

    public void setTxtVat(String vat)
    {
    	txtVATID.sendKeys(vat);
    }

    public void setTxtTax(String tax)
    {
    	txtTaxesCode.sendKeys(tax);
    }

}
