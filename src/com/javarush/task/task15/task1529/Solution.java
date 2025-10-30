package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            String str1=reader.readLine();
            if (str1.equals("helicopter")){
                result=new Helicopter();
            }
            else if (str1.equals("plane")){
                int i = Integer.parseInt(reader.readLine());
                result = new Plane(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //add your code here - добавьте код тут
    }
}
