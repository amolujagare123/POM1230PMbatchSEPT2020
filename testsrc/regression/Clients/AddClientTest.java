package regression.Clients;

import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Menu;
import util.DoLogin;

public class AddClientTest  extends DoLogin {

    @Test
    public void addClientText()
    {

        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);
        addClient.setTxtClient("Deepak");
        addClient.setTxtSurname("xyz");
        addClient.setTxtAdd1("siddhivinayak apt");
        addClient.setTxtAdd2("katraj");
        addClient.setTxtCity("Pune");


    }
}
