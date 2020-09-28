package regression.Clients;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Menu;
import util.DoLogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import static utilities.DataUtil.getMyData;

public class AddClientDataProvidertest extends DoLogin {

    @Test (dataProvider = "getData")
    public void addClientText(String clientName,String surname,String language,
                              String add1,String add2,String city,String state,
                              String zip,String country,String phone,String fax,
                              String mobile,String email,String web,String gender,
                              String birthdate,String vat,String tax,String expected,
                              String xpathActual) throws ParseException {

        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver); // 18 fields

        addClient.setTxtClient(clientName);
        addClient.setTxtSurname(surname);
        addClient.setTxtLanguage(language);
        addClient.setTxtAdd1(add1);
        addClient.setTxtAdd2(add2);
        addClient.setTxtCity(city);
        addClient.setTxtState(state);
        addClient.setTxtZip(zip);
        addClient.setTxtCountry(country);
        addClient.setTxtPhone(phone);
        addClient.setTxtFax(fax);
        addClient.setTxtMobile(mobile);
        addClient.setTxtEmail(email);
        addClient.setTxtWeb(web);
        addClient.setTxtGender(gender);
        //addClient.setTxtBirthdate("12/12/2020");

        addClient.setTxtBirthdateJavascript(birthdate);
        addClient.setTxtVat(vat);
        addClient.setTxtTax(tax);
        addClient.btnSave();

        System.out.println(expected);

        String actual="";
        try {

            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"incorrect message");

    }

    @DataProvider
    public Object[][] getData() throws IOException {

        return getMyData("Data\\invoiceplane.xlsx","Sheet1",true);
    }
}
