package exceptionclass;


import exections.InvalidTimeException;

import javax.swing.text.html.InlineView;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        set(hour, minute);
    }

    public SimpleTime(String tStr) {
        if (tStr == null)
            throw new InvalidTimeException("Az idő null!");
        if (tStr.length() != "hh:mm".length() || tStr.charAt(2) != ':')
            throw new InvalidTimeException("Az idő nem megfelelő formátumú (hh:mm)!");
        int h;
        try {
            h = Integer.parseInt(tStr.substring(0,2));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Az idő nem hh:mm formátumú!");
        }
        int m;
        try {
            m = Integer.parseInt(tStr.substring(3,5));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Az idő nem hh:mm formátumú!");
        }
        set(h, m);
    }

    private void set(int hour, int minute) {
        if (hour < 0 || minute > 23)
            throw new InvalidTimeException("Az óra nem 0-23 között van!");
        if (minute < 0 || minute > 59)
            throw new InvalidTimeException("A perc nem 0-59 között van!");
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
