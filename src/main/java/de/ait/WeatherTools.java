package de.ait;

public class WeatherTools {

    public static String getWindDescription(double speed, boolean isGusty){
        String result = "";
        if (speed<=1){result = "Calm";}
        if (speed>1&&speed<5){result = "Light Air";}
        if (speed>=6&&speed<11){result = "Light Breeze";}
        if (speed>=12&&speed<19){result = "Gentle Breeze";}
        if (speed>=20&&speed<28){result = "Moderate Breeze";}
        if (speed>=29&&speed<38){result = "Fresh Breeze";}
        //return ""+  (isGusty?"Gusty ":"")   + result + " with speed of " + speed + " km";
        return ""+  (isGusty?"Gusty ":"")   + result + " with speed of " + String.format("%.0f km",speed);

//        Можете дополнительно учесть остальные типы ветра из таблицы по ссылке
//    Пример работы метода:
//    getWindDescription(20, true) -> "Gusty Moderate Breeze with speed of 20 km"
//    getWindDescription(20, false) -> "Moderate Breeze with speed of 20 km"
//    getWindDescription(30, true) -> "Gusty Moderate Breeze with speed of 30 km"
//    getWindDescription(30, false) -> "Moderate Breeze with speed of 30 km"


        ///return "Moderate Breeze with speed of 20 km";
    }
}
