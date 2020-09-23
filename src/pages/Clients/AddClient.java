package pages.Clients;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddClient {

    WebDriver driver;

    @FindBy(id="client_name")
    WebElement txtClient ;

    @FindBy (id="client_surname") WebElement txtSurname ;

    @FindBy (id="select2-client_language-container") WebElement dropdownLanguage ;

    @FindBy (id="client_address_1") WebElement txtAdd1 ;

    @FindBy (id="client_address_2") WebElement txtAdd2 ;

    @FindBy (id="client_city") WebElement txtCity ;


    public AddClient(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
         this.driver = driver;
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

    @FindBy (id="client_birthdate") WebElement txtBirthdate ;

    @FindBy (id="client_phone") WebElement txtPhoneNumber ;

    @FindBy (id="client_fax") WebElement txtFaxNumber ;

    @FindBy (id="client_mobile") WebElement txtMobileNumber ;

    @FindBy (id="client_email") WebElement txtEmailAddress ;

    @FindBy (id="client_web") WebElement txtWebAddress ;

    @FindBy (id="client_vat_id") WebElement txtVATID ;

    @FindBy (id="client_tax_code") WebElement txtTaxesCode ;

    @FindBy (xpath="//input[@type='search']") WebElement txtSearch;

    @FindBy (xpath="//button[@id='btn-submit']")
    WebElement btnSave ;


    public void btnSave()
    {
        btnSave.click();
    }



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
    	/*Select s = new Select(dropdownCountry);
    	s.selectByVisibleText("India");*/

        dropdownCountry.click();
        txtSearch.sendKeys(country);
        driver.findElement(By.xpath("//li[text()='"+country+"']")).click();

    	
    }

    public void setTxtLanguage(String language)
    {
        dropdownLanguage.click();
        txtSearch.sendKeys(language);
        driver.findElement(By.xpath("//li[contains(text(),'"+language+"')]")).click();
    }

    public void setTxtGender(String gender)
    {

    	/*Select s = new Select(dropdownGender);
    	s.selectByIndex(0);*/

        dropdownGender.click();
        //txtSearch.sendKeys(gender);

        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();

    }

    public void setTxtBirthdateJavascript(String birthdate) throws ParseException {

        Date bdate = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);

        String bDateStr = new SimpleDateFormat("MM/dd/yyyy").format(bdate);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+bDateStr+"')",txtBirthdate);

    }

    public void setTxtBirthdate(String birthdate) throws ParseException {
        txtBirthdate.click();

        String currDateStr = driver.findElement(By.className("datepicker-switch")).getText();
        Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDateStr);

        String setDateStr = birthdate;
        Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(setDateStr);

        int monthDiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1),
                new DateTime(setDate).withDayOfMonth(1)).getMonths();

        System.out.println(monthDiff);

        boolean isFututure=true;

        if(monthDiff<0)
        {
            isFututure =false;
            monthDiff = (-1) * monthDiff;
        }

        for(int i=0;i<monthDiff;i++)
        {
            if(isFututure)
                driver.findElement(By.xpath("//th[@class='next']")).click(); // next
            else
                driver.findElement(By.xpath("//th[@class='prev']")).click(); // previous
        }


    	String currDayStr = new SimpleDateFormat("dd").format(setDate);
        // 12/02/2020 ---> ddd -> 02 as string , lets convert this number ins tring into int

        int currDay = Integer.parseInt(currDayStr);

        driver.findElement(By.xpath("//td[text()='"+currDay+"' and @class='day']")).click();



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
