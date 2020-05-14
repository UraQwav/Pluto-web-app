package jspComponents;

import java.util.Calendar;
import java.util.Date;

public class DateChouseJsp {
    protected String R = null;
    Calendar C;
    protected Date d = new Date();
    public DateChouseJsp(Calendar c) {
        this.C = c;
    }
    public Integer GetDate(){
        return ((Integer)C.get(Calendar.DATE));
    }
    public DateChouseJsp() {
        this.C = Calendar.getInstance();
    }
    public Integer GetHOUR() {
        return ((Integer)C.get(Calendar.HOUR_OF_DAY));
    }
    public Integer GetWeak(){
        return ((Integer)C.get(Calendar.WEEK_OF_MONTH));
    }
}
