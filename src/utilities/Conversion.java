package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String convertCountrty(String shortCountry)
    {
        String longFormCountry ="";


        switch (shortCountry)
        {
            case "IN" : longFormCountry="India"; break;
            case "AF" : longFormCountry="Afghanistan";break;
            case "AS" : longFormCountry="American Samoa";break;
            case "IO" : longFormCountry="British Indian Ocean Territory";break;
            case "CN" : longFormCountry="China";break;
            case "US" : longFormCountry= "United States";break;
        }

        return longFormCountry;
    }

    public static String ConvertGenderFormat(String shortGender)
    {
        String genderFullForm ="";

        switch (shortGender)
        {
            case "0" : genderFullForm="Male";break;
            case "1" : genderFullForm="Female";break;
            case "2" : genderFullForm="Other";break;
        }

        return genderFullForm;

    }


    public static String convertDate(String dateDb) throws ParseException {
        String convertedDate ="";

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateDb);

        convertedDate = new SimpleDateFormat("dd/MM/yyyy").format(date);

        return convertedDate;

    }

}
