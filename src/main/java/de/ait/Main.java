package de.ait;

public class Main {
    public static void main(String[] args) {
        /*

        Задание 1

Можете дополнительно учесть остальные типы ветра из таблицы по ссылке

Пример работы метода:
getWindDescription(20, true) -> "Gusty Moderate Breeze with speed of 20 km"
getWindDescription(20, false) -> "Moderate Breeze with speed of 20 km"
getWindDescription(30, true) -> "Gusty Moderate Breeze with speed of 30 km"
getWindDescription(30, false) -> "Moderate Breeze with speed of 30 km"
Создайте тесты для методов.

         */


        System.out.println(WeatherTools.getWindDescription(20, true));
        System.out.println(WeatherTools.getWindDescription(30, true));
        System.out.println(WeatherTools.getWindDescription(20, false));
        System.out.println(WeatherTools.getWindDescription(30, false));
        System.out.println(WeatherTools.getWindDescription(1, true));
    }
}