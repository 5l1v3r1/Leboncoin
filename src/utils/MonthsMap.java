package utils;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MonthsMap
{
    private static Map<String, Integer> monthsMap = new HashMap<String, Integer>();

    static
    {
        monthsMap.put("janvier", Calendar.JANUARY);
        monthsMap.put("f�vrier", Calendar.FEBRUARY);
        monthsMap.put("mars", Calendar.MARCH);
        monthsMap.put("avril", Calendar.APRIL);
        monthsMap.put("mai", Calendar.MAY);
        monthsMap.put("juin", Calendar.JUNE);
        monthsMap.put("juillet", Calendar.JULY);
        monthsMap.put("ao�t", Calendar.AUGUST);
        monthsMap.put("septembre", Calendar.SEPTEMBER);
        monthsMap.put("octobre", Calendar.OCTOBER);
        monthsMap.put("novembre", Calendar.NOVEMBER);
        monthsMap.put("d�cembre", Calendar.DECEMBER);
    }

    public static Integer getMonthId(String monthFR)
    {
        return monthsMap.get(monthFR);
    }
}
