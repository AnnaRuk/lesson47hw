package de.ait;

public class WeatherTools {

    public static String getWindDescription(double speed, boolean isGusty){
        String result = "";
        if (speed<=1){result = "Calm";}
        if (speed>1&&speed<=5){result = "Light Air";}
        if (speed>=6&&speed<=11){result = "Light Breeze";}
        if (speed>=12&&speed<=19){result = "Gentle Breeze";}
        if (speed>=20&&speed<=28){result = "Moderate Breeze";}
        if (speed>=29&&speed<=38){result = "Fresh Breeze";}
        if (speed>=38&&speed<=49){result = "Strong Breeze";}
        if (speed>=50&&speed<=61){result = "Near Gale";}
        if (speed>=62&&speed<=74){result = "Gale";}
        if (speed>=75&&speed<=88){result = "Strong Gale";}
        if (speed>=89&&speed<=102){result = "Storm";}
        if (speed>=103&&speed<=117){result = "Violent Storm";}
        if (speed>=118){result = "Hurricane";}


        return ""+  (isGusty?"Gusty ":"")   + result + " with speed of " + String.format("%.0f km",speed);

    }
}
