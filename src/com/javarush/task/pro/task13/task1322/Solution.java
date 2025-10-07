package com.javarush.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        switch (countOfCorner) {
            case 3:
                return "Треугольник";
            case 4:
                return "Четырехугольник";
            case 5:
                return "Пятиугольник";
            case 6:
                return "Шестиугольник";
            case 7:
                return "Семиугольник";
            case 8:
                return "Восьмиугольник";
            default:
                return "Другая фигура";

//        }
//        String shape;
//        if (countOfCorner == 3) {
//            shape =
//        } else if (countOfCorner == 4) {
//            shape =
//        } else if (countOfCorner == 5) {
//            shape =
//        } else if (countOfCorner == 6) {
//            shape =
//        } else if (countOfCorner == 7) {
//            shape =
//        } else if (countOfCorner == 8) {
//            shape =
//        } else {
//            shape =
//        }
//        return shape;
        }
    }
}
