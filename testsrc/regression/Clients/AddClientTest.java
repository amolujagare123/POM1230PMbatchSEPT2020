package regression.Clients;

import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Menu;
import util.DoLogin;

import java.text.ParseException;

public class AddClientTest  extends DoLogin {

    @Test
    public void addClientText() throws ParseException {

        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setTxtClient("Deepak");
        addClient.setTxtSurname("xyz");
        addClient.setTxtLanguage("English");
        addClient.setTxtAdd1("siddhivinayak apt");
        addClient.setTxtAdd2("katraj");
        addClient.setTxtCity("Pune");
        addClient.setTxtState("maharastra");
        addClient.setTxtZip("8989");
        addClient.setTxtCountry("Iceland");
        addClient.setTxtPhone("8989");
        addClient.setTxtFax("898989");
        addClient.setTxtMobile("7878909");
        addClient.setTxtEmail("a@b.com");
        addClient.setTxtWeb("www.abc.com");
        addClient.setTxtGender("Female");
        addClient.setTxtBirthdate("12/12/2020");


        addClient.setTxtVat("5656");
        addClient.setTxtTax("090");

        addClient.btnSave();





    }
}
