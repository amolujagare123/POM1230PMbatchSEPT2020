package databaseTesting.clients;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Menu;
import util.DoLogin;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

import static utilities.DataUtil.getMyData;

public class AddClientTest extends DoLogin {


    @Test(dataProvider = "getData")
    public void addClientText(String clientName,String surname,String language,String add1,
                              String add2,String city,String state,String zip,String country,
                              String phone,String fax,String mobile,String email,String web,
                              String gender,String birthdate,String vat,String tax) throws ParseException, ClassNotFoundException, SQLException {


        ArrayList<String> expected = new ArrayList<>();

        expected.add(clientName);
        expected.add(surname);
        expected.add(language);
        expected.add(add1);
        expected.add(add2);
        expected.add(city);
        expected.add(state);
        expected.add(zip);
        expected.add(country);
        expected.add(phone);
        expected.add(fax);
        expected.add(mobile);
        expected.add(email);
        expected.add(web);
        expected.add(gender);
        expected.add(birthdate);
        expected.add(vat);
        expected.add(tax);


        System.out.println("Expecded List:\n"+expected);





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


        // 1 . loading a driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating connection

        String user= "root";
        String pass= "root";
        String url ="jdbc:mysql://localhost:3306/afternoonip";

        Connection con = DriverManager.getConnection(url,user,pass);

        //3. create statement

        Statement st = con.createStatement();

        // 4. execute query

        String sql = "select * from ip_clients where client_name='"+clientName+"'";

        ResultSet rs = st.executeQuery(sql);

        ArrayList<String> actual = new ArrayList<>();


        while (rs.next())
        {

            actual.add(rs.getString("client_name"));
            actual.add(rs.getString("client_surname"));
            actual.add(rs.getString("client_language"));
            actual.add(rs.getString("client_address_1"));
            actual.add(rs.getString("client_address_2"));
            actual.add(rs.getString("client_city"));
            actual.add(rs.getString("client_state"));
            actual.add(rs.getString("client_zip"));
            actual.add(rs.getString("client_country"));
            actual.add(rs.getString("client_phone"));
            actual.add(rs.getString("client_fax"));
            actual.add( rs.getString("client_mobile"));
            actual.add(rs.getString("client_email"));
            actual.add(rs.getString("client_web"));
            actual.add(rs.getString("client_gender"));
            actual.add(rs.getString("client_birthdate"));
            actual.add(rs.getString("client_vat_id"));
            actual.add( rs.getString("client_tax_code"));

        }


        System.out.println("actual list:\n"+actual);



    }

    @DataProvider
    public Object[][] getData() throws IOException {

        return getMyData("Data\\invoiceplane.xlsx","Sheet2",true);
    }
}
