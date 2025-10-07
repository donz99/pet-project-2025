package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate=new GregorianCalendar(1993,6,1);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.MONDAY)
            return "понедельник";
        else if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.TUESDAY)
            return "вторник";
        else if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.WEDNESDAY)
            return "среда";
        else if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY)
            return "четверг";
        else if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY)
            return "пятница";
        else if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
            return "суббота";
        else if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
            return "воскресенье";
        else
        return null;
    }
}
