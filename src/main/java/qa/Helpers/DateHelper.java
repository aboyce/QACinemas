package qa.Helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public static final String DATE_FORMAT = "dd/MM/yyyy";

    /**
     * Will return a valid Date object from a string.
     * @param dateString the date in the format 'dd/MM/yyyy'.
     * @return the create Date.
     */
    public static Date getDateFromString(String dateString){
        if(dateString == null) { return null; }
        try {
            return new SimpleDateFormat(DATE_FORMAT).parse(dateString);
        } catch (ParseException ex) {
            return null;
        }
    }
}
