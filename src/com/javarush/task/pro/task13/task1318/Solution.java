package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
//        Month month=Month.month;
        int index=month.ordinal();
        if (index==11){
            return Month.JANUARY;
        }
        else {Month nextMonth =Month.values()[index+1];
            return nextMonth;}


    }
}
