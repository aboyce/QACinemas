package qa.Helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public static final String DATE_FORMAT = "dd/MM/yyyy";

    public static Date getDateOfBirth(String dateString){
        if(dateString == null) { return null; }
        try {
            return new SimpleDateFormat(DATE_FORMAT).parse(dateString);
        } catch (ParseException ex) {
            return null;
        }
    }
}
