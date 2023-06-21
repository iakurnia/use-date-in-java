package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateBasicFormat {

    public static void main(String[] args) {
        /**
         * 1.Use date di java
         * Implementing Date in Java is very simple, all you have to do is create an object from the Date class.
         *
         * output : Wed Jun 21 06:54:11 ICT 2023
         * it's the default format of the Date class which displays the day, month, date, hour, minute, second, time and year format. ICT there means IndoChina Time
         */
        Date date = new Date();
        System.out.println("Today : " + date);

        /**
         * 2.Change formate Date in Java
         * MM-dd-yyyy (01-08-2023)
         * MM/dd/yyyy (01/08/2023)
         * dd-MM-yyyy (08-01-2023)
         * dd MMMM yyyy (08 January 2023)
         * dd MMM yyyy (08 January 2023)
         * Then we have to set the date format to be displayed. To set the date format in Java, another class is needed, namely SimpleDateFormat.
         */
        System.out.println("Formate MM-dd-yyyy : "+formateDateToString(date,"MM-dd-yyyy"));
        System.out.println("Formate MM/dd/yyyy : "+formateDateToString(date,"MM/dd/yyyy"));
        System.out.println("Formate dd-MM-yyyy : "+formateDateToString(date,"dd-MM-yyyy"));
        System.out.println("Formate dd MMMM yyyy : "+formateDateToString(date,"dd MMMM yyyy"));
        System.out.println("Formate dd MMM yyyy : "+formateDateToString(date,"dd MMM yyyy"));


        /**
         * 3.Displays Later Date and Previous Day
         * Use Calendar
         */

        System.out.println("Today : " + formateDateToString(date,"dd-MM-yyyy"));
        // day
        System.out.println("14 Days Before : " + changeDateBeforeAfter(Calendar.DATE,-14));
        System.out.println("14 Days After : " + changeDateBeforeAfter(Calendar.DATE,14));

        // month
        System.out.println("8 Months Before : " + changeDateBeforeAfter(Calendar.MONTH,-8));
        System.out.println("8 Months After : " + changeDateBeforeAfter(Calendar.MONTH,8));

        // year
        System.out.println("11 Years Before : " + changeDateBeforeAfter(Calendar.YEAR,-11));
        System.out.println("11 Years After : " + changeDateBeforeAfter(Calendar.YEAR,11));


    }

    public static String formateDateToString(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static String changeDateBeforeAfter(int changeFormat,int value){
        Calendar cal = Calendar.getInstance();
        cal.add(changeFormat,value);
        Date dt=cal.getTime();
        return formateDateToString(dt,"dd-MM-yyyy");
    }

}
