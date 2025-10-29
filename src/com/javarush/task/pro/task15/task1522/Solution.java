package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        // создаем URL объект с путём к странице
//        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
//
//        // Cоздаём двустороннее соединение connection
//        URLConnection connection=url.openConnection();
//
//        // Получаем поток вывода output
//        try (OutputStream output=connection.getOutputStream();
////             PrintStream sender
//
//        // Выводим данные в ПОТОК ВЫВОДА output
////        output.write(1);
//
//        // Получаем поток ввода input
//        InputStream input=connection.getInputStream();
//
//        // читаем данные ИЗ ПОТОКА ВВОДА input
////        int data=input.read();
//    }
//}
