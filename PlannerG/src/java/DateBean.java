/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jopi79
 */
@Named(value = "dateBean")
@RequestScoped
public class DateBean {

    public Date getToday() {
        return new Date();
    }

    public String getTodayFormatted() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String text = zonedDateTime.format(formatter);
        DayOfWeek dayOfWeek = zonedDateTime.getDayOfWeek();
        return dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("PL")) + ", " + text;
    }

    public String getDayOfWeek(DayOfWeek dayOfWeek) {
        return dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public String getDayOfWeek(int numOfDayOfWeek) {
        DayOfWeek dayOfWeek = DayOfWeek.values()[numOfDayOfWeek - 1];
        return dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public String getFooter(int numOfDayOfWeek) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DayOfWeek dayOfWeek = zonedDateTime.getDayOfWeek();
        if (numOfDayOfWeek == dayOfWeek.getValue()) {
            return "To dzisiaj!";
        } else {
            return "";
        }
    }

    public String getMonday() {
        return DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public String getTuesday() {
        return DayOfWeek.TUESDAY.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public String getWednesday() {
        return DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public String getThursday() {
        return DayOfWeek.THURSDAY.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public String getSaturday() {
        return DayOfWeek.SATURDAY.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public String getSunday() {
        return DayOfWeek.SUNDAY.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public String getFriday() {
        return DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL, new Locale("PL"));
    }

    public DateBean() {
    }

}
