package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getPropertiesObject() throws IOException {
        FileInputStream file = new FileInputStream("Resources\\invioceplane.properties");
        Properties prop = new Properties();
        prop.load(file);
        return prop;
    }

    public static String getUrl() throws IOException {

        return getPropertiesObject().getProperty("url");
    }

    public static String getUsername() throws IOException {
        return  getPropertiesObject().getProperty("user");
    }

    public static String getPassword() throws IOException {
        return  getPropertiesObject().getProperty("pass");
    }


    public static String getDbServer() throws IOException {
        return  getPropertiesObject().getProperty("dbServer");
    }



    public static String getDbUser() throws IOException {
        return  getPropertiesObject().getProperty("dbUser");
    }



    public static String getDbPassword() throws IOException {
        return  getPropertiesObject().getProperty("dbPassword");
    }

    public static String getDbName() throws IOException {
        return  getPropertiesObject().getProperty("dbName");
    }

}
